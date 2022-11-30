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
    return colectivos;

    }

    public void ValidateAndSaveColectivos (Colectivos colectivos){
        if (colectivos.getUnidades() < 1){
            System.out.println("Error: Debe existir una unidad como minimo");
        }
        else{
            colectivosDTO.saveColectivos(colectivos.getLinea(), colectivos.getUnidades(), colectivos.getIngresoMensual(), colectivos.getMantenimiento());
            System.out.println("OK");
        }
    }

    public void ValorMantenimiento(Colectivos colectivos){
        long DescuentoMantenimiento = 0;
        long DescuentoMantenimientoFinal = 0;
        DescuentoMantenimiento = (colectivos.getIngresoMensual() / colectivos.getUnidades()) - (colectivos.getMantenimiento());
        DescuentoMantenimientoFinal = colectivos.getIngresoMensual() - (DescuentoMantenimiento * colectivos.getUnidades());
        System.out.println("El valor total del mantenimiento es de: " + DescuentoMantenimientoFinal);
    }
}
