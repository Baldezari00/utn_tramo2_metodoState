package org.example;

import org.example.estrategias.EstrategiaDeSueldo;

public class Persona{
    String nombre;
    String apellido;
    Profesion profesion;

    public EstrategiaDeSueldo estrategiaDeSueldo;

    public Persona(String nombre, String apellido, Profesion profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }
    public Integer calcularSueldo(){
       return this.estrategiaDeSueldo.calcularSueldo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }
}
