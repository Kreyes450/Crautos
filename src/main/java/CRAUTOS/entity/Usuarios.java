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

@Entity
@Table(name = "usuario")
public class Usuarios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long usuario_id;
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private String correo_electronico;
    private long moto_id;
    private long carro_id;
    //en caso de error cambiar los moto_id y carro_id a int.

//    @ManyToOne
//    @JoinColumn(name = "motos")
//    private Motos moto;
//                                  tengo que descomentar una vez este todo el codigo de moto y carro!!!
//                                  tambien hacerle getter y setter a esos objetos!!!
//    @ManyToOne
//    @JoinColumn(name = "carros")
//    private Carros carro;
    
    
    public long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(long usuario_id) {
        this.usuario_id = usuario_id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public long getMoto_id() {
        return moto_id;
    }

    public void setMoto_id(long moto_id) {
        this.moto_id = moto_id;
    }

    public long getCarro_id() {
        return carro_id;
    }

    public void setCarro_id(long carro_id) {
        this.carro_id = carro_id;
    }
}
