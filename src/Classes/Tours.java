package Classes;


public class Tours {

    String Time;
    boolean Hotel;
    String Budget;
    String Cuisine;
    boolean Art;
    boolean Historycal;
    boolean parks;
    public Tours(){}


    public void setTime(String time) {
        Time = time;
    }

    public void setHotel(boolean hotel) {
        Hotel = hotel;
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


    public Tours(String time, boolean hotel, String budget, String cuisine, boolean Art, boolean history) {
        Time = time;
        Hotel = hotel;
        Budget = budget;
        Cuisine = cuisine;
        this.Art = Art;
        this.Historycal = history;
    }



}