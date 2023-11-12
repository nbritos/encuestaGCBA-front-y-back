package com.example.demo.Entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private Date fecha;

    @OneToMany(mappedBy = "encuesta", cascade = CascadeType.ALL)
    private List<Pregunta> preguntas = new ArrayList<>();

    //CONSTRUCTOR
    public Encuesta(){
    }

    //Getter
    public int getId(){
        return id;
    };
    public String getTitulo(){
        return titulo;
    }
    public Date getFecha() {
        return fecha;
    }
    public List<Pregunta> getPreguntas() {
        return preguntas;
    }



    //Setter
    public void setId(int paramId){
        this.id=paramId;
    }
    public void setTitulo(String paramTitulo){
        this.titulo=paramTitulo;
    }
    public void setFecha(Date paramFecha){
        this.fecha=paramFecha;
    }
    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
}

