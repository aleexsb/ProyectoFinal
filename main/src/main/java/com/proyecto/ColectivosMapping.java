package com.proyecto;

public class ColectivosMapping {
    
    public Colectivos mapColectivos(int LineaBD, int UnidadesBD, long IngresoMensualBD, long MantenimientoBD){
        Colectivos colectivos = new Colectivos(LineaBD, UnidadesBD, IngresoMensualBD, MantenimientoBD);
        return colectivos;
    }
}
