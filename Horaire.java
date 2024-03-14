public class Horaire{
    private String startDate;
    private String endDate;

    public Horaire(String start, String end){
        this.startDate = start;
        this.endDate = end;
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
}