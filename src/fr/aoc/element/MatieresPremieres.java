package fr.aoc.element;

/**
 *
 */
public class MatieresPremieres extends Elements {

    /**
     * consructeur de MatieresPremieres
     * appel le constructeur de Elements
     */
    public MatieresPremieres(String code,String nom,float quantite,String unite,float prixAchat){
        super(code,nom,quantite,unite,prixAchat);
    }

    /**
     * redefinition de toString
     * @return description de la classe MatieresPremieres
     */
    @Override
    public String toString(){
        return("test");
    }
}
