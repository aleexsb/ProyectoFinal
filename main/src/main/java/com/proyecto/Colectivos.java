package com.proyecto;

public class Colectivos implements Mantenimiento {
    private int Linea;
    private int Unidades;
    private long IngresoMensual;

    public Colectivos (int newLinea, int newUnidades, long newGananciaMensual){
        this.Linea = newLinea;
        this.Unidades = newUnidades;
        this.IngresoMensual = newGananciaMensual;
    }

    public int getLinea(){
        return Linea;
    }

    public int getUnidades(){
        return Unidades;
    }

    public long getIngresoMensual(){
        return IngresoMensual;
    }

    public void setLinea(int newLinea){
        this.Linea = newLinea;
    }

    public void setUnidades(int newUnidades){
        this.Unidades = newUnidades;
    }

    public void setGananciaMensual(long newGananciaMensual){
        this.IngresoMensual = newGananciaMensual;
    }

    @Override
    public long DescuentoMantenimiento() {
        long DescuentoMantenimiento = 0;
        long DescuentoMantenimientoFinal = 0;
        DescuentoMantenimiento = (IngresoMensual/ Unidades) - (CostoMantenimiento);
        DescuentoMantenimientoFinal = IngresoMensual - (DescuentoMantenimiento * Unidades);
        return DescuentoMantenimientoFinal; 
    }
}

