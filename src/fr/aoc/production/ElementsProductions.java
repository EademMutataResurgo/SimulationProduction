package fr.aoc.production;

import java.util.ArrayList;

abstract class ElementsProductions {

    private ArrayList flux=new ArrayList();//liste des elements entrants ou sortants


    /**
     * Calcul les valeurs des flux à partir du niveau d'activation de la chaine de production associée
     * @param nivActivation niveau d'activation de la chaine de production associé
     * @param qtElement liste des éléments traités dans la chaine de production associé
     * @return
     */
    public ArrayList fonctionnement(int nivActivation, ArrayList<Integer> qtElement){
        ArrayList quantite=new ArrayList();
        for (int i = 0; i < flux.size(); i++) {
            quantite.add(qtElement.get(i)*nivActivation);
        }

        return(quantite);
    }

    /**
     * redfinition abstract de toString
     * @return description de la méthode
     */
    @Override
    public abstract String toString();
}
