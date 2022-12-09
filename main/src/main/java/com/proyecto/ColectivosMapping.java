package com.proyecto;

public class ColectivosMapping {
    
    public Colectivos mapColectivos(int LineaBD, int UnidadesBD, int IngresoMensualBD, int MantenimientoBD){
        Colectivos colectivos = new Colectivos(LineaBD, UnidadesBD, IngresoMensualBD, MantenimientoBD);
        return colectivos;
    }
}
