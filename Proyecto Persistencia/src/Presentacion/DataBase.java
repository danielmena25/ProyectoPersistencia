/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;
import Clases.Cliente;
import Logica.LogClienteDB;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *  @author Carlos Escudero
 *  Fecha 21 de junio
 */
public class DataBase {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        LogClienteDB objLogClienteDB = new LogClienteDB();
        //entrada
        ArrayClientes.add(new Cliente(1,"Danilo","05/2020"));
        ArrayClientes.add(new Cliente(2,"Juan","05/2020"));
        ArrayClientes.add(new Cliente(3,"pedro","05/2020"));
        objLogClienteDB.InsertarClientes(ArrayClientes);
        //limpiando arrayList
        ArrayClientes = new ArrayList<Cliente>();
        ArrayClientes.removeAll(ArrayClientes);
        objLogClienteDB.RecuperarClientes(ArrayClientes);
        for (Cliente objCliente: ArrayClientes)
            System.out.println(objCliente.toString());
    }
}
