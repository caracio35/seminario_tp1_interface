import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import com.example.AnalistaCalidad;
import com.example.ComparadorPorFecha;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import com.example.AnalistaCalidad;
import com.example.ComparadorPorFecha;
import com.example.Desarrolador;
import com.example.DiseniadorGrafico;
import com.example.Empleado;
import com.example.GeneradorDeReportes;
import com.example.GerenteProyectos;

public class Test {

    public static void main(String[] args) {
        Empleado e = new Desarrolador("Nocito", "Jose", "ABC123", "java");
        e.setFechaDeingreso(LocalDate.of(2020, 5, 15));
        Empleado e2 = new Desarrolador("Calvo", "Paula", "ABF125", "");
        e2.setFechaDeingreso(LocalDate.of(2020, 7, 15));
        Empleado e3 = new Desarrolador("Charqimix", "Victor", "ABC123", "java");
        e3.setFechaDeingreso(LocalDate.of(2019, 8, 15));
        Empleado e4 = new DiseniadorGrafico("Charquimix", "Antonio", "Canvas");
        e4.setFechaDeingreso(LocalDate.of(2020, 9, 15));
        Empleado e5 = new GerenteProyectos("Nocito", "Horacio", new ArrayList<Empleado>());
        e5.setFechaDeingreso(LocalDate.of(2020, 10, 15));
        Empleado e6 = new AnalistaCalidad("Cosme", "Fulanito", "EFG321", true);
        e6.setFechaDeingreso(LocalDate.of(2021, 11, 15));
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(e);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);
        empleados.add(e6);
        Collections.sort(empleados);
        // Imprimir la lista utilizando la interfaz Imprimible
        System.out.println("\n\n");
        System.out.println("desordenado");
        for (Empleado a : empleados) {
            a.imprimir();
        }
        System.out.println("\n\n");
        // Ordenar la lista alfabéticamente por nombre
        Collections.sort(empleados);
        // Imprimir la lista utilizando la interfaz Imprimible
        if (empleados.toString().equals(
                "[Diseñador grafico =Nombre: Antonio Apellido: Charquimix Legajo: null Fecha de Ingreso: 2020-09-15\n" + //
                        " Canvas false\n" + //
                        ", Analista calídado =Nombre: Fulanito Apellido: Cosme Legajo: EFG321 Fecha de Ingreso: 2021-11-15\n"
                        + //
                        " true\n" + //
                        ", gerente de proyecto =Nombre: Horacio Apellido: Nocito Legajo: null Fecha de Ingreso: 2020-10-15\n"
                        + //
                        " \n" + //
                        ", Desarrollador =Nombre: Jose Apellido: Nocito Legajo: ABC123 Fecha de Ingreso: 2020-05-15\n" + //
                        " java\n" + //
                        ", Desarrollador =Nombre: Paula Apellido: Calvo Legajo: ABF125 Fecha de Ingreso: 2020-07-15\n" + //
                        " \n" + //
                        ", Desarrollador =Nombre: Victor Apellido: Charqimix Legajo: ABC123 Fecha de Ingreso: 2019-08-15\n"
                        + //
                        " java\n" + //
                        "]")) {
            System.out.println(" esta ordenado alfabeticamente");
        } else {
            System.out.println("esta no ordenado alfabeticamente");
        }
        for (Empleado a : empleados) {
            a.imprimir();
        }
        System.out.println("\n\n");
        // Ordenar la lista por fecha de ingreso
        Collections.sort(empleados, new ComparadorPorFecha());
        // imprimir la lista utilizando GeneradorDeReportes

        if (empleados.toString().equals(
                "[Desarrollador =Nombre: Victor Apellido: Charqimix Legajo: ABC123 Fecha de Ingreso: 2019-08-15\n" + //
                        " java\n" + //
                        ", Desarrollador =Nombre: Jose Apellido: Nocito Legajo: ABC123 Fecha de Ingreso: 2020-05-15\n" + //
                        " java\n" + //
                        ", Desarrollador =Nombre: Paula Apellido: Calvo Legajo: ABF125 Fecha de Ingreso: 2020-07-15\n" + //
                        " \n" + //
                        ", Diseñador grafico =Nombre: Antonio Apellido: Charquimix Legajo: null Fecha de Ingreso: 2020-09-15\n"
                        + //
                        " Canvas false\n" + //
                        ", gerente de proyecto =Nombre: Horacio Apellido: Nocito Legajo: null Fecha de Ingreso: 2020-10-15\n"
                        + //
                        " \n" + //
                        ", Analista calídado =Nombre: Fulanito Apellido: Cosme Legajo: EFG321 Fecha de Ingreso: 2021-11-15\n"
                        + //
                        " true\n" + //
                        "]")) {
            System.out.println("esta ordenado por fecha");

        } else {
            System.out.println("esta no ordenado por fecha");
        }
        GeneradorDeReportes.ImprimirObjetos(empleados);
        System.out.println("\n\n");
    }

}
