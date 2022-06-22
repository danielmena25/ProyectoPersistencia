/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;
import java.util.Scanner;
/**
 * @author Carlos Escudero
 * Fecha 21 de junio
 */
public class BaseDatos {
    void menuArhivoTexto(){
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("Agregar     1");
            System.out.println("Eliminar    2");
            System.out.println("Listar      3");
            System.out.println("Salir       4");
            op = sc.nextInt();
            switch(op){
                case 1: AgregarClienteDB(); break;
                case 2: EliminarClienteDB(); break;
                case 3: ListarClienteDB(); break;
            }
        }
    }
    private void AgregarClienteDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private void EliminarClienteDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private void ListarClienteDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
