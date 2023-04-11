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

/*
CREATE TABLE `tipo_usuario`
  (
     `tipo_usuario_id`        INT(11) NOT NULL AUTO_INCREMENT,
     `tipo`            VARCHAR(50) NOT NULL,
     PRIMARY KEY(tipo_usuario_id)
  )ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
  
 */

@Entity
@Table(name = "tipo_usuario")
public class Tipo_Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long tipo_usuario_id;

    public long getTipo_usuario_id() {
        return tipo_usuario_id;
    }

    public void setTipo_usuario_id(long tipo_usuario_id) {
        this.tipo_usuario_id = tipo_usuario_id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private String tipo;

}
