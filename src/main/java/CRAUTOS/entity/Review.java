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
@Table(name = "review")
public class Review implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long review_id;
    private String tipo_review;
    private String fecha_review;
    private String nombre_de_review;
    private Long usuario_review_id;

    public String getFecha_review() {
        return fecha_review;
    }

    public void setFecha_review(String fecha_review) {
        this.fecha_review = fecha_review;
    }

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

    public Long getReview_id() {
        return review_id;
    }

    public void setReview_id(Long review_id) {
        this.review_id = review_id;
    }

    public String getTipo_review() {
        return tipo_review;
    }

    public void setTipo_review(String tipo_review) {
        this.tipo_review = tipo_review;
    }

    public String getNombre_de_review() {
        return nombre_de_review;
    }

    public void setNombre_de_review(String nombre_de_review) {
        this.nombre_de_review = nombre_de_review;
    }

    public Long getUsuario_review_id() {
        return usuario_review_id;
    }

    public void setUsuario_review_id(Long usuario_review_id) {
        this.usuario_review_id = usuario_review_id;
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

}
