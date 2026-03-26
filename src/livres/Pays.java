package livres;

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
        if (codePays.length() == 3)
        {
            if (codePays.matches("[A-Z]"))
            {
                estValide = true;
            }
        }
        else {
            System.out.println("Code du pays invalide.");
        }
        return estValide;
    }
}
