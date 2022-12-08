package com.proyecto;

public class Sueldos {
    private int SueldoBruto;
    private float SueldoNeto;
    private String nombre;
    private String apellido;

    public Sueldos (int newSueldoBruto, float newSueldoNeto, String newnombre, String newapellido){
        this.SueldoBruto = newSueldoBruto;
        this.SueldoNeto = newSueldoNeto;
        this.nombre = newnombre;
        this.apellido = newapellido;
    }

    public int getSueldoBruto(){
        return this.SueldoBruto;
    }

    public float getSueldoNeto(){
        return this.SueldoNeto;
    }

    public String getnombre(){
        return this.nombre;
    }

    public String getapellido(){
        return this.apellido;
    }

    public void setSueldoBruto(int newSueldoBruto){
        this.SueldoBruto = newSueldoBruto;
    }

    public void setSueldoNeto(float newSueldoNeto){
        this.SueldoNeto = newSueldoNeto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

}
