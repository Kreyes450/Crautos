/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.entity;

import CRAUTOS.service.UserService;
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

CREATE TABLE `carros`
  (
     `carro_id`              INT(11) NOT NULL auto_increment,
     `modelo`                VARCHAR(30) NOT NULL,
     `cilindraje`            INT(50) NOT NULL,
     `tipo`                  VARCHAR(30) NOT NULL,
     `costo`                 INT(50) NOT NULL,
     `color`                 VARCHAR(30) NOT NULL,
     `sistema_de_frenos`     VARCHAR(25) NOT NULL,
     `cantidad_puertas`      VARCHAR(25) NOT NULL,
     `transmision`           VARCHAR(25) NOT NULL,
     `categoria`             VARCHAR(25) NOT NULL,
     `cantidad_de_pasajeros` VARCHAR(25) NOT NULL,
	 `usuario_carro_id` int(11) NOT NULL,
          PRIMARY KEY(carro_id,`usuario_carro_id`),
	 KEY `fk_carros_usuarios_idx` (`usuario_carro_id`),  
     CONSTRAINT `fk_carros_usuarios_idx` FOREIGN KEY (`usuario_carro_id`) REFERENCES `usuario` (`usuario_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
  )ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
 */
@Entity
@Table(name = "carros")

public class Carro implements Serializable {

   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long carro_id;
    private String modelo;
    private String cilindraje;
    private String tipo;
    private String costo;
    private String color;
    private String sistema_de_frenos;
    private String cantidad_puertas;
    private String transmision;
    private String categoria;
    private String cantidad_de_pasajeros;
    private String imgpath;
    private String usuario_carro_id;

    public String getUsuario_carro_id() {
        return usuario_carro_id;
    }

    public void setUsuario_carro_id(String usuario_carro_id) {
        this.usuario_carro_id = usuario_carro_id;
    }


  
    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    /*
    @ManyToOne
    @JoinColumn(name= "Carro_ID")
    private Carro carro;
     */
    public long getCarro_id() {
        return carro_id;
    }

    public void setCarro_id(long carro_id) {
        this.carro_id = carro_id;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSistema_de_frenos() {
        return sistema_de_frenos;
    }

    public void setSistema_de_frenos(String sistema_de_frenos) {
        this.sistema_de_frenos = sistema_de_frenos;
    }

    public String getCantidad_puertas() {
        return cantidad_puertas;
    }

    public void setCantidad_puertas(String cantidad_puertas) {
        this.cantidad_puertas = cantidad_puertas;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCantidad_de_pasajeros() {
        return cantidad_de_pasajeros;
    }

    public void setCantidad_de_pasajeros(String cantidad_de_pasajeros) {
        this.cantidad_de_pasajeros = cantidad_de_pasajeros;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
