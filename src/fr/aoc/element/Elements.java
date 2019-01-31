package fr.aoc.element;

/**
 *
 */
abstract class Elements {
    private String code;
    private String nom;
    private float quantite;
    private String unite;
    private float prixAchat;

    /**
     *
     * constructeur de Elements
     * @param code
     * @param nom
     * @param quantite
     * @param unite
     * @param prixAchat
     */
    protected Elements(String code,String nom,float quantite,String unite,float prixAchat){
        this.code=code;
        this.nom=nom;
        this.quantite=quantite;
        this.unite=unite;
        this.prixAchat=prixAchat;
    }

    /**
     * redfinition abstract de toString
     * @return description de la méthode
     */
    public abstract String toString();
}
