package com.proyecto;

public class Sueldos {
    private int SueldoBruto;
    private float SueldoNeto;

    public Sueldos (int newSueldoBruto, float newSueldoNeto){
        this.SueldoBruto = newSueldoBruto;
        this.SueldoNeto = newSueldoNeto;
    }

    public int getSueldoBruto(){
        return this.SueldoBruto;
    }

    public float getSueldoNeto(){
        return this.SueldoNeto;
    }

    public void setSueldoBruto(int newSueldoBruto){
        this.SueldoBruto = newSueldoBruto;
    }

    public void setSueldoNeto(float newSueldoNeto){
        this.SueldoNeto = newSueldoNeto;
    }
}
