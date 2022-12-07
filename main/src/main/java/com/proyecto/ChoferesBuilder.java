package com.proyecto;

import org.json.simple.JSONObject;

public class ChoferesBuilder {
    public Choferes builderChoferes(JSONObject object){
        JSONObject choferes = (JSONObject) object.get("5");
        String Nombre = (String) choferes.get("Nombre");
        String Apellido = (String) choferes.get("Apellido");
        Long Antiguedad = (Long) choferes.get("Antiguedad");
        
        Choferes resultChoferes = new Choferes(Nombre, Apellido, Antiguedad.intValue());
        return resultChoferes;
    }
}
