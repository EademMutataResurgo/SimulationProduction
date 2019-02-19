package fr.aoc.element;

/**
 *
 */
public class Elements {
    private String code;
    private String nom;
    private float quantite;
    private String unite;
    private float prixAchat;
    private float prixVente;

    /**
     *
     * constructeur de Elements
     * @param code
     * @param nom
     * @param quantite
     * @param unite
     * @param prixAchat
     * @param prixVente
     */
    protected Elements(String code,String nom,float quantite,String unite,float prixAchat,float prixVente){
        this.code=code;
        this.nom=nom;
        this.quantite=quantite;
        this.unite=unite;
        this.prixAchat=prixAchat;
        this.prixVente=prixVente;
    }

    /**
     * redfinition abstract de toString
     * @return description de la méthode
     */
    public String toString(){
        return ("");
    }
}
