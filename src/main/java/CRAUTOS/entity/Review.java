/**
 *
 * @author reyes
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
package CRAUTOS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "review")
public class Review implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long review_id;
    private String tipo_review;
    private LocalDate fecha_review;
    private String nombre_de_review;
    private Long usuario_review_id;
    private String author;
    private String content;
    private Integer rating;
    private Long carro_id;

    public Long getReviewId() {
        return review_id;
    }

    public void setReviewId(Long review_id) {
        this.review_id = review_id;
    }

    public String getTipoReview() {
        return tipo_review;
    }

    public void setTipoReview(String tipo_review) {
        this.tipo_review = tipo_review;
    }

    public LocalDate getFechaReview() {
        return fecha_review;
    }

    public void setFechaReview(LocalDate fecha_review) {
        this.fecha_review = fecha_review;
    }

    public String getNombreDeReview() {
        return nombre_de_review;
    }

    public void setNombreDeReview(String nombre_de_review) {
        this.nombre_de_review = nombre_de_review;
    }

    public Long getUsuarioReviewId() {
        return usuario_review_id;
    }

    public void setUsuarioReviewId(Long usuario_review_id) {
        this.usuario_review_id = usuario_review_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getCarroId() {
        return carro_id;
    }

    public void setCarroId(Long carro_id) {
        this.carro_id = carro_id;
    }
}
