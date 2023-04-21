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

@Entity
@Table(name = "noticias")
public class Noticias implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long noticia_id;
    private String fecha_noticia;
    private String nombre_noticia;
    private String cuerpo_noticia;

    public long getNoticia_id() {
        return noticia_id;
    }

    public void setNoticia_id(long noticia_id) {
        this.noticia_id = noticia_id;
    }

    public String getFecha_noticia() {
        return fecha_noticia;
    }

    public void setFecha_noticia(String fecha_noticia) {
        this.fecha_noticia = fecha_noticia;
    }

    public String getNombre_noticia() {
        return nombre_noticia;
    }

    public void setNombre_noticia(String nombre_noticia) {
        this.nombre_noticia = nombre_noticia;
    }

    public String getCuerpo_noticia() {
        return cuerpo_noticia;
    }

    public void setCuerpo_noticia(String cuerpo_noticia) {
        this.cuerpo_noticia = cuerpo_noticia;
    }

}
