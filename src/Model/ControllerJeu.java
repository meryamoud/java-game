package Model;
public class ControllerJeu {
    private ModelJeu model;
    private boolean jeuEnCours = true;
    private Joeur vainqueur;

    public ModelJeu getModel() {
        return model;
    }

    public void setModel(ModelJeu model) {
        this.model = model;
    }

    public boolean isJeuEnCours() {
        return jeuEnCours;
    }

    public void setJeuEnCours(boolean jeuEnCours) {
        this.jeuEnCours = jeuEnCours;
    }

    public void setVainqueur(Joeur vainqueur) {
        this.vainqueur = vainqueur;
    }

    public Joeur getVainqueur() {
        return vainqueur;
    }

    public ControllerJeu(ModelJeu model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ControllerJeu{" +
                "vainqueur=" + vainqueur +
                '}';
    }

    public void deroulementTour(){
        if(this.model.JoueurActifFrappe(this.model.getJoeurActuel().getMonstre().getForce())){
            this.jeuEnCours = false;
            vainqueur = this.model.getJoeurActuel();
        }
    }

    public boolean updateStatusJeu(){
        if(this.jeuEnCours){
            this.model.tourSuivant();
            return true;
        }
        return false;
    }

    public Joeur affichageDebutTourJoueur(){
        return  this.model.getJoeurActuel();
    }
}
