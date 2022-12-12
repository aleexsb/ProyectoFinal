package com.proyecto;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class ColectivosController {

    ColectivosService colectivosService = new ColectivosService();

    public void getColectivos(){

        ArrayList<Colectivos> colectivosBase = colectivosService.getColectivos();

        JSONObject colectivos = new JSONObject();

        int x = 0;
        while(x < colectivosBase.size()) {

            JSONObject getColectivos = new JSONObject();

            getColectivos.put("Linea", colectivosBase.get(x).getLinea());
            getColectivos.put("Unidades", colectivosBase.get(x).getUnidades());
            getColectivos.put("IngresoMensual", colectivosBase.get(x).getIngresoMensual());
            getColectivos.put("Mantenimiento", colectivosBase.get(x).getMantenimiento());


            colectivos.put(x, getColectivos);

            x++;
        }      

        JSONArray ColectivosList = new JSONArray();

        ColectivosList.add(colectivos);

        try(FileWriter file = new FileWriter("GetColectivos.json")){
            file.write(ColectivosList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    
    public void postColectivos(){

        JSONParser jsonParser = new JSONParser();
        ColectivosBuilder colectivosBuilder = new ColectivosBuilder();

        try(FileReader reader = new FileReader("PostColectivos.json")){
            Object obj = jsonParser.parse(reader);
            JSONArray jsonColectivos = (JSONArray) obj;
            Colectivos colectivos1 = colectivosBuilder.builderColectivos((JSONObject)jsonColectivos.get(0));
            colectivosService.ValidateAndSaveColectivos(colectivos1);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getGanancias(){

        ArrayList<Ganancias> gananciasBase = colectivosService.getGanancias();

        JSONObject ganancias = new JSONObject();

        int x = 0;
        while(x < gananciasBase.size()) {

            JSONObject getGanancias = new JSONObject();

            getGanancias.put("DescuentoMantenimiento", gananciasBase.get(x).getDescuentoMantenimiento());
            getGanancias.put("GananciasColectivos", gananciasBase.get(x).getGananciasColectivos());
            getGanancias.put("GananciaConImpuesto", gananciasBase.get(x).getGananciaConImpuesto());
            getGanancias.put("GananciaFinal", gananciasBase.get(x).getGananciaFinal());


            ganancias.put(x, getGanancias);

            x++;
        }      

        JSONArray GananciasList = new JSONArray();

        GananciasList.add(ganancias);

        try(FileWriter file = new FileWriter("GetGanancias.json")){
            file.write(GananciasList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void postGanancias(){

        JSONParser jsonParser = new JSONParser();
        ColectivosBuilder gananciasBuilder = new ColectivosBuilder();

        try(FileReader reader = new FileReader("PostGanancias.json")){
            Object obj = jsonParser.parse(reader);
            JSONArray jsonGanancias = (JSONArray) obj;
            Ganancias ganancias1 = gananciasBuilder.builderGanancias((JSONObject)jsonGanancias.get(0));
            colectivosService.ValidateAndSaveGanancias(ganancias1);

        } catch (Exception e){
            e.printStackTrace();
        }
    }





}
