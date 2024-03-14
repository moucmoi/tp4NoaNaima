import java.util.List;
import java.util.ArrayList;

public class Matiere {
    private String nomMatiere;
    private List<Cours> lesCours;

    public Matiere(String nom){
        this.nomMatiere = nom;
        this.lesCours = new ArrayList<>();
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

    public void setLesCours(List<Cours> lesCours) {
        this.lesCours = lesCours;
    }

    public void ajouteCours(Cours cours){
        this.lesCours.add(cours);
    }
}
