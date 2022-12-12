package com.proyecto;

public class ChoferesMapping {
    
    public Choferes mapChoferes(String NombreBD, String ApellidoBD, int AntiguedadBD, int Linea_FKBD){
        Choferes choferes = new Choferes(NombreBD, ApellidoBD, AntiguedadBD, Linea_FKBD);
        return choferes;
    }
}
