package Model;

public class ModelJeu {
    private Joeur joueur1;
    private Joeur joeur2;
    private Joeur joeurActuel;
    private Joeur joeurCible;

    public Joeur getJoeurActuel() {
        return joeurActuel;
    }

    public void setJoeurActuel(Joeur joeurActuel) {
        this.joeurActuel = joeurActuel;
    }

    public Joeur getJoeurCible() {
        return joeurCible;
    }

    public void setJoeurCible(Joeur joeurCible) {
        this.joeurCible = joeurCible;
    }

    @Override
    public String toString() {
        return "ModelJeu{" +
                "joueur1=" + joueur1 +
                ", joeur2=" + joeur2 +
                '}';
    }

    public ModelJeu(Joeur joueur1, Joeur joeur2) {
        this.joueur1 = joueur1;
        this.joeur2 = joeur2;
    }

    public boolean JoueurActifFrappe(int force){
        if(this.joeurActuel.frapperAutreJoueur(this.joeurCible, force)){
            return true;
        }
        return false;
    }

    public void tourSuivant(){
        Joeur temp= this.joeurActuel;
        joeurActuel = this.joeurCible;
        joeurCible= temp;

    }

}


