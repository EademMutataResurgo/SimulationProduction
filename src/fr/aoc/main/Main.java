package fr.aoc.main;

import fr.aoc.production.ChaineProduction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] arg){
        Usine usine=new Usine();
        ArrayList<ChaineProduction> chaineProd;
        usine.loadFichier("/home/colleoni_vancia/Bureau/Cours/Projet_java/elements.csv","/home/colleoni_vancia/Bureau/Cours/Projet_java/chaines.csv");
        usine.creationStockage();
        System.out.println(usine.toString());
        usine.creationChaines();

        /* Test de la partie simulation de production */

        for (int i = 0; i < usine.getChaineProd().size(); i++) {
            System.out.println(usine.getChaineProd().get(i).toString());
        }

        Map<String, String> conso = new HashMap<String, String>();
        conso = usine.calculConso();

        System.out.println(conso.toString());

        boolean possible;
        possible = usine.verificationChaine();

        System.out.println(possible);

        Map<String, String> prod = new HashMap<String, String>();
        prod = usine.calculProduction();

        System.out.println(prod.toString());

    }


}