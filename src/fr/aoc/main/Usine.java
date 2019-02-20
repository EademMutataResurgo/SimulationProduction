package fr.aoc.main;

import fr.aoc.element.Stockage;
import fr.aoc.production.ChaineProduction;

import java.util.ArrayList;

public class Usine {

    private ArrayList<ChaineProduction> listeChaine = new ArrayList<ChaineProduction>();
    private Stockage stockage;
    private Fichier element;
    private Fichier chaines;

    public Usine(){
    }

    public boolean loadFichier(String pathElements, String pathChaines){
        this.element=new Fichier(pathElements);
        this.chaines=new Fichier(pathChaines);

        if(!(this.element.loadData()) || !(this.chaines.loadData())){
            return(false);
        }
        return false;
    }

    public void creationStockage(){
        this.stockage=new Stockage(this.element.getData());
    }

    public void creationChaines(){
        for (int i = 0; i < chaines.getData().size(); i++) {

        }
    }

    @Override
    public String toString() {
        return this.stockage.toString();
    }
}
