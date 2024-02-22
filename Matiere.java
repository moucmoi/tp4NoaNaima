import java.util.List;
import java.util.ArrayList;

public class Matiere {
    private String nomMatiere;
    private List<Cours> lesCours;

    public Matiere(String nom){
        this.nomMatiere = nom;
        this.lesCours = new Arraylist<>();
    }

    public getNom(){
        return this.nom;
    }

    public ajouteCours(Cours cour){
        this.lesCours.add(cour);
    }
}
