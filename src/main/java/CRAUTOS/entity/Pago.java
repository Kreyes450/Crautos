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
@Table(name = "pago")
public class Pago implements Serializable{
 
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long pago_id;     
     private String nombre;
     private String apellido;
     private String numero_de_targeta;
     private String fecha_de_vencimiento;
     private String codigo;
     private int usuario_id;
     private int publicidad_id;

    public long getPago_id() {
        return pago_id;
    }

    public void setPago_id(long pago_id) {
        this.pago_id = pago_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero_de_targeta() {
        return numero_de_targeta;
    }

    public void setNumero_de_targeta(String numero_de_targeta) {
        this.numero_de_targeta = numero_de_targeta;
    }

    public String getFecha_de_vencimiento() {
        return fecha_de_vencimiento;
    }

    public void setFecha_de_vencimiento(String fecha_de_vencimiento) {
        this.fecha_de_vencimiento = fecha_de_vencimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getPublicidad_id() {
        return publicidad_id;
    }

    public void setPublicidad_id(int publicidad_id) {
        this.publicidad_id = publicidad_id;
    }
 }
   