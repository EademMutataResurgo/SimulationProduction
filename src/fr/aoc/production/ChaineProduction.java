package fr.aoc.production;

import java.util.ArrayList;

public class ChaineProduction {
    private String code;
    private String nom;
    private int nivActivation;
    private ArrayList<ElementsProductions> elemProd= new ArrayList<>();//0:Entree,1:Sortie

    /**
     *Constructeur de la classe ChaineProduction
     * @param code code alphanumérique de la chaine de production
     * @param nom nom de la chaine de production
     * @param entree donnée de flux de l'entrée de la chaine
     * @param sortie donnée de flux de la sortie de la chaine
     */
    public ChaineProduction(String code,String nom,int nivActivation,String entree, String sortie){
        this.code=code;
        this.nom=nom;
        this.nivActivation=nivActivation;
        this.elemProd.add(new EntreeProduction(entree));
        this.elemProd.add(new SortieProduction(sortie));
    }

    public ArrayList<ElementsProductions> getElemProd() {
        return this.elemProd;
    }

    public int getNivActivation() {
        return this.nivActivation;
    }

    /**
     * Permet de set le niveau d'activation de la chaîne de production, qui doit être positif, 0 correspondant à une chaine ne produisant pas
     * @param nivActivation niveau d'activation de la chaine de production, définit par l'utilisateur, doit être positif
     */
    public void setNivActivation(int nivActivation) {
        if(nivActivation>=0) {
            this.nivActivation = nivActivation;
        }
        else{
            System.out.println("Niveau d'activation de la chaine "+this.code+" "+this.nom+" incorrect, valeur par defaut à 0");
            this.nivActivation=0;
        }
    }

    public String toString() {
        return "Code cp: " + this.code + "; nom cp: " + this.nom + "; niveau d'activation: " + this.nivActivation + "; éléments en entrée et en sortie: " + this.elemProd.toString();
    }

    public void production(String[] etatStock){

    }
}