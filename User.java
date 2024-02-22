public class User{
    private String nom;
    private String prenom;
    private String dateDeNaissance;

    public User(String nom, String prenom, String dateDeNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
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
}