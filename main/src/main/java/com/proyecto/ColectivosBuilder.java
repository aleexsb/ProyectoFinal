package com.proyecto;

import org.json.simple.JSONObject;

public class ColectivosBuilder {
    public Colectivos builderColectivos(JSONObject object){
        JSONObject colectivos = (JSONObject) object.get("colectivos");
        int Linea = (int) colectivos.get("Linea");
        int Unidades = (int) colectivos.get("Unidades");
        Long IngresoMensual = (Long) colectivos.get("IngresoMensual");
        Long Mantenimiento = (Long) colectivos.get("Mantenimiento");

        
        Colectivos resultColectivos = new Colectivos(Linea, Unidades, IngresoMensual,Mantenimiento);
        return resultColectivos;
    }
} 
