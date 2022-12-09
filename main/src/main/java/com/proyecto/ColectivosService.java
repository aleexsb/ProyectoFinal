package com.proyecto;

import java.util.ArrayList;

public class ColectivosService {
    
    ColectivosDTO colectivosDTO = new ColectivosDTO();

    public int CantidadColectivos(){
        ArrayList<Colectivos> colectivos = colectivosDTO.getColectivo();
        return colectivos.size();
    }

    public ArrayList<Colectivos> getColectivos(){
    ArrayList <Colectivos> colectivos = colectivosDTO.getColectivo();
    ArrayList <Ganancias> ganancias = new ArrayList<>(ganancias);

    int DescuentoMantenimiento = 0;
    int DescuentoMantenimientoFinal = 0;
    int GananciasColectivos = 0;
    for(int x = 0; x < ganancias.size() ;x++){
        DescuentoMantenimiento = (colectivos.get(x).getIngresoMensual() / colectivos.get(x).getUnidades()) - (colectivos.get(x).getMantenimiento());
        DescuentoMantenimientoFinal = colectivos.get(x).getIngresoMensual() - (DescuentoMantenimiento * colectivos.get(x).getUnidades());
        GananciasColectivos = colectivos.get(x).getIngresoMensual() - DescuentoMantenimientoFinal;
    }
    ganancias.add(new Ganancias(DescuentoMantenimiento, DescuentoMantenimientoFinal, GananciasColectivos));
    return ganancias;
}

    public void ValidateAndSaveColectivos (Colectivos colectivos){
        if (colectivos.getLinea() != 79 || colectivos.getLinea() != 102 || colectivos.getLinea() != 110 || colectivos.getLinea() != 134 || colectivos.getLinea() != 178 || colectivos.getLinea() != 277){
            System.out.println("Ingrese una linea de colectivo válida");
        }
        if (colectivos.getUnidades() < 1){
            System.out.println("Error: Debe existir una unidad como minimo");
        } 
        else{
            colectivosDTO.saveColectivos(colectivos.getLinea(), colectivos.getUnidades(), colectivos.getIngresoMensual(), colectivos.getMantenimiento());
            System.out.println("OK");
        }
    }
}
