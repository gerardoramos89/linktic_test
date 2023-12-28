package com.example.demo.models;
import javax.persistence.*;

@Entity
@Table(name = "primas")
public class PrimasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long codigo;
    private Integer edadminima;
    private Integer edadmaxima;
    private Integer porcentajeprima;


    public Long getId() {
        return codigo;
    }

    public void setId(Long codigo) {
        this.codigo = codigo;
    }

    public void setEdadminima(Integer edadminima){
        this.edadminima = edadminima;
    }
    public Integer getEdadminima(){
        return edadminima;
    }


    public void setEdadmaxima(Integer edadmaxima){
        this.edadmaxima = edadmaxima;
    }
    public Integer getEdadmaxima(){
        return edadmaxima;
    }


    public void setPorcentajeprima(Integer porcentajeprima){
        this.porcentajeprima = porcentajeprima;
    }
    public Integer getPorcentajeprima(){
        return porcentajeprima;
    }
   
}
