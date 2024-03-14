import java.util.List;
import java.util.ArrayList;

public class Horaire{
    private String startDate;
    private String endDate;
    private List<Cours> cours;
    private List<Salle> salle;

    public Horaire(String start, String end){
        this.startDate = start;
        this.endDate = end;
        this.cours=new ArrayList<>();
        this.salle=new ArrayList<>(); 
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void ajouteCours(Cours cours){
        this.cours.add(cours);
    }

    public void ajouteSalle(Salle salle){
        this.salle.add(salle);
    }
}