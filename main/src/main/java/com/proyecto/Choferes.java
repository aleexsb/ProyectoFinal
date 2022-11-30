package com.proyecto;

public class Choferes {
    private String Nombre;
    private String Apellido;
    private int Antiguedad;
    private int SueldoBruto;


    public Choferes (String newNombre, String newApellido, int newAntiguedad, int newSueldoBruto){
        this.Nombre = newNombre;
        this.Apellido = newApellido;
        this.Antiguedad = newAntiguedad;
        this.SueldoBruto = newSueldoBruto;
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

    public int getSueldoBruto(){
        return this.SueldoBruto;
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

    public void getSueldoBruto(int newSueldoBruto){
        this.SueldoBruto = newSueldoBruto;
    }
}
