/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pago_id;
    private String nombre;
    private String apellido;
    private int numero_de_tarjeta;
    private String fecha_de_vencimiento;
    private int codigo;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario_id;
    
    @ManyToOne
    @JoinColumn(name = "publicidad_id")
    private Publicidad publicidad_id;

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

    public int getNumero_de_tarjeta() {
        return numero_de_tarjeta;
    }

    public void setNumero_de_tarjeta(int numero_de_tarjeta) {
        this.numero_de_tarjeta = numero_de_tarjeta;
    }

    public String getFecha_de_vencimiento() {
        return fecha_de_vencimiento;
    }

    public void setFecha_de_vencimiento(String fecha_de_vencimiento) {
        this.fecha_de_vencimiento = fecha_de_vencimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Publicidad getPublicidad_id() {
        return publicidad_id;
    }

    public void setPublicidad_id(Publicidad publicidad_id) {
        this.publicidad_id = publicidad_id;
    }
    
}
