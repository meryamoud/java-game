package Model;

public class Monstre3 extends Monstre{
    public Monstre3(int vie, int force, int defense, String nom) {
        super(vie, force, defense, nom);
    }

    public void reagirFrappe(){
        this.defense += 3;

    }
}
