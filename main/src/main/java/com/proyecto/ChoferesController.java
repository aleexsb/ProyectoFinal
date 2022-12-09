package com.proyecto;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class ChoferesController {

    ChoferesService choferesService = new ChoferesService();

    public void getChoferes(){

        ArrayList<Choferes> choferesBase = choferesService.getChoferes();

        JSONObject choferes = new JSONObject();

        int x = 0;
        while(x < choferesBase.size()) {

            JSONObject getChoferes = new JSONObject();

            getChoferes.put("Nombre", choferesBase.get(x).getNombre());
            getChoferes.put("Apellido", choferesBase.get(x).getApellido());
            getChoferes.put("Antiguedad", choferesBase.get(x).getAntiguedad());

            choferes.put(x, getChoferes);

            x++;
        }      

        JSONArray ChoferesList = new JSONArray();

        ChoferesList.add(choferes);

        try(FileWriter file = new FileWriter("GetChoferes.json")){
            file.write(ChoferesList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void postChoferes(){
        
        JSONParser jsonParser = new JSONParser();
        ChoferesBuilder choferesBuilder = new ChoferesBuilder();

        try(FileReader reader = new FileReader("PostChoferes.json")){
            Object obj = jsonParser.parse(reader);
            JSONArray jsonChoferes = (JSONArray) obj;
            Choferes choferes1 = choferesBuilder.builderChoferes((JSONObject)jsonChoferes.get(0));
            System.out.println(choferes1);
            choferesService.ValidateAndSaveChoferes(choferes1);

        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public void getSueldos(){

        ArrayList<Sueldos> sueldosBase = choferesService.getSueldos();

        JSONObject sueldosJSON = new JSONObject();

        int x = 0;

        while(x < sueldosBase.size()){
            JSONObject getSueldos = new JSONObject();

            getSueldos.put("SueldoBruto", sueldosBase.get(x).getSueldoBruto());
            getSueldos.put("SueldoNeto", sueldosBase.get(x).getSueldoBruto());

            sueldosJSON.put(x, getSueldos);

            x++;
        }

        JSONArray SueldosList = new JSONArray();

        SueldosList.add(sueldosJSON);

        try(FileWriter file = new FileWriter("GetSueldos.json")){
            file.write(SueldosList.toJSONString());
            file.flush();
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }


    public void postSueldos(){
        JSONParser jsonParser = new JSONParser();
        ChoferesBuilder sueldosBuilder = new ChoferesBuilder();

        try(FileReader reader = new FileReader("PostSueldos.json")){
            Object obj = jsonParser.parse(reader);
            JSONArray jsonSueldos = (JSONArray) obj;
            Sueldos sueldoss = sueldosBuilder.builderSueldos((JSONObject)jsonSueldos.get(0));
            System.out.println(sueldoss);
            choferesService.ValidateAndSaveSueldos(sueldoss);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
