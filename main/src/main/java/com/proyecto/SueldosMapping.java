package com.proyecto;

public class SueldosMapping {
    
    public Sueldos mapSueldos(int SueldoBrutoBD, float SueldoNetoBD, String NombreBD, String ApellidoBD){
        Sueldos sueldos = new Sueldos(SueldoBrutoBD, SueldoNetoBD, NombreBD, ApellidoBD);
        return sueldos;
    }
}
