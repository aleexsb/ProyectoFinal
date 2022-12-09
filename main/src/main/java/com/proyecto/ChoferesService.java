package com.proyecto;

import java.util.ArrayList;

public class ChoferesService {
    
    ChoferesDTO choferesDTO = new ChoferesDTO();
    SueldosDTO sueldosDTO = new SueldosDTO();

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

    public void ValidateAndSaveSueldos(Sueldos sueldos){
        SueldosDTO sueldosDTO = new SueldosDTO();
        sueldosDTO.saveSueldos(sueldos.getSueldoBruto(), sueldos.getSueldoNeto());
    }

    public ArrayList<Sueldos> getSueldos(){
        ArrayList <Choferes> choferes = choferesDTO.getChoferes();
        ArrayList<Sueldos> sueldos = new ArrayList<Sueldos>();
        
        for(int x = 0 ; x < sueldos.size();x++){
            int sueldoBruto = 0;
            float sueldoNeto = 0;
            if(choferes.get(x).getAntiguedad() > 0 ){
                sueldoBruto = sueldos.get(x).getSueldoBruto() + (choferes.get(x).getAntiguedad() * 5000);
                sueldoNeto = sueldoBruto*0.8f;
                if (sueldoBruto>150000){
                    sueldoBruto=sueldoBruto-4500;
                    sueldoNeto = sueldoBruto*0.8f;
                }
            }else{
                sueldoBruto = 7000;
                sueldoNeto = sueldoBruto*0.8f;
            }

            sueldos.add(new Sueldos(sueldoBruto, sueldoNeto));
        }
        System.out.println("JSON de sueldos creado" + sueldos);
        return sueldos;
    }
}