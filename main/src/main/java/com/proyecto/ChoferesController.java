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
        while(x < choferesBase.size() - 1) {

            JSONObject getChoferes = new JSONObject();

            getChoferes.put("Nombre", choferesBase.get(x).getNombre());
            getChoferes.put("Apellido", choferesBase.get(x).getApellido());
            getChoferes.put("Antiguedad", choferesBase.get(x).getAntiguedad());

            choferes.put(x, getChoferes);

            x++;
        }      

        JSONArray ChoferesList = new JSONArray();

        ChoferesList.add(choferes);

        try(FileWriter file = new FileWriter("Choferes.json")){
            file.write(ChoferesList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void postChoferes(){

        JSONParser jsonParser = new JSONParser();
        ChoferesBuilder choferesBuilder = new ChoferesBuilder();

        try(FileReader reader = new FileReader("Choferes.json")){
            Object obj = jsonParser.parse(reader);
            JSONArray jsonChoferes = (JSONArray) obj;
            Choferes choferes1 = choferesBuilder.builderChoferes((JSONObject)jsonChoferes.get(0));
            choferesService.ValidateAndSaveChoferes(choferes1);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
