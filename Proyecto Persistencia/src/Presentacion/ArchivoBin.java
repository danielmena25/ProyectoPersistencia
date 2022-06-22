/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;
import Clases.Cliente;
import Logica.LogClienteBin;
import static Presentacion.ArchivoTexto.objLogClienteTxt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Carlos Escudero
 * Fecha 21 de junio
 */
public class ArchivoBin {
    static LogClienteBin objLogClienteBin = new LogClienteBin();
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        AgregarClienteBin();
        ListarClienteBin();
    }
    void menuArhivoTexto() throws IOException, FileNotFoundException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("Agregar     1");
            System.out.println("Eliminar    2");
            System.out.println("Listar      3");
            System.out.println("Salir       4");
            op = sc.nextInt();
            switch(op){
                case 1: AgregarClienteBin(); break;
                case 2: EliminarClienteBin(); break;
                case 3: ListarClienteBin(); break;
            }
        }
    }
    static private void AgregarClienteBin() throws IOException {
        Cliente objCliente = new Cliente();
        // entrada
        objCliente.setId(5);
        objCliente.setNombre("Francisco");
        objCliente.setFecNac("07062200");
        if (objLogClienteBin.ValidarId(objCliente))
            System.out.println("cliente agregado");
        else
            System.out.println("codigo cliente no valido");
    
    }
    private void EliminarClienteBin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    static private void ListarClienteBin() throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        objLogClienteBin.ListarClientes(ArrayClientes);
        for (Cliente tmpCliente : ArrayClientes)
            System.out.println(tmpCliente.toString());
    }
}
