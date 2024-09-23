import Model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Joeur joeur1 = new Joeur("maryem", new Monstre1(15, 12, 10, "Tiger"));
        Joeur joeur2 = new Joeur("malak", new Monstre2(15, 10, 15, "Lion"));


        ModelJeu model = new ModelJeu(joeur1, joeur2);
        model.setJoeurActuel(joeur1);
        model.setJoeurCible(joeur2);
        ControllerJeu controller = new ControllerJeu(model);
        ViewJeu view = new ViewJeu(controller);
        view.run();

    }

}
