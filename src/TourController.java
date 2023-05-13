import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TourController  {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Questions;

    @FXML
    private Button btn_details1;

    @FXML
    private Button btn_details11;

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
    private Button btn_map1;


    @FXML
    void btnExit_clicked(ActionEvent event) {
        Stage stage = (Stage) btn_exit.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnMaps_clicked(ActionEvent event) {

    }

    @FXML
    void btnQuestions_clicked(ActionEvent event) throws IOException {
        btn_question.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/question.fxml")));
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
    void btnUser_clicked(ActionEvent event) {

    }
    @FXML
    void btn_details1_clicked(ActionEvent event) throws IOException {
        btn_details1.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/route1.fxml")));
        Stage mainStage = new Stage();
        mainStage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        mainStage.setScene(scene);
        mainStage.show();
    }
    @FXML
    void btnMap1_clicked(ActionEvent event) throws IOException {
        btn_map1.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/map1.fxml")));
        Stage mainStage = new Stage();
        mainStage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        mainStage.setScene(scene);
        mainStage.show();

    }
}
