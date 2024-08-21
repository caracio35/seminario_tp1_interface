package com.example;

import java.util.Comparator;

public class ComparadorPorFecha implements Comparator<Empleado> {
    @Override
    public int compare(Empleado emp1, Empleado emp2) {
        return emp1.getFechaDeingreso().compareTo(emp2.getFechaDeingreso());
    }
}