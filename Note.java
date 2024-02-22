public class Note{
    private String nomControle;
    private int note;
    private String appreciation;
    private int rang;
    private Etudiant etudiant;
    private Matiere matiere;

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
