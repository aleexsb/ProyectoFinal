package com.proyecto;

import java.util.ArrayList;

public class ChoferesService {
    
    ChoferesDTO choferesDTO = new ChoferesDTO();

    public int CantidadChoferes(){
        ArrayList<Choferes> choferes = choferesDTO.getChoferes();
        return choferes.size();
    }

    public ArrayList<Choferes> getChoferes(){
        ArrayList <Choferes> choferes = choferesDTO.getChoferes();
        return choferes;
    }

    public void ValidateAndSaveChoferes (Choferes choferes){
        if (choferes.getNombre() == null || choferes.getApellido() == null ){
            System.out.println("Error: Los choferes deben contar con al menos un nombre y un apellido");
        }
        else{
            choferesDTO.saveChoferes(choferes.getNombre(), choferes.getApellido(), choferes.getAntiguedad());
            System.out.println("OK");
        }
    }

   
    public void ValorSueldoBruto(Choferes choferes) {
        long SueldoBruto = 0;
        SueldoBruto = 70000 + (5000 * choferes.getAntiguedad());
        System.out.println("El valor del sueldo bruto es de : " + SueldoBruto);
    }

    public void ValorSueldoNeto (Choferes choferes){
        Double SueldoNeto = 0.0;
        SueldoNeto = (70000 + (5000 * choferes.getAntiguedad()) * 0.8);
        System.out.println("El valor del sueldo neto es de: " + SueldoNeto);
    }
}
