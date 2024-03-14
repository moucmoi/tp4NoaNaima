public class User{
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private List<Cours> cours;

    public User(String nom, String prenom, String dateDeNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.cours=new ArrayList<>();
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
        return this.nom=nom;
    }

    public void setPrenom(String prenom){
        return this.prenom=prenom;
    }

    public void setDateDeNaissance(String dateDeNaissance){
        return this.dateDeNaissance=dateDeNaissance;
    }

    public void ajouteCours(Cours cours){
        this.cours.add(cours);
    }
}