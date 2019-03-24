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
     * @param code code alphanumérique de l'élément
     * @param nom nom de l'élément
     * @param quantite quantité en stock de l'élément
     * @param unite unité dans laquelle est exprimée la quantité
     * @param prixAchat -1 si non achetable
     * @param prixVente -1 si non vendable
     */
    Elements(String code, String nom, double quantite, String unite, double prixAchat, double prixVente){
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

    public void setQuantite(double quantite) {
        if(quantite>this.quantite){
            System.out.println("La quantité ne peut pas être négative!\nValeur par defaut à 0");
            this.quantite=0;
        }
        else{
            this.quantite = quantite;
        }
    }

    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public double getQuantite() {
        return quantite;
    }

    public String getUnite() {
        return unite;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public double getPrixVente() {
        return prixVente;
    }
}
