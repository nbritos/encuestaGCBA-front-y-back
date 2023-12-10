package com.example.demo.Entidades;

import javax.persistence.*;
import java.util.List;

@Entity
public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String mail;
    private String lugarDeResidencia;
    private String nivelDeEstudios;
    private String cuatrimestreCodo;
    private String cursoCodo;
    private String desempenioCodo;
    private String continuaEstudiando;
    private String tipoDeEstudio;
    private String nivelEnProgramacion;
    private String situacionLaboral;
    private String trabajoActual;
    private String trabajoActualProgramador;
    private String aceptaBusquedaLaboral;

    // CONSTRUCTOR
    public Encuesta() {
    }

    // Getter
    public int getId() {
        return id;
    }

    // Puedes mantener este método getId si es necesario para tu aplicación
    // public int getId(){
    //     return id;
    // }

    // Setter
    public void setId(int paramId) {
        this.id = paramId;
    }

    // Puedes mantener estos métodos si son necesarios para tu aplicación
    // public String getTitulo() {
    //     return titulo;
    // }
    // public Date getFecha() {
    //     return fecha;
    // }

    // public void setTitulo(String paramTitulo) {
    //     this.titulo = paramTitulo;
    // }
    // public void setFecha(Date paramFecha) {
    //     this.fecha = paramFecha;
    // }

    // Métodos getters y setters para las nuevas propiedades
    // ...

    // Puedes mantener este método si es necesario para tu aplicación
    // public List<Pregunta> getPreguntas() {
    //     return preguntas;
    // }

    // public void setPreguntas(List<Pregunta> preguntas) {
    //     this.preguntas = preguntas;
    // }
}
