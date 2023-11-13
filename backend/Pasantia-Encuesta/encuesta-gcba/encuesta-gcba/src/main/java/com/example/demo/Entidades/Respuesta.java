package com.example.demo.Entidades;

import javax.persistence.*;

@Entity
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "valor_respuesta") // Nombre del campo en la base de datos
    private int valorRespuesta; // Atributo para almacenar el valor de la respuesta

    @ManyToOne
    @JoinColumn(name = "pregunta_id")
    private Pregunta pregunta;

    // Constructor, getters y setters para otros atributos

    public int getValorRespuesta() {
        return valorRespuesta;
    }

    public void setValorRespuesta(int valorRespuesta) {
        this.valorRespuesta = valorRespuesta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta=pregunta;
    }

    /*public void setPregunta_id(int preguntaId){
        this.pregunta_id=preguntaId;
    }*/
}

