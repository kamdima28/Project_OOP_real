package Classes;


public class Tours {

    String Time;
    String Budget;
    String Cuisine;
    boolean Art;
    boolean Historycal;
    public Tours(){}


    public void setTime(String time) {
        Time = time;
    }

    public void setBudget(String budget) {
        Budget = budget;
    }

    public void setCuisine(String cuisine) {
        Cuisine = cuisine;
    }

    public void setArt(boolean art) {
        this.Art = art;
    }

    public void setHistory(boolean history) {
        this.Historycal = history;
    }


    public Tours(String time, String budget, String cuisine, boolean Art, boolean history) {
        Time = time;
        Budget = budget;
        Cuisine = cuisine;
        this.Art = Art;
        this.Historycal = history;
    }



}