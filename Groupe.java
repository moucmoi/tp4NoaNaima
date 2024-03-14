import java.util.List;
import java.util.ArrayList;

public class Groupe{ 
    private int numero;
    private List<Etudiant> etudiant;
    private List<Cours> cours;

    public Groupe(int numero){
        this.numero=numero;
        this.etudiant = new ArrayList<>();
        this.cours = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant){
        this.etudiant.add(etudiant);
    }

    public List<Etudiant> getEtudiant(){
        return this.etudiant;
    }

    public List<Cours> getCours(){
        return this.cours;
    }
}