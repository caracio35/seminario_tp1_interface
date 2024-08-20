package com.example;

public class Desarrolador extends Empleado {
    String lenguaje;

    public Desarrolador(String apellido, String nombre, String legajo, String lenguaje) {
        super(apellido, nombre, legajo);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String toString() {
        return "Desarrollador =" + super.toString() + " " + lenguaje + "\n";
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }
}
