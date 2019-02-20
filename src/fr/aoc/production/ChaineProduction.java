package fr.aoc.production;
import java.util.ArrayList;

/**
 *
 */
public class ChaineProduction {
    private String code;
    private String nom;
    private int nivActivation;
    private ArrayList ElemProd=new ArrayList<ElementsProductions>();//1:Entree,2:Sortie

    /**
     *Constructeur de la classe ChaineProduction
     * @param code
     * @param nom
     */
    public ChaineProduction(String code,String nom){
        this.code=code;
        this.nom=nom;
    }

    /**
     * Permet de set le niveau d'activation de la chaîne de production, qui doit être positif, 0 correspondant à une chaine ne produisant pas
     * @param nivActivation niveau d'activation de la chaine de production, définit par l'utilisateur
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

    /**
     * Crée les élements de production (entrée et sortie) à partir des données fournies
     * @param elemProd
     */
    public void setElemProd(ArrayList elemProd) {
        ElemProd = elemProd;
    }

    /**
     * Simule le fonctionnement de la chaine de production et renvoie les éléments consommés et les éléments produits
     */
    public void evaluer(){
        ElemProd.get(0);
        ElemProd.get(1);
    }
}