package Model;

public class Joeur {
    private String nom;
    private Monstre monstre;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Monstre getMonstre() {
        return monstre;
    }

    public void setMonstre(Monstre monstre) {
        this.monstre = monstre;
    }

    public Joeur(String nom, Monstre monstre) {
        this.nom = nom;
        this.monstre = monstre;
    }

    public boolean subitFrappe(Joeur attaquant, int forceFrappe){
        this.monstre.submitFrappe(forceFrappe);
        if(this.monstre.getVie() < 0){
            return true;
        };
        return false;
    }
    public boolean frapperAutreJoueur(Joeur cible, int forceFrappe){
        if(cible.subitFrappe(this, forceFrappe)) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Joeur{" +
                "nom='" + nom + '\'' +
                ", monstre=" + monstre +
                '}';
    }


}
