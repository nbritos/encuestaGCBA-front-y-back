package com.example.demo.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    private String documento;
    private int idCarrera;

    // CONSTRUCTOR, GETTER Y SETTER

    // Constructor por default
    public Usuario() {
    }

    // Getter
    public String getDocumento() {
        return documento;
    }

    public long getIdCarrera() {
        return idCarrera;
    }

    // Setter
    public void setDocumento(String paramDocumento) {
        this.documento = paramDocumento;
    }

    public void setIdCarrera(int paramIdCarrera) {
        this.idCarrera = paramIdCarrera;
    }
}
