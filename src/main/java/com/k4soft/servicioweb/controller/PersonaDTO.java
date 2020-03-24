package com.k4soft.servicioweb.controller;

public class PersonaDTO {

    private Integer idPersona;
    private String nombres;
    private String apellidos;

    public PersonaDTO(Integer idPersona, String nombres, String apellidos) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public PersonaDTO(){
        super();
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
}
