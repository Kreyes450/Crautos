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
 * @author roleongu
 */
/*patron decorador le agrega caracteristicas en la clase, */
@Entity
@Table(name = "carro")
public class Carro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Carro_ID;

    public long getCarro_ID() {
        return Carro_ID;
    }

    public void setCarro_ID(long Carro_ID) {
        this.Carro_ID = Carro_ID;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String Costo) {
        this.Costo = Costo;
    }
    private String modelo;
    private String Costo;
    
    /*
    @ManyToOne
    @JoinColumn(name= "Carro_ID")
    private Carro carro;
*/
    
    
    
}
