package com.proyecto;

import org.json.simple.JSONObject;

public class ColectivosBuilder {
    public Colectivos builderColectivos(JSONObject object){
        JSONObject colectivos = (JSONObject) object.get("colectivos");
        Long Linea = (Long) colectivos.get("Linea");
        Long Unidades = (Long) colectivos.get("Unidades");
        Long IngresoMensual = (Long) colectivos.get("IngresoMensual");
        Long Mantenimiento = (Long) colectivos.get("Mantenimiento");

        
        Colectivos resultColectivos = new Colectivos(Linea.intValue(), Unidades.intValue(), IngresoMensual,Mantenimiento);
        return resultColectivos;
    }
} 
