package fr.aoc.production;

import java.util.ArrayList;

abstract class ElementsProductions {

    private String[] flux;;//liste des elements entrants ou sortants, indice pair=code element, indice impair=quantité

    public ElementsProductions(String data){
        data=data.replaceAll("[()]",""); //regex à verifier
        this.flux=data.split(",");
    }

    /**
     * Calcul les éléments utilisés durant la production renvoie la liste de se qui a été produit ou consommer
     * @param nivAct niveau d'activation de la chaîne de production associé
     * @return renvoie la liste de se qui a été produit ou consommer
     */
    protected ArrayList<String[]> evaluation(int nivAct){
        ArrayList<String[]> production = new ArrayList<String[]>();
        String[] buffer=new String[2];
        for (int i = 0; i < this.flux.length; i=i+2) {
            buffer[0]=this.flux[i];
            buffer[1]=String.valueOf(Float.parseFloat(this.flux[i+1])*nivAct);
            production.add(buffer);
        }
        return(production);
    }


    /**
     * redfinition abstract de toString
     * @return description de la méthode
     */
    @Override
    public abstract String toString();
}
