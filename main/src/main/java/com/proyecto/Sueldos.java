package com.proyecto;

public class Sueldos {
    private double SueldoBruto;
    private double SueldoNeto;

    public Sueldos (double newSueldoBruto, double newSueldoNeto){
        this.SueldoBruto = newSueldoBruto;
        this.SueldoNeto = newSueldoNeto;
    }

    public double getSueldoBruto(){
        return this.SueldoBruto;
    }

    public double getSueldoNeto(){
        return this.SueldoNeto;
    }

    public void setSueldoBruto(double newSueldoBruto){
        this.SueldoBruto = newSueldoBruto;
    }

    public void setSueldoNeto(double newSueldoNeto){
        this.SueldoNeto = newSueldoNeto;
    }

}
