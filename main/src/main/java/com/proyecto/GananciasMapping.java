package com.proyecto;

public class GananciasMapping {
    
    public Ganancias mapGanancias(int DescuentoMantenimientoBD, int GananciasColectivosBD, int GananciaConImpuestoBD, int GananciaFinalBD){
        Ganancias ganancias = new Ganancias(DescuentoMantenimientoBD, GananciasColectivosBD, GananciaConImpuestoBD, GananciaFinalBD);
        return ganancias;
    }
}
