public class Cours{
    private Horaire horaire;
    private List<Group> groupe;
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

    public Groupe getGroupe() {
        return this.groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Matiere getMatiere() {
        return this.matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
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

    public void ajouteMatiere(Matiere matiere){
        this.matiere.add(matiere);
    }
}