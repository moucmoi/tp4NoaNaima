import java.util.List;
import java.util.ArrayList;

public class Matiere {
    private String nomMatiere;
    private List<Cours> lesCours;
    private List<Note> notes;

    public Matiere(String nom){
        this.nomMatiere = nom;
        this.lesCours = new ArrayList<>();
        this.notes = new ArrayList<>();
    }

    public String getNomMatiere(){
        return this.nomMatiere;
    }

    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }

    public List<Cours> getLesCours() {
        return this.lesCours;
    }

    public void ajouteCours(Cours cours){
        this.lesCours.add(cours);
    }

    public void ajouteNote(Note note){
        this.notes.add(note);
    }
}
