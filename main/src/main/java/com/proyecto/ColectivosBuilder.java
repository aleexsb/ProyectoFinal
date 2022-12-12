package com.proyecto;

import org.json.simple.JSONObject;

public class ColectivosBuilder {
    public Colectivos builderColectivos(JSONObject object){
        JSONObject colectivos = (JSONObject) object.get("0");
        Long Linea = (Long) colectivos.get("Linea");
        Long Unidades = (Long) colectivos.get("Unidades");
        Long IngresoMensual = (Long) colectivos.get("IngresoMensual");
        Long Mantenimiento = (Long) colectivos.get("Mantenimiento");

        
        Colectivos resultColectivos = new Colectivos(Linea.intValue(), Unidades.intValue(), IngresoMensual.intValue(),Mantenimiento.intValue());
        return resultColectivos;
    }

    public Ganancias builderGanancias(JSONObject object){
        JSONObject ganancias = (JSONObject) object.get("1");
        Long DescuentoMantenimiento = (Long) ganancias.get("DescuentoMantenimiento");
        Long GananciasColectivos = (Long) ganancias.get("GananciasColectivos");
        Long GananciaConImpuesto = (Long) ganancias.get("GananciaConImpuesto");
        Long GananciaFinal = (Long) ganancias.get("GananciaFinal");

        Ganancias resultGanancias = new Ganancias(DescuentoMantenimiento.intValue(), GananciasColectivos.intValue(), GananciaConImpuesto.intValue(), GananciaFinal.intValue());
        return resultGanancias;
    }
} 
