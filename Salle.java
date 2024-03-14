public class Salle{
    private int numéro;
    private Horaire horaire;
    
    public Salle(int numéro, Horaire horaire) {
        this.numéro = numéro;
        this.horaire = horaire;
    }
    public int getNuméro() {
        return numéro;
    }
    public void setNuméro(int numéro) {
        this.numéro = numéro;
    }
    public Horaire getHoraire() {
        return horaire;
    }
    public void setHoraire(Horaire horaire) {
        this.horaire = horaire;
    }
}