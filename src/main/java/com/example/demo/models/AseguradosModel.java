package com.example.demo.models;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "asegurados")
public class AseguradosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombres;
    private String apellidos;
    private Integer sexo;
    private Date fechanacimiento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSexo(Integer sexo){
        this.sexo = sexo;
    }

    public Integer getSexo(){
        return sexo;
    }

    public void setFechanacimiento(Date fechanacimiento){
        this.fechanacimiento = fechanacimiento;
    }

    public Date getFechanacimiento(){
        return fechanacimiento;
    }
}
