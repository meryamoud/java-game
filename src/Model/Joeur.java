package Model;

import java.util.Random;

public class Joeur {
    private String nom;
    private Monstre monstre;
    private Bestiaire bestie;
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



    public Monstre choisirMonstreVie(int vie){
        for (int i = 0; i < bestie.getEnclos().size(); i++) {
            if(bestie.getEnclos().get(i).getVie()==vie){
                return bestie.getEnclos().get(i);
            }
        }
        Random random = new Random();
        int randomIndex = random.nextInt(bestie.getEnclos().size());
        Monstre randomMonstre = bestie.getEnclos().get(randomIndex);
        return randomMonstre;
    }

    public Monstre choisirMonstreDefense(int defense){
        for (int i = 0; i < bestie.getEnclos().size(); i++) {
            if(bestie.getEnclos().get(i).getDefense()==defense){
                return bestie.getEnclos().get(i);
            }
        }
        Random random = new Random();
        int randomIndex = random.nextInt(bestie.getEnclos().size());
        Monstre randomMonstre = bestie.getEnclos().get(randomIndex);
        return randomMonstre;
    }

    public Monstre choisirMonstreForce(int force){
        for (int i = 0; i < bestie.getEnclos().size(); i++) {
            if(bestie.getEnclos().get(i).getForce()==force){
                return bestie.getEnclos().get(i);
            }
        }
        Random random = new Random();
        int randomIndex = random.nextInt(bestie.getEnclos().size());
        Monstre randomMonstre = bestie.getEnclos().get(randomIndex);
        return randomMonstre;
    }



    @Override
    public String toString() {
        return "Joeur{" +
                "nom='" + nom + '\'' +
                ", monstre=" + monstre +
                '}';
    }



}
