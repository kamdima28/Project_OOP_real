import ChangingScene.ChangingScene;
import Classes.Tours;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;


public class QuestionController extends ChangingScene {
    Tours Question = new Tours();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Questions;

    @FXML
    private RadioButton btn_Art;

    @FXML
    private RadioButton btn_EurKitchen;

    @FXML
    private RadioButton btn_Historical;

    @FXML
    private RadioButton btn_OneDay;

    @FXML
    private Button btn_Save;

    @FXML
    private RadioButton btn_TwoDays;

    @FXML
    private RadioButton btn_UkrKitchen;

    @FXML
    private Button btn_exit;

    @FXML
    private Button btn_maps;

    @FXML
    private Button btn_question;

    @FXML
    private Button btn_tour;

    @FXML
    private Button btn_user;

    @FXML
    private TextField budget_field;

    @FXML
    void btnQuestions_clicked(ActionEvent event){

    }

    @FXML
    void btnExit_clicked(ActionEvent event) {

        Stage stage = (Stage) btn_exit.getScene().getWindow();
        stage.close();

    }
    @FXML
    void btnMaps_clicked(ActionEvent event) throws IOException {

    }

    @FXML
    void btnTour_clicked(ActionEvent event) throws IOException {

        btn_maps.getScene().getWindow().hide();
        changingSceneToTours();

    }
    @FXML
    void btnUser_clicked(ActionEvent event) throws IOException {

        btn_user.getScene().getWindow().hide();
        changingSceneToUser();

    }

    boolean time = false;
    boolean cuisine = false;
    boolean Budget = false;
    boolean place = false;
    @FXML
    void btn_Save_clicked(ActionEvent event) {
        String budget;
        budget = budget_field.getText();

        if( !time || !cuisine || !place){
            JOptionPane.showMessageDialog(null, "Answer all the questions!");
        }else {
            if (Integer.parseInt(budget) <= 100) {
                Question.setBudget("100-");
                Budget = true;
            } else {
                Question.setBudget("100+");
                Budget = true;
            }
            JOptionPane.showMessageDialog(null, "Your data was saved!");
        }
    }
    @FXML
    void initialize() {
         btn_OneDay.setOnAction(e -> {
             Question.setTime("1");
             if(time){
                 time = false;
             }else {
                 time = true;
             }
         });
         btn_TwoDays.setOnAction(e -> {
             Question.setTime("2");
             if(time){
                 time = false;
             }else {
                 time = true;
             }
         });
         btn_UkrKitchen.setOnAction(e -> {
             Question.setCuisine("UKR");
             if(cuisine){
                 cuisine = false;
             }else
                 cuisine = true;
         });
         btn_EurKitchen.setOnAction(e -> {
             Question.setCuisine("EUR");
             if(cuisine){
                 cuisine = false;
             }else
                 cuisine = true;
         });
         btn_Art.setOnAction(e -> {
             Question.setArt(true);
             Question.setHistory(false);
             if(place){
                 place = false;
             }else
                 place = true;
         });
         btn_Historical.setOnAction(e -> {
             Question.setArt(false);
             Question.setHistory(true);
             if(place){
                 place = false;
             }else
                 place = true;
         });
    }
}
