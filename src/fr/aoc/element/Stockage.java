package fr.aoc.element;

import fr.aoc.main.Fichier;

import java.util.ArrayList;

public class Stockage {

    private ArrayList<Elements> stock=new ArrayList<Elements>();

    /**
     * Crée l'ensemble des éléments à partir des données fournies et stock dans une liste ces éléments
     * @param inventaire Donnée contenu le fichier csv elements. Récupérer dans la classe fichier et envoyé par Usine.
     */
    public Stockage(ArrayList<String[]> inventaire){
        for (int i = 0; i < inventaire.size(); i++) {
            String[] elem = inventaire.get(i);
            this.stock.add(new Elements(elem[0],elem[1],Float.parseFloat(elem[2]),elem[3],Float.parseFloat(elem[4]),Float.parseFloat(elem[5])));
        }
    }


    @Override
    public String toString() {
        String desc="";
        for (int i = 0; i < stock.size(); i++) {
            desc+="";
        }
        return desc;
    }
}
