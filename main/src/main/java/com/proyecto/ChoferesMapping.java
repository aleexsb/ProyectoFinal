package com.proyecto;

public class ChoferesMapping {
    
    public Choferes mapChoferes(String NombreBD, String ApellidoBD, int AntiguedadBD, int SueldoBrutoBD){
        Choferes choferes = new Choferes(NombreBD, ApellidoBD, AntiguedadBD, SueldoBrutoBD);
        return choferes;
    }
}
