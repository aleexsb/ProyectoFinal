package com.proyecto;

public class SueldosMapping {
    
    public Sueldos mapSueldos(Double SueldoBrutoBD, Double SueldoNetoBD){
        Sueldos sueldos = new Sueldos(SueldoBrutoBD, SueldoNetoBD);
        return sueldos;
    }
}
