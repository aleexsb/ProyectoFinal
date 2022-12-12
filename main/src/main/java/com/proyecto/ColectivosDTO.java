package com.proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ColectivosDTO {

    static final String BD_Conexion = "jdbc:mysql://localhost:3306/";
    static final String Usuario_BD = "root";
    static final String Contrasena_BD = "root";

    public void saveColectivos(int Linea, int Unidades, int IngresoMensual, int Mantenimiento){

        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            String query = "INSERT INTO proyecto_finalDota.colectivos (Linea,Unidades,IngresoMensual, Mantenimiento) VALUES ('" + Linea + "','" + Unidades + "','" + IngresoMensual + "','" + Mantenimiento + "');";
            stmt.executeUpdate(query);
    
            System.out.println("Persistio en base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Colectivos> getColectivos(){

        ColectivosMapping colectivoMapping = new ColectivosMapping();
        ArrayList<Colectivos> colectivos = new ArrayList<Colectivos>();
    
        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            String query = "select * from proyecto_finalDota.colectivos a ;";
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                int LineaBD = result.getInt("Linea");
                int UnidadesBD = result.getInt("Unidades");
                int IngresoMensualBD = result.getInt("IngresoMensual");
                int MantenimientoBD = result.getInt("Mantenimiento");
                colectivos.add(colectivoMapping.mapColectivos(LineaBD, UnidadesBD, IngresoMensualBD, MantenimientoBD));
        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return colectivos;
    }
    
}
