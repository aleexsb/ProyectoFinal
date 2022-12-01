package com.proyecto;

import org.json.simple.JSONObject;

public class ColectivosBuilder {
    public Colectivos builderColectivos(JSONObject object){
        JSONObject colectivos = (JSONObject) object.get("colectivos");
        int Linea = (int) colectivos.get("Linea");
        int Unidades = (int) colectivos.get("Unidades");
        long IngresoMensual = (long) colectivos.get("IngresoMensual");
        long Mantenimiento = (long) colectivos.get("Mantenimiento");

        
        Colectivos resultColectivos = new Colectivos(Linea, Unidades, IngresoMensual,Mantenimiento);
        return resultColectivos;
    }
} 
