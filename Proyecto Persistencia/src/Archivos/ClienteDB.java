/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;
import Clases.Cliente;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author Carlos Escudero
 * Fecha 21 de junio
 */
public class ClienteDB {
    DATConexion con = new DATConexion();
    ResultSet rs;
    PreparedStatement ps = null;
    public boolean InsertarClienteDB(Cliente objCliente) {
        String sql = "INSERT INTO Cliente (nombre, fecNac ) "
                + "VALUES (?,?)";
        try {
            ps = con.AbrirConexion().prepareStatement(sql);
            //ps.setInt(1, objCliente.getId());
            ps.setString(1, objCliente.getNombre());
            ps.setString(2, objCliente.getFecNac());
            ps.execute();
            //System.out.println("Cliente insertado");
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(3);
            }
        } 
    }
    public ResultSet RecuperarCliente() throws ClassNotFoundException, SQLException {
        java.sql.Statement st = con.AbrirConexion().createStatement();
        String sentencia = "SELECT * FROM Cliente";
        rs = st.executeQuery(sentencia);
        return rs;
    }
}
