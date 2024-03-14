public class Cours{
    private Horaire horaire;
    private List<Group> groupe;
    private List<Matiere> matiere;
    private List<User> user;

    public Cours(Horaire horaire,Groupe groupe,Matiere matiere,User user){
        this.horaire=horaire;
        this.groupe=new ArrayList<>();
        this.matiere=new ArrayList<>();
        this.user=new ArrayList<>();
    }

    public void ajouteGroupe(Groupe groupe){
        this.groupe.add(groupe);
    }

    public void ajouteMatiere(Matiere matiere){
        this.matiere.add(matiere);
    }

    public void ajouteUser(User user){
        this.user.add(user);
    }
}