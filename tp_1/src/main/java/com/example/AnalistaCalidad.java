package com.example;

public class AnalistaCalidad extends Empleado {
    private boolean pruebaAutomatizada;

    public AnalistaCalidad(String apellido, String nombre, String legajo, boolean pruebaAutomatizada) {
        super(apellido, nombre, legajo);
        this.pruebaAutomatizada = pruebaAutomatizada;
    }

    public boolean isPruebaAutomatizada() {
        return pruebaAutomatizada;
    }

    public void setPruebaAutomatizada(boolean pruebaAutomatizada) {
        this.pruebaAutomatizada = pruebaAutomatizada;
    }

    public boolean isPpruebaManual() {
        return !pruebaAutomatizada;
    }

    public String toString() {
        return "Analista calídado =" + super.toString() + " " + pruebaAutomatizada + "\n";
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }
}
