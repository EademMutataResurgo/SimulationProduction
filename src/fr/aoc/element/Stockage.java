package fr.aoc.element;

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

            //on remplace les NA du fichier par des -1 pour éviter les problèmes lors du cast en double
            if(elem[5].equals("NA")){
                elem[5]="-1";
            }
            if(elem[4].equals("NA")){
                elem[4]="-1";
            }

            this.stock.add(new Elements(elem[0],elem[1],Double.parseDouble(elem[2]),elem[3],Double.parseDouble(elem[4]),Double.parseDouble(elem[5])));
        }
    }

    /**
     * redéfinition de toString
     * @return les informations de l'ensemble des éléments du stock
     */
    @Override
    public String toString() {
        String desc="Stock de l'usine \n";
        for (int i = 0; i < stock.size(); i++) {
            desc+=stock.get(i).toString()+" \n";
        }
        return desc;
    }
}
