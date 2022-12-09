package com.proyecto;

public class SueldosMapping {
    
    public Sueldos mapSueldos(int SueldoBrutoBD, float SueldoNetoBD){
        Sueldos sueldos = new Sueldos(SueldoBrutoBD, SueldoNetoBD);
        return sueldos;
    }
}
