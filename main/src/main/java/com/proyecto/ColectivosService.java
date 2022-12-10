package com.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class ColectivosService {
    
    ColectivosDTO colectivosDTO = new ColectivosDTO();

    public int CantidadColectivos(){
        ArrayList<Colectivos> colectivos = colectivosDTO.getColectivo();
        return colectivos.size();
    }

    public ArrayList<Colectivos> getColectivos(){
    ArrayList <Colectivos> colectivos = colectivosDTO.getColectivo();
    ArrayList <Ganancias> ganancias = new ArrayList<>(ganancias);

        Scanner input = new Scanner(System.in);

    int DescuentoMantenimiento = 0;
    int DescuentoMantenimientoFinal = 0;
    int GananciasColectivos = 0;
    int GanaciaTotal = 0;
    for(int x = 0; x < ganancias.size() ;x++){
        DescuentoMantenimiento = (colectivos.get(x).getIngresoMensual() / colectivos.get(x).getUnidades()) - (colectivos.get(x).getMantenimiento());
        DescuentoMantenimientoFinal = colectivos.get(x).getIngresoMensual() - (DescuentoMantenimiento * colectivos.get(x).getUnidades());
        GananciasColectivos = colectivos.get(x).getIngresoMensual() - DescuentoMantenimientoFinal;
    }

    if(GananciasColectivos > 10000000){
        System.out.println("DESEA COMPRAR UNA NUEVA UINIDAD POR UN COSTO DE $5.000.000 1 = SI / 2 = NO");
        int comprar = input.nextInt(); 
        if(comprar == 1){
            GanaciaTotal = GananciasColectivos - 5000000;
            System.out.println("UNIDAD COMPRADA");
            System.out.println("LA GANANCIA TOTAL ES DE: ");
            System.out.println(GanaciaTotal);
        }else {
            System.out.println("NO COMPRARA UNA NUEVA UNIDAD");
        }    
    }
    else {
        System.out.println("NO PUEDE COMPRAR NUEVAS UNIDADES PORQUE SUS GANANCIAS NO SUPERAN LOS $10.000.000 ");
    }


    ganancias.add(new Ganancias(DescuentoMantenimiento, DescuentoMantenimientoFinal, GananciasColectivos));
    input.close();
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
