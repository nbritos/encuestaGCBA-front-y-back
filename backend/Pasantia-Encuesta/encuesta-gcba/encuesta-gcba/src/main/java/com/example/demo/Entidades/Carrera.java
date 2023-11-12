package com.example.demo.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descripcionCarrera;

    //
    public Carrera(){

    }
    //
    public int getId(){
        return id;
    }

    public String getDescripcionCarrera(){
        return descripcionCarrera;
    }

    //
    public void setId(int paramId){
        this.id=paramId;
    }

    public void setDescripcionCarrera(String paramDescripcion){
        this.descripcionCarrera=paramDescripcion;
    }

}
