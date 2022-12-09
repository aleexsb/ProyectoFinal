package com.proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SueldosDTO {

    static final String BD_Conexion = "jdbc:mysql://localhost:3306/";
    static final String Usuario_BD = "root";
    static final String Contrasena_BD = "root";

    public void saveSueldos(int SueldoBruto, float SueldoNeto){

        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            String query = "INSERT INTO proyecto_finalDota.sueldos (SueldoBruto, SueldoNeto) VALUES ('" + SueldoBruto + "','" + SueldoNeto + "');";
            stmt.executeUpdate(query);
            
            System.out.println("Persistio en base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Sueldos> getSueldos(){

        SueldosMapping sueldosMapping = new SueldosMapping();
        ArrayList<Sueldos> sueldos = new ArrayList<Sueldos>();
    
        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            String query = "select * from proyecto_finalDota.sueldos a ;";
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                int SueldoBrutoBD = result.getInt("SueldoBruto");
                float SueldoNetoBD = result.getFloat("SueldoNeto");
                sueldos.add(sueldosMapping.mapSueldos(SueldoBrutoBD, SueldoNetoBD));
        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sueldos;
    }
    
}