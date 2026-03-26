package livres;

import java.util.ArrayList;

public class Serie {

    String nom;
    ArrayList<Ouvrage> listeOuvrages = new ArrayList<>();

    public Serie(ArrayList<Ouvrage> listeOuvrages, String nom)
    {
        this.listeOuvrages = listeOuvrages;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nom='" + nom + '\'' +
                ", listeOuvrages=" + listeOuvrages +
                '}';
    }
}
