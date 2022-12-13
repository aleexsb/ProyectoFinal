package com.proyecto;

import java.util.ArrayList;

public class ChoferesService {
    
    ChoferesDTO choferesDTO = new ChoferesDTO();
    SueldosDTO sueldosDTO = new SueldosDTO();

    public int CantidadChoferes(){
        ArrayList<Choferes> choferes = choferesDTO.getChofer();
        return choferes.size();
    }

    public ArrayList<Choferes> getChoferes(){
        ArrayList <Choferes> choferes = choferesDTO.getChofer();
        return choferes;
    }

    public void ValidateAndSaveChoferes (Choferes choferes){
        if (choferes.getNombre() == null || choferes.getApellido() == null ){
            System.out.println("Error: Los choferes deben contar con al menos un nombre y un apellido");
        }
        else{
            choferesDTO.saveChoferes(choferes.getNombre(), choferes.getApellido(), choferes.getAntiguedad(), choferes.getLinea());
            System.out.println("Choferes guardados");
        }
    }

    public void ValidateAndSaveSueldos(Sueldos sueldos){
        sueldosDTO.saveSueldos(sueldos.getSueldoBruto(), sueldos.getSueldoNeto());
        System.out.println("Sueldos guardados");
    }

    public ArrayList<Sueldos> getSueldos(){
        ArrayList<Choferes> choferes = choferesDTO.getChofer();
        ArrayList<Sueldos> sueldos = new ArrayList<Sueldos>();
        for(int x = 0 ; x < choferes.size();x++){
            int sueldoBruto = 0;
            int sueldoNeto = 0;
            if(choferes.get(x).getAntiguedad() > 0 ){
                sueldoBruto = 70000 + (choferes.get(x).getAntiguedad() * 5000);
                sueldoNeto = (sueldoBruto * 80) / 100;
                if (sueldoBruto>150000){
                    sueldoBruto=sueldoBruto-4500;
                    sueldoNeto = (sueldoBruto * 80) / 100;
                }
            }else{
                sueldoBruto = 70000;
                sueldoNeto = (sueldoBruto * 80) / 100 ;
            }

            sueldos.add(new Sueldos(sueldoBruto, sueldoNeto));
        }
        System.out.println("Lista sueldos creada" + sueldos);
        return sueldos;
    }
}