package fr.aoc.main;

import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fichier {

    private String path=new String();
    private ArrayList<String[]> data=new ArrayList<String[]>();

    public Fichier(String path){
        this.path=path;
    }

    public boolean loadData(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(this.path));
            String line = new String();
            reader.readLine();
            while((line = reader.readLine())!=null){
                String[] lineSplit = line.split(";");
                this.data.add(lineSplit);
            }
            return true;
        }
        catch (IOException e){
            System.out.println("Problème de chargement du fichier "+ this.path);
            System.out.println("Erreur: "+e);
            return false;
        }
    }

    public ArrayList<String[]> getData() {
        return data;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
