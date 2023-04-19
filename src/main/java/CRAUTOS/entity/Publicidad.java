/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
/**
 *
 * @author Kenneth
 */
  
@Entity
@Table(name = "publicidad")
public class Publicidad implements Serializable{
 
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long publicidad_id;     
     private String nombre_paquete;
     private String descricion_paquete;
     private int precio_paquete;

    public long getPublicidad_id() {
        return publicidad_id;
    }

    public void setPublicidad_id(long publicidad_id) {
        this.publicidad_id = publicidad_id;
    }

    public String getNombre_paquete() {
        return nombre_paquete;
    }

    public void setNombre_paquete(String nombre_paquete) {
        this.nombre_paquete = nombre_paquete;
    }

    public String getDescricion_paquete() {
        return descricion_paquete;
    }

    public void setDescricion_paquete(String descricion_paquete) {
        this.descricion_paquete = descricion_paquete;
    }

    public int getPrecio_paquete() {
        return precio_paquete;
    }

    public void setPrecio_paquete(int precio_paquete) {
        this.precio_paquete = precio_paquete;
    }
}