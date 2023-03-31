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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;



@Entity
@Table(name = "reviews")
public class Review implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long review_id;
    private String tipo_review;
    private Date fecha_review;
    private String nombre_de_review;
    @ManyToOne
    @JoinColumn(name = "usuario_review_id")
    private Usuario usuario_review;
    private String author;
    private String content;
    private Date created_at;
    private int rating;
    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;

    public long getReview_id() {
        return review_id;
    }

    public void setReview_id(long review_id) {
        this.review_id = review_id;
    }

    public String getTipo_review() {
        return tipo_review;
    }

    public void setTipo_review(String tipo_review) {
        this.tipo_review = tipo_review;
    }

    public Date getFecha_review() {
        return fecha_review;
    }

    public void setFecha_review(Date fecha_review) {
        this.fecha_review = fecha_review;
    }

    public String getNombre_de_review() {
        return nombre_de_review;
    }

    public void setNombre_de_review(String nombre_de_review) {
        this.nombre_de_review = nombre_de_review;
    }

    public Usuario getUsuario_review() {
        return usuario_review;
    }

    public void setUsuario_review(Usuario usuario_review) {
        this.usuario_review = usuario_review;
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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
