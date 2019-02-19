package fr.aoc.production;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 */
public class ChaineProduction {
    private String code;
    private String nom;
    private String desc;
    private int nivActivation;
    private ArrayList ElemProd=new ArrayList<ElementsProductions>();//1:Entree,2:Sortie

    /**
     *
     * @param code
     * @param nom
     * @param desc
     * @param nivActivation
     */
    public ChaineProduction(String code,String nom,String desc,int nivActivation){
        this.code=code;
        this.nom=nom;
        this.desc=desc;
        this.nivActivation=nivActivation;
    }

    /**
     *Simule le fonctionnement de la chaine de production et renvoie les éléments consommés et les éléments produits
     */
    public void evaluer(){
        ElemProd.get(0);
        ElemProd.get(1);
    }
}
