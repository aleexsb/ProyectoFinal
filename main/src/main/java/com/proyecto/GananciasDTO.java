package com.proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GananciasDTO {

    static final String BD_Conexion = "jdbc:mysql://localhost:3306/";
    static final String Usuario_BD = "root";
    static final String Contrasena_BD = "root";

    public void saveSueldos(int DescuentoMantenimiento, int DescuentoMantenimientoFinal, int GananciasColectivos){

        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            String query = "INSERT INTO proyecto_finalDota.ganancias (DescuentoMantenimiento, DescuentoMantenimientoFinal, GananciasColectivos) VALUES ('" + DescuentoMantenimiento + "','" + DescuentoMantenimientoFinal + "','" + GananciasColectivos + "');";
            stmt.executeUpdate(query);
            
            System.out.println("Persistio en base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Ganancias> getGanancias(){

        GananciasMapping gananciasMapping = new GananciasMapping();
        ArrayList<Ganancias> ganancias = new ArrayList<Ganancias>();
    
        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            String query = "select * from proyecto_finalDota.ganancias a ;";
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                int DescuentoMantenimientoBD = result.getInt("DescuentoMantenimiento");
                int DescuentoMantenimientoFinalBD = result.getInt("DescuentoMantenimientoFinal");
                int GananciasColectivosBD = result.getInt("GananciasColectivos");
                ganancias.add(gananciasMapping.mapGanancias(DescuentoMantenimientoBD, DescuentoMantenimientoFinalBD,GananciasColectivosBD));
        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ganancias;
    }
}