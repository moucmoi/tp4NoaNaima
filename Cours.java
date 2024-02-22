public Class Cours{
    private Horaire horaire;
    private Groupe groupe;
    private Matiere matiere;
    private User user;

    public Cours(Horaire horaire,Groupe groupe,Matiere matiere,User user){
        this.horaire=horaire;
        this.groupe=groupe;
        this.matiere=matiere;
        this.user=user;
    }
}