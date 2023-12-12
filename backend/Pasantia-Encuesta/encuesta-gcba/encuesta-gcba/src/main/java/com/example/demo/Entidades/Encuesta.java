package com.example.demo.Entidades;

import javax.persistence.*;

@Entity
public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="mail")
    private String mail;
    @Column(name="lugar_de_residencia")
    private String lugarDeResidencia;
    @Column(name="nivel_de_estudios")
    private String nivelDeEstudios;
    @Column(name="cuatrimestre_codo")
    private String cuatrimestreCodo;
    @Column(name="curso_codo")
    private String cursoCodo;
    @Column(name="desempenio_codo")
    private String desempenioCodo;
    @Column(name="continua_estudiando")
    private String continuaEstudiando;
    @Column(name="tipo_de_estudio")
    private String tipoDeEstudio;
    @Column(name="nivel_en_programacion")
    private String nivelEnProgramacion;
    @Column(name="situacion_laboral")
    private String situacionLaboral;
    @Column(name="trabajo_actual")
    private String trabajoActual;
    @Column(name="trabajo_actual_programador")
    private String trabajoActualProgramador;
    @Column(name="acepta_busqueda_laboral")
    private String aceptaBusquedaLaboral;

    // CONSTRUCTOR
    public Encuesta() {
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLugarDeResidencia() {
        return lugarDeResidencia;
    }

    public void setLugarDeResidencia(String lugarDeResidencia) {
        this.lugarDeResidencia = lugarDeResidencia;
    }

    public String getNivelDeEstudios() {
        return nivelDeEstudios;
    }

    public void setNivelDeEstudios(String nivelDeEstudios) {
        this.nivelDeEstudios = nivelDeEstudios;
    }

    public String getCuatrimestreCodo() {
        return cuatrimestreCodo;
    }

    public void setCuatrimestreCodo(String cuatrimestreCodo) {
        this.cuatrimestreCodo = cuatrimestreCodo;
    }

    public String getCursoCodo() {
        return cursoCodo;
    }

    public void setCursoCodo(String cursoCodo) {
        this.cursoCodo = cursoCodo;
    }

    public String getDesempenioCodo() {
        return desempenioCodo;
    }

    public void setDesempenioCodo(String desempenioCodo) {
        this.desempenioCodo = desempenioCodo;
    }

    public String getContinuaEstudiando() {
        return continuaEstudiando;
    }

    public void setContinuaEstudiando(String continuaEstudiando) {
        this.continuaEstudiando = continuaEstudiando;
    }

    public String getTipoDeEstudio() {
        return tipoDeEstudio;
    }

    public void setTipoDeEstudio(String tipoDeEstudio) {
        this.tipoDeEstudio = tipoDeEstudio;
    }

    public String getNivelEnProgramacion() {
        return nivelEnProgramacion;
    }

    public void setNivelEnProgramacion(String nivelEnProgramacion) {
        this.nivelEnProgramacion = nivelEnProgramacion;
    }

    public String getSituacionLaboral() {
        return situacionLaboral;
    }

    public void setSituacionLaboral(String situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    public String getTrabajoActual() {
        return trabajoActual;
    }

    public void setTrabajoActual(String trabajoActual) {
        this.trabajoActual = trabajoActual;
    }

    public String getTrabajoActualProgramador() {
        return trabajoActualProgramador;
    }

    public void setTrabajoActualProgramador(String trabajoActualProgramador) {
        this.trabajoActualProgramador = trabajoActualProgramador;
    }

    public String getAceptaBusquedaLaboral() {
        return aceptaBusquedaLaboral;
    }

    public void setAceptaBusquedaLaboral(String aceptaBusquedaLaboral) {
        this.aceptaBusquedaLaboral = aceptaBusquedaLaboral;
    }
}



