package com.proyecto;

public class Ganancias {
    private int DescuentoMantenimiento;
    private int GananciasColectivos;
    private int GananciaConImpuesto;
    private int GananciaFinal;


    public Ganancias (int newDescuentoMantenimiento, int newGananciasColectivos, int newGananciaConImpuesto, int newGananciaFinal){
        this.DescuentoMantenimiento = newDescuentoMantenimiento;
        this.GananciasColectivos = newGananciasColectivos;
        this.GananciaConImpuesto = newGananciaConImpuesto;
        this.GananciaFinal = newGananciaFinal;

    }

    public int getDescuentoMantenimiento(){
        return this.DescuentoMantenimiento;
    }

    public int getGananciasColectivos(){
        return this.GananciasColectivos;
    }

    public int getGananciaConImpuesto(){
        return this.GananciaConImpuesto;
    }

    public int getGananciaFinal(){
        return this.GananciaFinal;
    }
}
