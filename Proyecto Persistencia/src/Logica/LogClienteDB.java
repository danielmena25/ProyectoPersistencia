/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Archivos.ClienteDB;
import Clases.Cliente;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * @author Carlos Escudero
 * Fecha 21 de junio
 */
public class LogClienteDB {
    ClienteDB objClienteDB = new ClienteDB();
    public void InsertarClientes(ArrayList<Cliente> ArrayClientes) {
        for(Cliente objCliente:ArrayClientes)
              objClienteDB.InsertarClienteDB(objCliente);
    }
    public void RecuperarClientes(ArrayList<Cliente> ArrayClientes) throws ClassNotFoundException, SQLException {
        ResultSet rs = objClienteDB.RecuperarCliente();
        ResultSetMetaData rm = rs.getMetaData();
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columnas = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columnas.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) {
            Cliente objAux = new Cliente();
            for (String columnName : columnas) {
                String value = rs.getString(columnName);
                if (columnName.equals("id")) {
                    objAux.setId(Integer.parseInt(value));
                }
                if (columnName.equals("nombre")) {
                    objAux.setNombre(value);
                }
                if (columnName.equals("fecNac")) {
                    objAux.setFecNac(value);
                }
            }
            ArrayClientes.add(objAux);
        }
        ///return ArrayClientes;
    }
}
