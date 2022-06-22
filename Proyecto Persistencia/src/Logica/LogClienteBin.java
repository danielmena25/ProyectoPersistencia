/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Archivos.ClienteBin;
import Clases.Cliente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
/**
 * @author Carlos Escudero
 * Fecha 21 de junio
 */
public class LogClienteBin {
    ClienteBin objClienteBin = new ClienteBin();
    public boolean ValidarId(Cliente objCliente) throws IOException {
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        // valida si el codigo es correcto
        if (objCliente.getId() > 0){
            // agregar al archvio texto  
            ArrayClientes.add(objCliente);
            return objClienteBin.GrabarClienteBin(ArrayClientes);
        }
        return false;
    }
    public void ListarClientes(ArrayList<Cliente> ArrayClientes) throws IOException, FileNotFoundException, ClassNotFoundException{
        objClienteBin.ImportarClienteBin(ArrayClientes);
    }
}
