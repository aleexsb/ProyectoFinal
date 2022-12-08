package com.proyecto;

public class Sueldos {
    private int SueldoBruto;
    private float SueldoNeto;
    private String Nombre;
    private String Apellido;

    public Sueldos (int newSueldoBruto, float newSueldoNeto, String newNombre, String newApellido){
        this.SueldoBruto = newSueldoBruto;
        this.SueldoNeto = newSueldoNeto;
        this.Nombre = newNombre;
        this.Apellido = newApellido;
    }

    public int getSueldoBruto(){
        return this.SueldoBruto;
    }

    public float getSueldoNeto(){
        return this.SueldoNeto;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public String getApellido(){
        return this.Apellido;
    }

    public void setSueldoBruto(int newSueldoBruto){
        this.SueldoBruto = newSueldoBruto;
    }

    public void setSueldoNeto(float newSueldoNeto){
        this.SueldoNeto = newSueldoNeto;
    }

    public void setNombre(String newNombre){
        this.Nombre = newNombre;
    }

    public void setApellido(String newApellido){
        this.Apellido = newApellido;
    }

}
