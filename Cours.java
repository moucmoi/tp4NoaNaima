import java.util.List;
import java.util.ArrayList;

public class Cours{
    private Horaire horaire;
    private List<Groupe> groupe;
    private List<Matiere> matiere;
    private User user;

    public Cours(Horaire horaire,Groupe groupe,Matiere matiere,User user){
        this.horaire=horaire;
        this.groupe=new ArrayList<>();
        this.matiere=new ArrayList<>();
        this.user=user;
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

    public void setGroupe(Groupe groupe) {
        this.groupe.add(groupe);
    }

    public List<Matiere> getMatiere() {
        return this.matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere.add(matiere);
    }

    public List<User> getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user.add(user);     
    }

    public void ajouteGroupe(Groupe groupe){
        this.groupe.add(groupe);
    }

    public void ajouteMatiere(Matiere matiere){
        this.matiere.add(matiere);
    }
}