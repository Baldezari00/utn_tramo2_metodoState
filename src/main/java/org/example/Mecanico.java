package org.example;

public class Mecanico extends Profesion {
    String tipo;

    @Override
    public String mostrarProfesion() {
        return "mecanico";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Mecanico(String tipo) {
        this.tipo = tipo;
    }
}
