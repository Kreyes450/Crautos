/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;


/**
 *
 * @author Kenneth
 */
 @Entity
@Table(name = "comentarios")
public class Comentarios implements Serializable{
 
@Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long comentarios_id;     
     private String fecha_comentario;
     private String nombre_comentario;
     private String cuerpo_comentario;
     private int usuario_comentarios_id;
     
     //@ManyToOne
     //@JoinColumn(name = "usuario_comentarios_id")
     //private Usuario usuario;

    public long getComentarios_id() {
        return comentarios_id;
    }

    public void setComentarios_id(long comentarios_id) {
        this.comentarios_id = comentarios_id;
    }

    public String getFecha_comentario() {
        return fecha_comentario;
    }

    public void setFecha_comentario(String fecha_comentario) {
        this.fecha_comentario = fecha_comentario;
    }

    public String getNombre_comentario() {
        return nombre_comentario;
    }

    public void setNombre_comentario(String nombre_comentario) {
        this.nombre_comentario = nombre_comentario;
    }

    public String getCuerpo_comentario() {
        return cuerpo_comentario;
    }

    public void setCuerpo_comentario(String cuerpo_comentario) {
        this.cuerpo_comentario = cuerpo_comentario;
    }

    public int getUsuario_comentarios_id() {
       return usuario_comentarios_id;
    }

    public void setUsuario_comentarios_id(int usuario_comentarios_id) {
        this.usuario_comentarios_id = usuario_comentarios_id;
    }
   
 
 }
   
    
