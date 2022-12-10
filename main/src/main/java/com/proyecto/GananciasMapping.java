package com.proyecto;

public class GananciasMapping {
    
    public Ganancias mapGanancias(int DescuentoMantenimientoBD, int DescuentoMantenimientoFinalBD, int GananciasColectivosBD){
        Ganancias ganancias = new Ganancias(DescuentoMantenimientoBD, DescuentoMantenimientoFinalBD, GananciasColectivosBD);
        return ganancias;
    }
}
