/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author Carlos Escudero
 * Fecha 21 de junio
 */
public class DATConexion {
    //Conectarse a la BDD
    public Connection con;
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/pa202210";
        System.out.println("llego");
        Class.forName(driver);
        return DriverManager.getConnection(url, "root","");
    }
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException {
        con = getConnection();
        return con;
    }
    public void CerrarConexion() throws SQLException {
        con.close();
    }
}
