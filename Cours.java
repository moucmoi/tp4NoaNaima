import java.util.List;
import java.util.ArrayList;

public class Cours{
    private Horaire horaire;
    private List<Groupe> groupe;
    private Matiere matiere;
    private User user;

    public Cours(Horaire horaire,Matiere matiere,User user){
        this.horaire = horaire;
        this.groupe = new ArrayList<>();
        this.matiere = matiere;
        this.user = user;
    }

    public Horaire getHoraire() {
        return this.horaire;
    }

    public void setHoraire(Horaire horaire) {
        this.horaire = horaire;
    }

    public List<Groupe> getGroupe() {
        return this.groupe;
    }

    public Matiere getMatiere() {
        return this.matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere=matiere;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;     
    }

    public void ajouteGroupe(Groupe groupe){
        this.groupe.add(groupe);
    }
}