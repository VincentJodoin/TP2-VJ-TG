package livres;

import java.util.ArrayList;

public class Serie {

    int nom;
    ArrayList<Ouvrage> listeOuvrages = new ArrayList<>();

    public Serie(ArrayList<Ouvrage> listeOuvrages, int nom)
    {
        this.listeOuvrages = listeOuvrages;
        this.nom = nom;
    }
}
