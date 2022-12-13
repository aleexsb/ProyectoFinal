package com.proyecto;

import org.json.simple.JSONObject;

public class ChoferesBuilder {
    public Choferes builderChoferes(JSONObject object){
        JSONObject choferes = (JSONObject) object.get("1");
        String Nombre = (String) choferes.get("Nombre");
        String Apellido = (String) choferes.get("Apellido");
        Long Antiguedad = (Long) choferes.get("Antiguedad");
        Long Linea_FK = (Long) choferes.get("Linea_FK");

        
        Choferes resultChoferes = new Choferes(Nombre, Apellido, Antiguedad.intValue(), Linea_FK.intValue());
        return resultChoferes;
    }

    public Sueldos builderSueldos(JSONObject object){
        JSONObject sueldos = (JSONObject) object.get("7");
        Long SueldoBruto = (Long) sueldos.get("SueldoBruto");
        Long SueldoNeto = (Long) sueldos.get("SueldoNeto");

        Sueldos resultSueldos = new Sueldos(SueldoBruto.intValue(),SueldoNeto.intValue());
        return resultSueldos;
    }
}
