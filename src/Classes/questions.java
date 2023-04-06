package Classes;


public class questions {

    String Time;
    boolean Hotel;
    String Budget;
    String Cuisine;
    boolean Art;
    boolean Historycal;
    boolean parks;
    public questions(){}


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

    public void setMuseums(boolean art) {
        this.Art = art;
    }

    public void setHolyPlace(boolean history) {
        this.Historycal = history;
    }

    public void setParks(boolean parks) {
        this.parks = parks;
    }

    public questions(String time, boolean hotel, String budget, String cuisine, boolean Art, boolean history) {
        Time = time;
        Hotel = hotel;
        Budget = budget;
        Cuisine = cuisine;
        this.Art = Art;
        this.Historycal = history;
    }



}