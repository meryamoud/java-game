package Model;

public class Monstre5 extends Monstre{
    public Monstre5(int vie, int force, int defense, String nom) {
        super(vie, force, defense, nom);
    }

    public void reagirFrappe(){
        this.defense += 5;

    }
}
