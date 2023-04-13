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
 * @author roleongu
 */
/*patron decorador le agrega caracteristicas en la clase, */

 /*

CREATE TABLE `motos`
  (
     `moto_id`     INT(11) NOT NULL auto_increment,
     `modelo`      VARCHAR(11) NOT NULL,
     `cilindraje`  INT(50) NOT NULL,
     `color`       VARCHAR(30) NOT NULL,
     `tipo`        VARCHAR(25) NOT NULL,
     `transmision` VARCHAR(40) NOT NULL,
     `costo`       INT(50) NOT NULL,
	 `usuario_moto_id` int(11) NOT NULL, 
     PRIMARY KEY(moto_id,`usuario_moto_id`),
	 KEY `fk_motos_usuarios_idx` (`usuario_moto_id`),  
     CONSTRAINT `fk_motos_usuarios_idx` FOREIGN KEY (`usuario_moto_id`) REFERENCES `usuario` (`usuario_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
  )ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;*/

@Entity
@Table(name = "motos")

public class Moto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long moto_id;
    private String modelo;
    private String cilindraje;
    private String color;
    private String tipo;
    private String transmision;
    private String costo;
  

    @ManyToOne
    @JoinColumn(name = "usuario_moto_id")
    private Usuario usuario;

    public long getMoto_id() {
        return moto_id;
    }

    public void setMoto_id(long moto_id) {
        this.moto_id = moto_id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
