/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.io.Serializable;
import java.sql.Date;
/**
 *
 * @author Carlos Escudero
 * Fecha 21 de junio
 */
public class Cliente implements Serializable{
    int id;
    String nombre;
    String fecNac;
    public Cliente() {
    }
    public Cliente(int id, String nombre, String fecNac) {
        this.id = id;
        this.nombre = nombre;
        this.fecNac = fecNac;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getFecNac() {
        return fecNac;
    }
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", fecNac=" + fecNac + '}';
    }
}
