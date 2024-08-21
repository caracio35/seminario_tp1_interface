package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TechSolutions {
    public static void main(String[] args) {
        ArrayList<Empleado> empleadosACargo = new ArrayList<Empleado>();
        ArrayList<Empleado> empleadosEmpresa = new ArrayList<Empleado>();
        GerenteProyectos gerenteProyectos = new GerenteProyectos("Jose", "Horacio", empleadosACargo);
        gerenteProyectos.setFechaDeingreso(LocalDate.of(2020, 5, 15));
        Empleado diseniadorGrafico = new DiseniadorGrafico("Charquimix", "Victor", "Canvas");
        diseniadorGrafico.setFechaDeingreso(LocalDate.of(2020, 7, 10));
        Empleado diseniadorGrafico2 = new DiseniadorGrafico("Charquimix", "Antonio", "Canvas");
        diseniadorGrafico2.setFechaDeingreso(LocalDate.of(2020, 8, 8));
        Empleado AnalistaCalidad = new AnalistaCalidad("San Martin", "Andres", "abc123", true);
        AnalistaCalidad.setFechaDeingreso(LocalDate.of(2018, 9, 30));
        Empleado AnalistaCalidad2 = new AnalistaCalidad("Rulo", "Facundo", "abc124", false);
        AnalistaCalidad2.setFechaDeingreso(LocalDate.of(2019, 10, 27));
        Empleado desarrolador = new Desarrolador("Cosme", "Fulanito", "abc125", "Java");
        desarrolador.setFechaDeingreso(LocalDate.of(2020, 11, 4));
        Empleado desarrolador2 = new Desarrolador("Ell", "Pepe", "abc126", "Java");
        desarrolador2.setFechaDeingreso(LocalDate.of(2021, 12, 23));
        Empleado desarrolador3 = new Desarrolador("Lokendo", "Julio", "abc127", "Java");
        desarrolador3.setFechaDeingreso(LocalDate.of(2022, 1, 19));
        empleadosACargo.add(diseniadorGrafico);
        empleadosACargo.add(diseniadorGrafico2);
        empleadosACargo.add(AnalistaCalidad);
        empleadosACargo.add(AnalistaCalidad2);

        empleadosEmpresa.add(gerenteProyectos);
        empleadosEmpresa.addAll(empleadosACargo);
        empleadosEmpresa.add(desarrolador);
        empleadosEmpresa.add(desarrolador2);
        empleadosEmpresa.add(desarrolador3);
        gerenteProyectos.setEmpleados(empleadosACargo);
        // System.out.println(toString(empleadosEmpresa));
        // imprimir(empleadosEmpresa);
        System.out.println("desordenado");
        GeneradorDeReportes.ImprimirObjetos(empleadosEmpresa);
        Collections.sort(empleadosEmpresa);
        System.out.println("ordenado");
        GeneradorDeReportes.ImprimirObjetos(empleadosEmpresa);
        Collections.sort(empleadosEmpresa, new ComparadorPorFecha());
        System.out.println("ordenado por fecha");
        GeneradorDeReportes.ImprimirObjetos(empleadosEmpresa);
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