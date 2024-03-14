public class Note{
    private String nomControle;
    private int note;
    private String appreciation;
    private int rang;
    private Etudiant etudiant;
    private Matiere matiere;

    public void setNomControle(String nomControle) {
        this.nomControle = nomControle;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Note(String nomControle, int note, String appreciation, int rang, Etudiant etudiant, Matiere matiere){
        this.nomControle = nomControle;
        this.note = note;
        this.appreciation = appreciation;
        this.rang = rang;
        this.etudiant = etudiant;
        this.matiere = matiere;
    }

    public String getNomControle(){
        return this.nomControle;
    }

    public int getNote(){
        return this.note;
    }

    public String getAppreciation(){
        return this.appreciation;
    }

    public int getRang(){
        return this.rang;
    }

    public Etudiant getEtudiant(){
        return this.etudiant;
    }

    public Matiere getMatiere(){
        return this.matiere;
    }
}   
