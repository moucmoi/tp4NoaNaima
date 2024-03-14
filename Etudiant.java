import java.util.List;
import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private List<Groupe> groupe;
    private List<Note> notes;

    public Etudiant(String nom, String prenom, String dateDeNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.groupe=new ArrayList<>();
        this.notes=new ArrayList<>();
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeNaissance(){
        return this.dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void ajouteGroupe(Groupe groupe){
        this.groupe.add(groupe);
    }

    public void ajouteNote(Note note){
        this.notes.add(note);
    }
}