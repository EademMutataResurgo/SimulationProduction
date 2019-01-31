package fr.aoc.production;

import java.util.ArrayList;

abstract class ElementsProductions {

    private ArrayList flux=new ArrayList();//liste des elements entrants ou sortants

    /**
     * redfinition abstract de toString
     * @return description de la méthode
     */
    @Override
    public abstract String toString();
}
