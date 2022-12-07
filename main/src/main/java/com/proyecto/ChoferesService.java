package com.proyecto;

import java.util.ArrayList;

public class ChoferesService {
    
    ChoferesDTO choferesDTO = new ChoferesDTO();

    // SueldosDTO sueldosDTO = new SueldosDTO();

    public int CantidadChoferes(){
        ArrayList<Choferes> choferes = choferesDTO.getChoferes();
        return choferes.size();
    }

    public ArrayList<Choferes> getChoferes(){
        ArrayList <Choferes> choferes = choferesDTO.getChoferes();
        return choferes;
    }

    /*public ArrayList<Sueldos> getSueldos(){
        ArrayList <Sueldos> sueldos = sueldosDTO.getSueldos();
        return sueldos;
    }*/

    public void ValidateAndSaveChoferes (Choferes choferes){
        if (choferes.getNombre() == null || choferes.getApellido() == null ){
            System.out.println("Error: Los choferes deben contar con al menos un nombre y un apellido");
        }
        else{
            choferesDTO.saveChoferes(choferes.getNombre(), choferes.getApellido(), choferes.getAntiguedad());
            System.out.println("OK");
        }
    }

   
    /*public Boolean ValorSueldos(Choferes choferes, Sueldos sueldos) {
        return sueldos.getSueldoBruto() == 70000.00 + (5000.00 * choferes.getAntiguedad())
        & sueldos.getSueldoNeto() == 70000.00 + (5000.00 * choferes.getAntiguedad()) * 0.8;
    }*/

    /*public void ValidateAndSaveSueldos(Sueldos sueldos, Choferes choferes){
        System.out.println(sueldos.getSueldoBruto() == 70000.00 + (5000.00 * choferes.getAntiguedad()));
        System.out.println(sueldos.getSueldoNeto() == 70000.00 + (5000.00 * choferes.getAntiguedad()) * 0.8);
        sueldosDTO.saveSueldos(sueldos.setSueldoBruto(70000.00 + (5000.00 * choferes.getAntiguedad())), sueldos.setSueldoNeto(70000.00 + (5000.00 * choferes.getAntiguedad()) * 0.8));
    }*/

    /*public void ValorSueldoBruto(Choferes choferes){
        int SueldoBruto = 0;
        SueldoBruto = (70000 + (5000 * choferes.getAntiguedad()));
        System.out.println("El valor del sueldo bruto es de: " + SueldoBruto);
    }*/

    /*public void ValorSueldoNeto (Choferes choferes){
        Double SueldoNeto = 0.0;
        SueldoNeto = (70000 + (5000 * choferes.getAntiguedad()) * 0.8);
        System.out.println("El valor del sueldo neto es de: " + SueldoNeto);
    }*/
}
