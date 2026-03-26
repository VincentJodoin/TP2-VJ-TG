package tests;

import livres.Auteur;
import livres.Pays;

public class TestPays {
    public static void main(String[] args) {
        Pays Mexique = new Pays("MEX" ,"Méxique");
        Auteur baba = new Auteur("baba","babababa",Mexique);
        baba.setPaysOrigine(Mexique);
        System.out.println(baba.toString());
    ;
    }
}
