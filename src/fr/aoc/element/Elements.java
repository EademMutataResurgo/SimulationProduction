package fr.aoc.element;

public class Elements {
    private String code;
    private String nom;
    private double quantite;
    private String unite;
    private double prixAchat;
    private double prixVente;

    /**
     * constructeur de Elements
     * définit à partir des informations données par le stockage
     * @param code
     * @param nom
     * @param quantite
     * @param unite
     * @param prixAchat -1 si non achetable
     * @param prixVente -1 si non vendable
     */
    protected Elements(String code,String nom,double quantite,String unite,double prixAchat,double prixVente){
        this.code=code;
        this.nom=nom;
        this.quantite=quantite;
        this.unite=unite;
        this.prixAchat=prixAchat;
        this.prixVente=prixVente;
    }

    /**
     * redfinition de toString
     * @return description de l'élément
     */
    public String toString(){
        return ("Element "+this.code+" "+this.nom+", quantité: "+this.quantite+" "+this.unite+", prix d'achat: "+this.prixAchat+", prix de vente: "+this.prixVente);
    }
}
