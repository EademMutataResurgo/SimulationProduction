package fr.aoc.production;
import java.awt.*;

/**
 *
 */
public class ChaineProduction {
    private String code;
    private String nom;
    private String desc;
    private int nivActivation;
    private List ElemProd=new List(2);//1:Entree,2:Sortie

    /**
     *
     * @param code
     * @param nom
     * @param desc
     * @param nivActivation
     */
    public ChaineProduction(String code,String nom,String desc,int nivActivation){
        this.code=code;
        this.nom=nom;
        this.desc=desc;
        this.nivActivation=nivActivation;
    }

    /**
     *
     * @return
     */
    public void evaluer(){

    }
}
