package com.proyecto;

public class Choferes {
    private String Nombre;
    private String Apellido;
    private int Antiguedad;


    public Choferes (String newNombre, String newApellido, int newAntiguedad){
        this.Nombre = newNombre;
        this.Apellido = newApellido;
        this.Antiguedad = newAntiguedad;
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

    public void setNombre(String newNombre){
        this.Nombre = newNombre;
    }

    public void setApellido(String newApellido){
        this.Apellido = newApellido;
    }

    public void setAntiguedad(int newAntiguedad){
        this.Antiguedad = newAntiguedad;
    }
}
