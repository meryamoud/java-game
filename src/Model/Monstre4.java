package Model;

public class Monstre4 extends Monstre{
    public Monstre4(int vie, int force, int defense, String nom) {
        super(vie, force, defense, nom);
    }

    public void reagirFrappe(){
        this.defense += 4;

    }
}
