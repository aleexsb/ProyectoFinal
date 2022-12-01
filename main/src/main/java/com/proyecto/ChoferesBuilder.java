package com.proyecto;

import org.json.simple.JSONObject;

public class ChoferesBuilder {
    public Choferes builderChoferes(JSONObject object){
        JSONObject choferes = (JSONObject) object.get("choferes");
        String Nombre = (String) choferes.get("Nombre");
        String Apellido = (String) choferes.get("Apellido");
        int Antiguedad = (int) choferes.get("Antiguedad");
        
        Choferes resultChoferes = new Choferes(Nombre, Apellido, Antiguedad);
        return resultChoferes;
    }
}
