/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;
import Clases.Cliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
  * @author Carlos Escudero
 *  Fecha 21 de junio
 */
public class ClienteTxt {
    public boolean AgregarCliente(Cliente objCliente) throws IOException{
       File f = new File("Cliente.txt");
       FileWriter fw = new FileWriter(f,false);
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write(Integer.toString(objCliente.getId())+",");
       bw.write(objCliente.getNombre()+",");
       bw.write(String.valueOf(objCliente.getFecNac())+"\n");
       bw.close();
       fw.close();
       return true;
    }
     public  ArrayList<Cliente>
            LeerCliente(ArrayList<Cliente> ArrayClientes){        
        File f = new File("cliente.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                     Cliente Objtmp = new Cliente(
                             Integer.valueOf(st.nextToken()),
                             st.nextToken(), //nombres
                             st.nextToken()
                     );                     
                     ArrayClientes.add(Objtmp);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayClientes;
    }
}
