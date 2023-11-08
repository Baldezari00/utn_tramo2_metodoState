package org.example;

public class Profesor extends Profesion {
    String materia;

    @Override
    public String mostrarProfesion() {
        return "profesor";
    }
}
