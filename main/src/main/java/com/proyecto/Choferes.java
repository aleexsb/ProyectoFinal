package com.proyecto;

public class Choferes {
    private String Nombre;
    private String Apellido;
    private int Antiguedad;
    private int Linea_FK;


    public Choferes (String newNombre, String newApellido, int newAntiguedad, int newLinea_FK){
        this.Nombre = newNombre;
        this.Apellido = newApellido;
        this.Antiguedad = newAntiguedad;
        this.Linea_FK = newLinea_FK;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public String getApellido(){
        return this.Apellido;
    }

    public int getAntiguedad(){
        return this.Antiguedad;
    }

    public int getLinea(){
        return this.Linea_FK;
    }

    public void setNombre(String newNombre){
        this.Nombre = newNombre;
    }

    public void setApellido(String newApellido){
        this.Apellido = newApellido;
    }

    public void setAntiguedad(int newAntiguedad){
        this.Antiguedad = newAntiguedad;
    }

    public void setLinea(int newLinea_FK){
        this.Linea_FK = newLinea_FK;
    }
}
