/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Danilo Jaramillo
 * FechaÑ 15 de junio
 */
public class DataSet {
    /**
     * @author Carlos Escudero
     * Fecha 21 de junio
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArchivoTexto objArchivoTexto = new ArchivoTexto();
        int op=0;
        while (op<4){
            System.out.println("Texto      1");
            System.out.println("Binario    2");
            System.out.println("Data Base  3");
            System.out.println("Salir      4");
            op = sc.nextInt();
            switch(op){
                case 1: objArchivoTexto.menuArhivoTexto(); break;
                //case 2: menuBin(); break;
                //case 3: menuDB(); break;       
            }
        }
    }
}
