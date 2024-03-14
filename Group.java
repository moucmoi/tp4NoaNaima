Import java.util.List;
Import java.util.ArrayList;

public class Group{
    private List<Etudiant> etudiant;
    private List<Cours> cours;

    public Groupe(){
        this.etudiant=new ArrayList<>();
        this.cours=new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant){
        this.etudiant.add(etudiant);
    }

    public void ajouterEtudiant(Cours cours){
        this.etudiant.add(cours);
    }

    public List getEtudiant(){
        return this.etudiant;
    }

    public List getCours{
        return this.cours;
    }
}