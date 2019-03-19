package fr.aoc.main;

public class Main {
    public static void main(String[] arg){
        Usine usine=new Usine();
        usine.loadFichier("/home/cortes/IdeaProjects/elements.csv","/home/cortes/IdeaProjects/chaines.csv");
        usine.creationStockage();
        System.out.println(usine.toString());
        usine.creationChaines();
    }

}