package Model;

public class Monstre1 extends Monstre{
    public Monstre1(int vie, int force, int defense, String nom) {
        super(vie, force, defense, nom);
    }

    public void reagirFrappe(){
        this.defense += 1;
    }
}
