/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Archivos.ClienteTxt;
import Clases.Cliente;
import java.io.IOException;
import java.util.ArrayList;
/**
 * @author Carlos Escudero
 * Fecha 21 de junio
 */
public class LogClienteTxt {
    ClienteTxt objClienteTxt = new ClienteTxt();
    public boolean ValidarId(Cliente objCliente) throws IOException {
        // valida si el codigo es correcto
        if (objCliente.getId() > 0){
            // agregar al archvio texto            
            return objClienteTxt.AgregarCliente(objCliente);
        }
        return false;
    }
    public void ListarClientes(ArrayList<Cliente> ArrayClientes){
        objClienteTxt.LeerCliente(ArrayClientes);
    
    }
}
