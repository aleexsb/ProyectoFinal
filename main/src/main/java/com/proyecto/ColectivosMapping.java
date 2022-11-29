package com.proyecto;

public class ColectivosMapping {
    
    public Colectivos mapColectivos(int LineaBD, int UnidadesBD, long IngresoMensualBD){
        Colectivos colectivos = new Colectivos(LineaBD, UnidadesBD, IngresoMensualBD);
        return colectivos;
    }
}
