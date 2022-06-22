/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;
import Clases.Cliente;
import Logica.LogClienteTxt;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Scanner;
/**
 * @author Carlos Escudero
 * Fecha 21 de junio
 */
public class ArchivoTexto {
    static LogClienteTxt objLogClienteTxt = new LogClienteTxt();
    public static void main(String[] args) throws IOException {
        AgregarClienteTxt();
        ListarClientes();
    }
    void menuArhivoTexto() throws IOException{
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("Agregar     1");
            System.out.println("Eliminar    2");
            System.out.println("Listar      3");
            System.out.println("Salir       4");
            op = sc.nextInt();
            switch(op){
                case 1: AgregarClienteTxt(); break;
                case 2: EliminarClienteTxt(); break;
                case 3: ListarClientes(); break;
            }
        }
    }
    static private void AgregarClienteTxt() throws IOException {
        LogClienteTxt objLogClienteTxt = new LogClienteTxt();
        Cliente objCliente = new Cliente();
        // entrada
        objCliente.setId(1);
        objCliente.setNombre("Danilo");
        objCliente.setFecNac("06122022");
        if (objLogClienteTxt.ValidarId(objCliente))
            System.out.println("cliente agregado");
        else
            System.out.println("codigo cliente no valido");
    }
    private void EliminarClienteTxt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    static private void ListarClientes() {
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        objLogClienteTxt.ListarClientes(ArrayClientes);
        for (Cliente tmpCliente : ArrayClientes)
            System.out.println(tmpCliente.toString());
    }
}
