package com.proyecto;

public class Colectivos {
    private int Linea;
    private int Unidades;
    private Long IngresoMensual;
    private Long Mantenimiento;

    public Colectivos (int newLinea, int newUnidades, Long newIngresoMensual, Long newMantenimiento){
        this.Linea = newLinea;
        this.Unidades = newUnidades;
        this.IngresoMensual = newIngresoMensual;
        this.Mantenimiento = newMantenimiento;
    }

    public int getLinea(){
        return this.Linea;
    }

    public int getUnidades(){
        return this.Unidades;
    }

    public Long getIngresoMensual(){
        return this.IngresoMensual;
    }

    public Long getMantenimiento(){
        return this.Mantenimiento;
    }

    public void setLinea(int newLinea){
        this.Linea = newLinea;
    }

    public void setUnidades(int newUnidades){
        this.Unidades = newUnidades;
    }

    public void setIngresoMensual(Long newIngresoMensual){
        this.IngresoMensual = newIngresoMensual;
    }

    
    /* QUERY AL SERVICE.JAVA
    
    @Override
    public long DescuentoMantenimiento() {
        long DescuentoMantenimiento = 0;
        long DescuentoMantenimientoFinal = 0;
        DescuentoMantenimiento = (IngresoMensual/ Unidades) - (CostoMantenimiento);
        DescuentoMantenimientoFinal = IngresoMensual - (DescuentoMantenimiento * Unidades);
        return DescuentoMantenimientoFinal;
    }
    */
}

