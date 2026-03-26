package livres;

import java.util.WeakHashMap;

public class Pays
{
    private String nom;
    private String codePays;


    public Pays(String codePays, String nom)
    {
        setNom(nom);
        setCodePays(codePays);
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCodePays(String codePays)
    {
        if (verifierCodePays(codePays))
        {
            this.codePays = codePays;
        }
    }

    public String getCodePays()
    {
        return this.codePays;
    }
    public Boolean verifierCodePays(String codePays)
    {
        Boolean estValide = false;
        if (codePays.matches("[A-Z]{3}"))
        {
                estValide = true;

        }
        else {
            System.out.println("Code du pays invalide.");
        }
        return estValide;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", codePays='" + codePays + '\'' +
                '}';
    }
}
