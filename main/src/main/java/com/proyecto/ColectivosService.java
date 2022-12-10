package com.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class ColectivosService {
    
    ColectivosDTO colectivosDTO = new ColectivosDTO();
    GananciasDTO gananciasDTO = new GananciasDTO();

    public ArrayList <Colectivos> getColectivo(){
        ArrayList <Colectivos> colectivos = colectivosDTO.getColectivo();
        return colectivos;
    }

    public int CantidadColectivos(){
        ArrayList<Colectivos> colectivos = colectivosDTO.getColectivo();
        return colectivos.size();
    }

    public ArrayList<Ganancias> getGanancias(){
    ArrayList <Ganancias> ganancias = gananciasDTO.getGanancias();
    ArrayList <Colectivos> colectivos = colectivosDTO.getColectivo();

        Scanner input = new Scanner(System.in);

    int DescuentoMantenimiento = 0;
    int DescuentoMantenimientoFinal = 0;
    int GananciasColectivos = 0;
    int GanaciaTotal = 0;
    for(int x = 0; x < colectivos.size() ;x++){
        DescuentoMantenimiento = (colectivos.get(x).getIngresoMensual() / colectivos.get(x).getUnidades()) - (colectivos.get(x).getMantenimiento());
        DescuentoMantenimientoFinal = colectivos.get(x).getIngresoMensual() - (DescuentoMantenimiento * colectivos.get(x).getUnidades());
        GananciasColectivos = colectivos.get(x).getIngresoMensual() - DescuentoMantenimientoFinal;
    }

    if(GananciasColectivos > 10000000){
        System.out.println("Desea comprar una nueva unidad por el valor de $5.000.000?");
        String compra = input.next();
        if(compra == "SI"){
            GanaciaTotal = GananciasColectivos - 5000000;
            System.out.println("Unidad adquirida");
            System.out.println("La ganancia total es de: " + "$" + GanaciaTotal);
        }else {
            System.out.println("No se ha comprado una unidad nueva");
        }    
    }
    else {
        System.out.println("No es posible comprar unidades nuevas debido a que las ganancias no superan el monto de $10.000.000");
    }
    input.close();

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
