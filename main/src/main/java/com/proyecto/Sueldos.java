package com.proyecto;

public class Sueldos {
    private int SueldoBruto;
    private int SueldoNeto;

    public Sueldos (int newSueldoBruto, int newSueldoNeto){
        this.SueldoBruto = newSueldoBruto;
        this.SueldoNeto = newSueldoNeto;
    }

    public int getSueldoBruto(){
        return this.SueldoBruto;
    }

    public int getSueldoNeto(){
        return this.SueldoNeto;
    }

    public void setSueldoBruto(int newSueldoBruto){
        this.SueldoBruto = newSueldoBruto;
    }

    public void setSueldoNeto(int newSueldoNeto){
        this.SueldoNeto = newSueldoNeto;
    }
}
