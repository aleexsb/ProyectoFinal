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

    public void saveGanancias(int DescuentoMantenimiento, int GananciasColectivos, int GananciaConImpuesto, int GananciaFinal){

        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            String query = "INSERT INTO proyecto_finalDota.ganancias (DescuentoMantenimiento, GananciasColectivos, GananciaConImpuesto, GananciaFinal) VALUES ('" + DescuentoMantenimiento +  "','" + GananciasColectivos + "','" + GananciaConImpuesto + "','" + GananciaFinal + "');";
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
                int GananciasColectivosBD = result.getInt("GananciasColectivos");
                int GananciaConImpuestoBD = result.getInt("GananciaConImpuesto");
                int GananciaFinalBD = result.getInt("GananciaFinal");
                ganancias.add(gananciasMapping.mapGanancias(DescuentoMantenimientoBD,GananciasColectivosBD, GananciaConImpuestoBD, GananciaFinalBD));
        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ganancias;
    }
}