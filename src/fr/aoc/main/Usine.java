package fr.aoc.main;

import fr.aoc.element.Stockage;
import fr.aoc.production.ChaineProduction;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Usine {

    private ArrayList<ChaineProduction> listeChaine = new ArrayList<>();
    private Stockage stockage;
    private Fichier element;
    private Fichier chaines;
    private ArrayList<ChaineProduction> chaineProd;

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

    public ArrayList<ChaineProduction> getChaineProd(){
        return this.chaineProd;
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
        ArrayList<ChaineProduction> chainesProd = new ArrayList<>();
        for (String[] elem : this.chaines.getData()) {
            chainesProd.add(new ChaineProduction(elem[0], elem[1], 1, elem[2], elem[3]));
        }
        this.chaineProd = chainesProd;
    }

    public Map<String, String> calculConso() {
        Map<String, String> dico = new HashMap<String, String>();
        for (int i = 0; i < this.chaineProd.size(); i++) {
            if (this.chaineProd.get(i).getNivActivation() > 0) {
                for (int j = 0; j < this.chaineProd.get(i).getElemProd().get(0).flux.length; j = j + 2) {
                    if (dico.containsKey(this.chaineProd.get(i).getElemProd().get(0).flux[j])) {
                        double temp1 = Double.parseDouble(this.chaineProd.get(i).getElemProd().get(0).flux[j +1]);
                        double temp2 = Double.parseDouble(dico.get(this.chaineProd.get(i).getElemProd().get(0).flux[j]).toString());
                        double temp3 = temp1 + temp2;
                        String temp = "" + temp3;
                        dico.replace(this.chaineProd.get(i).getElemProd().get(0).flux[j], temp);
                    } else {
                        dico.put(this.chaineProd.get(i).getElemProd().get(0).flux[j], this.chaineProd.get(i).getElemProd().get(0).flux[j + 1]);
                    }
                }
            }

        }
        return dico;
    }

    public boolean verificationChaine() {
        boolean chainePossible = true;
        Map<String, String> conso = new HashMap<String, String>();
        conso = this.calculConso();

        for (int i = 0; i < this.stockage.getStock().size(); i++) {
           if (conso.containsKey(this.stockage.getStock().get(i).getCode())) {
               double consomme = Double.parseDouble(conso.get(this.stockage.getStock().get(i).getCode()));
               if (consomme > this.stockage.getStock().get(i).getQuantite()) {
                   chainePossible = false;
               }
           }
        }
        return chainePossible;
    }

    public Map<String, String> calculProduction() {
        Map<String, String> dico = new HashMap<String, String>();
        for (int i = 0; i < this.chaineProd.size(); i++) {
            if (this.chaineProd.get(i).getNivActivation() > 0) {
                for (int j = 0; j < this.chaineProd.get(i).getElemProd().get(1).flux.length; j = j + 2) {
                    if (dico.containsKey(this.chaineProd.get(i).getElemProd().get(1).flux[j])) {
                        double temp1 = Double.parseDouble(this.chaineProd.get(i).getElemProd().get(1).flux[j +1]);
                        double temp2 = Double.parseDouble(dico.get(this.chaineProd.get(i).getElemProd().get(1).flux[j]).toString());
                        double temp3 = temp1 + temp2;
                        String temp = "" + temp3;
                        dico.replace(this.chaineProd.get(i).getElemProd().get(1).flux[j], temp);
                    } else {
                        dico.put(this.chaineProd.get(i).getElemProd().get(1).flux[j], this.chaineProd.get(i).getElemProd().get(1).flux[j + 1]);
                    }
                }
            }

        }
        return dico;
    }

    public Stockage getStockage() {
        return stockage;
    }

    @Override
    public String toString() {
        return this.stockage.toString();
    }
}
