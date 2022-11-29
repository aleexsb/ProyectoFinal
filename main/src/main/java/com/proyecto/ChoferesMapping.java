package com.proyecto;

public class ChoferesMapping {
    
    public Choferes mapChoferes(String NombreBD, String ApellidoBD, int AntiguedadBD){
        Choferes choferes = new Choferes(NombreBD, ApellidoBD, AntiguedadBD);
        return choferes;
    }
}
