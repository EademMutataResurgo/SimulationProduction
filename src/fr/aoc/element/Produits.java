package fr.aoc.element;

/**
 *
 */
public class Produits extends Elements {

    private float prixVente;

    /**
     * consructeur de Produits
     * appel le constructeur de Elements
     */
    public Produits(String code,String nom,float quantite,String unite,float prixAchat,float prixVente){
        super(code,nom,quantite,unite,prixAchat);
        this.prixVente=prixVente;
    }

    /**
     * redefinition de toString
     * @return description de la classe Produits
     */
    @Override
    public String toString(){
        return("test");
    }
}
