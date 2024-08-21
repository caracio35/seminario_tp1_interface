package com.example;

import java.util.ArrayList;

public class GeneradorDeReportes {

    public static void ImprimirObjetos(ArrayList<Empleado> empleados) {
        for (Empleado e : empleados) {
            e.imprimir();
        }
    }

}
