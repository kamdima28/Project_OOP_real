package Classes;

import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.*;

public class Route {


    int days;
    String budget;
    String Cuisine;
    String places;

    public int getDays() {
        return days;
    }

    public String getBudget() {
        return budget;
    }

    public String getCuisine() {
        return Cuisine;
    }

    public String getPlaces() {
        return places;
    }




    public Route(int days, String budget, String Cuisine, String places){
        this.days = days;
        this.budget = budget;
        this.Cuisine = Cuisine;
        this.places = places;

    }
    public Route(){

    }


}
