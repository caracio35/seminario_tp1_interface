package com.example;

public class DiseniadorGrafico extends Empleado {
    String especializacion;
    boolean usaFigura;

    public DiseniadorGrafico(String apellido, String nombre, String especializacion) {
        super(apellido, nombre);
        this.especializacion = especializacion;
    }

    public void getEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public boolean isUsaFigura() {
        return usaFigura;
    }

    public void setUsaFigura(boolean usaFigura) {
        this.usaFigura = usaFigura;
    }

    public String toString() {
        return "Diseñador grafico =" + super.toString() + " " + especializacion + " " + usaFigura + "\n";
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }

}
