package fr.aoc.main;

import fr.aoc.element.Stockage;
import fr.aoc.production.ChaineProduction;

import java.util.ArrayList;

class Usine {

    private ArrayList<ChaineProduction> listeChaine = new ArrayList<>();
    private Stockage stockage;
    private Fichier element;
    private Fichier chaines;

    Usine(){
    }

    /**
     * Chargement des données des fichiers csv fournis par l'utilisateur
     * @param pathElements chemin d'accès (absolu) du fichier éléments
     * @param pathChaines chemin d'accès (absolu) du fichier chaine
     * @return un booleen indiquant si les fichiers ont bien été chargé
     */
    boolean loadFichier(String pathElements, String pathChaines){
        this.element=new Fichier(pathElements);
        this.chaines=new Fichier(pathChaines);

        if(!(this.element.loadData()) || !(this.chaines.loadData())){
            return(false);
        }
        return false;
    }

    /*Gestion du stockage*/

    /**
     * Création du stockage à partir du fichier csv élément
     */
    public void creationStockage(){
        this.stockage=new Stockage(this.element.getData());
    }

    public void accèsDonnéeStockage(){

    }

    public void creationChaines(){
        for (int i = 0; i < chaines.getData().size(); i++) {

        }
    }

    public Stockage getStockage() {
        return stockage;
    }

    @Override
    public String toString() {
        return this.stockage.toString();
    }
}
