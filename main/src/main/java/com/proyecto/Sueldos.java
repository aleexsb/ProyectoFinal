package com.proyecto;

public class Sueldos {
    private Double SueldoBruto;
    private Double SueldoNeto;

    public Sueldos (Double newSueldoBruto, Double newSueldoNeto){
        this.SueldoBruto = newSueldoBruto;
        this.SueldoNeto = newSueldoNeto;
    }

    public Double getSueldoBruto(){
        return this.SueldoBruto;
    }

    public Double getSueldoNeto(){
        return this.SueldoNeto;
    }

    public void setSueldoBruto(Double newSueldoBruto){
        this.SueldoBruto = newSueldoBruto;
    }

    public void setSueldoNeto(Double newSueldoNeto){
        this.SueldoNeto = newSueldoNeto;
    }

}
