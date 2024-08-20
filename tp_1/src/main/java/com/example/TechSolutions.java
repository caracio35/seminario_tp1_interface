package com.example;

import java.util.ArrayList;

public class TechSolutions {
    public static void main(String[] args) {
        ArrayList<Empleado> empleadosACargo = new ArrayList<Empleado>();
        ArrayList<Empleado> empleadosEmpresa = new ArrayList<Empleado>();
        GerenteProyectos gerenteProyectos = new GerenteProyectos("Jose", "Horacio", empleadosACargo);
        Empleado diseniadorGrafico = new DiseniadorGrafico("Charquimix", "Victor", "Canvas");
        Empleado diseniadorGrafico2 = new DiseniadorGrafico("Charquimix", "Antonio", "Canvas");
        Empleado AnalistaCalidad = new AnalistaCalidad("San Martin", "Andres", "abc123", true);
        Empleado AnalistaCalidad2 = new AnalistaCalidad("Rulo", "facundo", "abc124", false);
        Empleado desarrolador = new Desarrolador("Cosme", "fulanito", "abc125", "Java");
        Empleado desarrolador2 = new Desarrolador("Ell", "Pepe", "abc126", "Java");
        Empleado desarrolador3 = new Desarrolador("Lokendo", "Julio", "abc127", "Java");
        empleadosACargo.add(diseniadorGrafico);
        empleadosACargo.add(diseniadorGrafico2);
        empleadosACargo.add(AnalistaCalidad);
        empleadosACargo.add(AnalistaCalidad2);

        gerenteProyectos.setEmpleados(empleadosACargo);
        empleadosEmpresa.add(gerenteProyectos);
        empleadosEmpresa.add(desarrolador);
        empleadosEmpresa.add(desarrolador2);
        empleadosEmpresa.add(desarrolador3);
        // System.out.println(toString(empleadosEmpresa));
        imprimir(empleadosEmpresa);
    }

    public static String toString(ArrayList<Empleado> empleados) {
        StringBuffer sb = new StringBuffer();
        for (Empleado e : empleados) {
            sb.append(e.toString());
        }
        return sb.toString();
    }

    public static void imprimir(ArrayList<Empleado> empleados) {
        for (Empleado e : empleados) {
            e.imprimir();
        }
    }
}