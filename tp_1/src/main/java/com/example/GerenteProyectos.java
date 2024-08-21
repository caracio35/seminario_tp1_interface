package com.example;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenteProyectos extends Empleado {
    private ArrayList<Empleado> empleados;

    public GerenteProyectos() {
        super();
    }

    public GerenteProyectos(String apellido, String nombre, ArrayList<Empleado> empleados) {
        super(apellido, nombre);
        this.empleados = empleados;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String toString() {
        return "gerente de proyecto =" + super.toString() + " " + "\n";
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }

    public void imprimirEmpleados() {
        for (Empleado e : empleados) {
            e.imprimir();
        }
    }
}
