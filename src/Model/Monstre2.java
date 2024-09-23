package Model;

public class Monstre2 extends Monstre{
    public Monstre2(int vie, int force, int defense, String nom) {
        super(vie, force, defense, nom);
    }

    public void reagirFrappe(){
        this.defense += 2;

    }
}
