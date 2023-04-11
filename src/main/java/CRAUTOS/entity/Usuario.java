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

/*
CREATE TABLE `usuario`
  (
     `usuario_id`        INT(11) NOT NULL AUTO_INCREMENT,
     `nombre`            VARCHAR(50) NOT NULL,
     `apellido`          VARCHAR(50) NOT NULL,
     `edad`              VARCHAR(11) NOT NULL,
     `telefono`          INT(50) NOT NULL,
     `correo_eletronico` VARCHAR(60) NOT NULL,
	 `tipo_usuario`          INT(11) NOT NULL,
     PRIMARY KEY(usuario_id, tipo_usuario),
	 KEY `fk_usuarios_tipo_usuario_idx` (`tipo_usuario`),  
     CONSTRAINT `fk_usuarios_tipo_usuario_idx` FOREIGN KEY (`tipo_usuario`) REFERENCES `tipo_usuario` (`tipo_usuario_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
  )ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;*/
@Entity
@Table(name = "carros")

public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long usuario_id;
    private String nombre;
    private String apellido;
    private String edad;
    private String telefono;
    private String correo_eletronico;
    @ManyToOne
    @JoinColumn(name = "tipo_usuario")
    private Tipo_Usuario tipo_usuario;

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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_eletronico() {
        return correo_eletronico;
    }

    public void setCorreo_eletronico(String correo_eletronico) {
        this.correo_eletronico = correo_eletronico;
    }

    public Tipo_Usuario getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(Tipo_Usuario tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

}
