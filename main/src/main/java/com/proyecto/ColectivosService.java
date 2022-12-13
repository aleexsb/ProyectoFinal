package com.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class ColectivosService {
    
    ColectivosDTO colectivosDTO = new ColectivosDTO();
    GananciasDTO gananciasDTO = new GananciasDTO();

    public ArrayList <Colectivos> getColectivos(){
        ArrayList <Colectivos> colectivos = colectivosDTO.getColectivos();
        return colectivos;
    }

    public int CantidadColectivos(){
        ArrayList<Colectivos> colectivos = colectivosDTO.getColectivos();
        return colectivos.size();
    }

    public ArrayList<Ganancias> getGanancias(){
    ArrayList <Ganancias> ganancias = gananciasDTO.getGanancias();
    ArrayList <Colectivos> colectivos = colectivosDTO.getColectivos();

    int DescuentoMantenimiento = 0;
    int GananciasColectivos = 0;
    int GananciaConImpuesto = 0;
    int GananciaFinal = 0;
    for(int x = 0; x < colectivos.size() ;x++){
        DescuentoMantenimiento = colectivos.get(x).getMantenimiento() * colectivos.get(x).getUnidades();
        GananciasColectivos = colectivos.get(x).getIngresoMensual() - DescuentoMantenimiento;
        GananciaConImpuesto = (GananciasColectivos * 70) / 100;
    }

    Scanner input = new Scanner(System.in);

    if(GananciaConImpuesto > 10000000){
        System.out.println("Desea comprar una nueva unidad por el valor de $5.000.000?");
        String compra = input.next();
        if(compra == "SI"){
            GananciaFinal = GananciaConImpuesto - 5000000;
            System.out.println("Unidad adquirida");
            System.out.println("La ganancia total es de: " + "$" + GananciaFinal);
        }else {
            GananciaFinal = GananciaConImpuesto;
            System.out.println("No se ha comprado una unidad nueva");
            System.out.println("La ganancia total es de: " + GananciaFinal);
        }   
    }
    else {
        System.out.println("No es posible comprar unidades nuevas debido a que las ganancias no superan el monto de $10.000.000");
        GananciaFinal = GananciaConImpuesto;
        
    }
    input.close();

    ganancias.add(new Ganancias(DescuentoMantenimiento, GananciasColectivos, GananciaConImpuesto, GananciaFinal));
    System.out.println("Lista de ganancias creada" + ganancias);
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
            System.out.println("Colectivos guardados");
        }
    }

    public void ValidateAndSaveGanancias(Ganancias ganancias){
        gananciasDTO.saveGanancias(ganancias.getDescuentoMantenimiento(), ganancias.getGananciasColectivos(), ganancias.getGananciaConImpuesto(), ganancias.getGananciaFinal());
        System.out.println("Ganancias guardadas");
    }
}
