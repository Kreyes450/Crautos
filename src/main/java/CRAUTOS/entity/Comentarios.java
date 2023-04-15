/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
     
     @ManyToOne
     @JoinColumn(name = "usuario_comentarios_id")
     private Usuario usuario_comentarios_id;

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

    public Usuario getUsuario_comentarios_id() {
        return usuario_comentarios_id;
    }

    public void setUsuario_comentarios_id(Usuario usuario_comentarios_id) {
        this.usuario_comentarios_id = usuario_comentarios_id;
    }
    
    
 }
   
    
