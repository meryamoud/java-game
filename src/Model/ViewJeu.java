package Model;

import java.util.Scanner;

public class ViewJeu {
    private ControllerJeu controller;

    public ViewJeu(ControllerJeu controller) {
        this.controller = controller;
    }

    public ControllerJeu getController() {
        return controller;
    }

    public void setController(ControllerJeu controller) {
        this.controller = controller;
    }


    public void run(){
        while(this.controller.isJeuEnCours()){
            System.out.println(this.controller.affichageDebutTourJoueur());
            Scanner continuer = new Scanner(System.in);
            System.out.println("si vous voulez continuer entrer OUI sinon QUITTER");
            String continuerr = continuer.nextLine();
            if(continuerr.equals("OUI")){
                Scanner entrer = new Scanner(System.in);
                System.out.println("si vous voulez frapper taper FRAPPER, si vous voulez afficher les données de l'adverse tapez AFFICHERD si vous voulez afficher les données de vous tappez AFFICHERM");
                String entrerr = entrer.nextLine();
                if(entrerr.equals("FRAPPER")){
                    this.controller.getModel().JoueurActifFrappe(this.controller.getModel().getJoeurActuel().getMonstre().getForce());
                    Scanner choisir = new Scanner(System.in);
                    System.out.println("si vous voulez chosir un monstre entrer le mot clé : VIE, DEFENSE, FORCE sinon choisi RANDOM");
                    String choisirr = choisir.nextLine();
                    if(choisirr.equals("VIE")){
                        Scanner taux = new Scanner(System.in);
                        System.out.println("entrer la valeur souhaité avoir");
                        int tauxx = Integer.parseInt(taux.nextLine());
                        this.controller.getModel().getJoeurActuel().choisirMonstreVie(tauxx);
                    }
                    if(choisirr.equals("DEFENSE")){
                        Scanner taux = new Scanner(System.in);
                        System.out.println("entrer la valeur souhaité avoir");
                        int tauxx = Integer.parseInt(taux.nextLine());
                        this.controller.getModel().getJoeurActuel().choisirMonstreDefense(tauxx);
                    }
                    if(choisirr.equals("FORCE")){
                        Scanner taux = new Scanner(System.in);
                        System.out.println("entrer la valeur souhaité avoir");
                        int tauxx = Integer.parseInt(taux.nextLine());
                        this.controller.getModel().getJoeurActuel().choisirMonstreForce(tauxx);
                    }
                    this.controller.deroulementTour();
                    this.controller.updateStatusJeu();
                }
                if(entrerr.equals("AFFICHERD")){
                    System.out.println(this.controller.getModel().getJoeurCible().toString());
                }
                if(entrerr.equals("AFFICHERM")){
                    System.out.println(this.controller.getModel().getJoeurActuel().toString());
                }


            }
            if(continuerr.equals("QUITTER")){
                System.out.println("Au revoir!!");
                break;
            }

        }
        if(this.controller.getVainqueur() != null){
            System.out.println("le vainqueure est : " + this.controller.getVainqueur().toString());
        }
        else{
            System.out.println("pas de vainqueur");
        }






    }
}
