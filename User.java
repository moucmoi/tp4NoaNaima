import java.util.List;
import java.util.ArrayList;

public class User{
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private List<Cours> cours;

    public User(String nom, String prenom, String dateDeNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.cours = new ArrayList<>();
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public String getDateDeNaissance(){
        return this.dateDeNaissance;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setDateDeNaissance(String dateDeNaissance){
        this.dateDeNaissance = dateDeNaissance;
    }

    public void ajouteCours(Cours cours){
        this.cours.add(cours);
    }

    public void creationCours(String nom,Horaire horaire,List<Groupe> groupe,Matiere matiere){
        Cours cours=new Cours(nom, horaire, groupe, matiere, this);
    }
}