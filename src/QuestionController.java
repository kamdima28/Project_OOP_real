
import Classes.Route;


import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Scanner;

import Classes.UserException;
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


public class QuestionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_btn;

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
    private DatePicker fromDate;

    @FXML
    private DatePicker toDate;

    @FXML
    private Button btn_tour;

    @FXML
    private Button btn_user;

    @FXML
    private TextField budget_field;

    @FXML
    private Button ADD_btn;

    @FXML
    private CheckBox ID_btn;

    @FXML
    private AnchorPane Q;

    @FXML
    private AnchorPane StudentPane;

    @FXML
    private CheckBox adult_btn;

    @FXML
    private Button Cansel_btn;

    @FXML
    private CheckBox child_btn;

    @FXML
    private TextField name_field;

    @FXML
    private TextField surname_field;


    @FXML
    void ADDBtn_clicked(ActionEvent event) {

    }

    @FXML
    void AdultBtn_clicled(ActionEvent event) {

    }

    @FXML
    void ChildBtn_clicled(ActionEvent event) {

    }

    @FXML
    void IDBtn_clicled(ActionEvent event) {

    }

    @FXML
    void canselBtn_clicked(ActionEvent event) throws IOException {
        Cansel_btn.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/question.fxml")));
        Stage mainStage = new Stage();
        mainStage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void addBtn_clicked(ActionEvent event) throws IOException {
        add_btn.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/question2.fxml")));
        Stage mainStage = new Stage();
        mainStage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        mainStage.setScene(scene);
        mainStage.show();

    }

    @FXML
    void btnQuestions_clicked(ActionEvent event) {

    }

    @FXML
    void btnExit_clicked(ActionEvent event) {

        Stage stage = (Stage) btn_exit.getScene().getWindow();
        stage.close();

    }

    @FXML
    void btnMaps_clicked(ActionEvent event) throws IOException {
        btn_maps.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/Place.fxml")));
        Stage mainStage = new Stage();
        mainStage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void btnTour_clicked(ActionEvent event) throws IOException {

        btn_maps.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/tours.fxml")));
        Stage mainStage = new Stage();
        mainStage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        mainStage.setScene(scene);
        mainStage.show();

    }

    @FXML
    void btnUser_clicked(ActionEvent event) throws IOException {

        btn_user.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/user.fxml")));
        Stage mainStage = new Stage();
        mainStage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        mainStage.setScene(scene);
        mainStage.show();

    }

    public int getTripDuration() {
        LocalDate startDate = fromDate.getValue();
        LocalDate endDate = toDate.getValue();

        try {
            if (startDate == null || endDate == null) {
                throw new IllegalArgumentException("The start or end date cannot be empty.");
            }

            return (int) ChronoUnit.DAYS.between(startDate, endDate);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
            return 0;
        }
    }

    @FXML
    void btn_Save_clicked(ActionEvent event) {
//        if( getTripDuration() > 2){
//            JOptionPane.showMessageDialog(null, "Error");
//            fromDate = null;
//            toDate = null;
//        }
//
//        if(getTripDuration() == 0 || budget_field == null || kitchen == null || places == null){
//            JOptionPane.showMessageDialog(null, "Error");
//
//        }
//        Route route = new Route(getTripDuration(), budget_field.getText(), kitchen, places);
//
////        byte[] Route;
////        Route = route.serialization(route);
//        try {
//            FileWriter writer = new FileWriter("Classes/nodes.txt", false);
//            writer.write(getTripDuration());
//            writer.write(budget_field.getText());
//            writer.write(kitchen);
//            writer.write(places);
//
//        } catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
    }

    String kitchen;
    String places;

    @FXML
    void initialize() throws Exception {
        btn_Save.setOnAction(e -> {
            if (getTripDuration() > 2) {
                JOptionPane.showMessageDialog(null, "Error ( > 2");
                fromDate = null;
                toDate = null;
            }

            if (getTripDuration() == 0 || budget_field == null || kitchen == null || places == null) {
                JOptionPane.showMessageDialog(null, "Error (null)");

            }
            Route route = new Route(getTripDuration(), budget_field.getText(), kitchen, places);

            try {
                // Створення FileOutputStream для збереження об'єкта у файл
                FileOutputStream fileOut = new FileOutputStream("person.ser");

                // Створення ObjectOutputStream для запису об'єкта у файл
                ObjectOutputStream out = new ObjectOutputStream(fileOut);

                // Запис об'єкта у файл
                out.writeObject(route);

                // Закриття потоку ObjectOutputStream та FileOutputStream
                out.close();
                fileOut.close();


            } catch (IOException n) {
                n.printStackTrace();
            }


        });
        btn_EurKitchen.setOnAction(e -> {
            kitchen = "Eur";
        });
        btn_UkrKitchen.setOnAction(e -> {
            kitchen = "Ukr";
        });
        btn_Art.setOnAction(e -> {
            places = "Nature";
        });
        btn_Historical.setOnAction(e -> {
            places = "Historical";
        });


    }
}
