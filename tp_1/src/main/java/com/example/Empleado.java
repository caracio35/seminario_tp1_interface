package com.example;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Empleado implements Imprimibre, Comparable<Empleado> {
    /*
     * AL IMPLEMENTAR LA INTERFACE EN EMPLEADO TODAS LAS SUBCLASES DE EMPLEADO DEBEN
     * IMPLEMENTAR ESTA INTERFACE
     */
    protected String apellido;
    protected String nombre;
    protected String legajo;
    protected String email;
    protected LocalDate fechaDeIngreso;

    public Empleado() {
        this.apellido = "";
        this.nombre = "";
        this.legajo = "";
        this.email = "";
        this.fechaDeIngreso = LocalDate.now();
    }

    public Empleado(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeIngreso = LocalDate.now();
    }

    public Empleado(String apellido, String nombre, String legajo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
        this.fechaDeIngreso = LocalDate.now();
    }

    public String toString() {
        return "Nombre: " + nombre + " Apellido: " + apellido + " Legajo: " + legajo + " Fecha de Ingreso: "
                + fechaDeIngreso + "\n";
    }

    public int compareTo(Empleado o) {
        return this.nombre.compareTo(o.getNombre());
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaDeingreso(LocalDate fechaDeingreso) {
        this.fechaDeIngreso = fechaDeingreso;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaDeingreso() {
        return fechaDeIngreso;
    }

}
