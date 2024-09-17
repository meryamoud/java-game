package Model;

public class Monstre {
    private int vie;
    private int force;
    private int defense;
    private String nom;

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Monstre(int vie, int force, int defense, String nom) {
        this.vie = vie;
        this.force = force;
        this.defense = defense;
        this.nom = nom;
    }
    public void submitFrappe(int force) {
        this.vie -= force;
    }

    @Override
    public String toString() {
        return "Monstre{" +
                "vie=" + vie +
                ", force=" + force +
                ", defense=" + defense +
                ", nom='" + nom + '\'' +
                '}';
    }
}
