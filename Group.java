Import java.util.List;
Import java.util.ArrayList;

public class Group{
    private List<Etudiant> etudiant;
    private List<Cours> cours;

    public Group(){
        this.etudiant=new ArrayList<>();
        this.cours=new ArrayList<>();
    }
}