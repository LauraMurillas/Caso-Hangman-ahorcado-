package myProject;

import java.util.ArrayList;
import java.util.Random;

public class Diccionario {

    private ArrayList<String> diccionario = new ArrayList<String>();

    //constructor
    public Diccionario(){
        FileManager fileManager = new FileManager();
        diccionario = fileManager.lecturaFile();
    }

    //metodo que genera un numero aleatorio entre la cantidad de elementos del arraylist
    public String getFrase(){
        Random aleatorio = new Random();
        return diccionario.get(aleatorio.nextInt(diccionario.size()));
    }
}
