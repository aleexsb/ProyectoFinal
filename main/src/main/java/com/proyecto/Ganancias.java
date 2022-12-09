package com.proyecto;

public class Ganancias {
    private int DescuentoMantenimiento;
    private int DescuentoMantenimientoFinal;
    private int GananciasColectivos;

    public Ganancias (int newDescuentoMantenimiento, int newDescuentoMantenimientoFinal, int newGananciasColectivos){
        this.DescuentoMantenimiento = newDescuentoMantenimiento;
        this.DescuentoMantenimientoFinal = newDescuentoMantenimientoFinal;
        this.GananciasColectivos = newGananciasColectivos;

    }

    public int getDescuentoMantenimiento(){
        return this.DescuentoMantenimiento;
    }

    public int getDescuentoMantenimientoFinal(){
        return this.DescuentoMantenimientoFinal;
    }

    public int getGananciasColectivos(){
        return this.GananciasColectivos;
    }
}
