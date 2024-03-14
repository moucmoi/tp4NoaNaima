public class Cours{
    private Horaire horaire;
    private Groupe groupe;
    private Matiere matiere;
    private User user;

    public Cours(Horaire horaire,Groupe groupe,Matiere matiere,User user){
        this.horaire = horaire;
        this.groupe = groupe;
        this.matiere = matiere;
        this.user = user;
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
}