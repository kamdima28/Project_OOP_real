
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import Classes.questions;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class AppController {
    questions Question = new questions();
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
    private ImageView btn_exit;

    @FXML
    private ImageView btn_maps;

    @FXML
    private ImageView btn_question;

    @FXML
    private ImageView btn_settings;

    @FXML
    private ImageView btn_user;

    @FXML
    private TextField budget_field;

    @FXML
    private AnchorPane mainBar;

    @FXML
    void btnQuestions_clicked(MouseEvent event){
        Questions.setVisible(true);
    }

    @FXML
    void btnExit_clicked(MouseEvent event) {
        Stage stage = (Stage) btn_exit.getScene().getWindow();
        stage.close();
    }
    @FXML
    void btnMaps_clicked(MouseEvent event) {
    }

    @FXML
    void btnUser_clicked(MouseEvent event) {
    }
    @FXML
    void btn_Save_clicked(MouseEvent event) {
        String budget;
        budget = budget_field.getText();
        if( Integer.parseInt(budget) <= 100){
            Question.setBudget("100-");
        }else {
            Question.setBudget("100+");
        }
    }
    @FXML
    void btn_TwoDays_clicked(ActionEvent event) {
        Question.setTime("2");
    }
    @FXML
    void initialize() {
         btn_OneDay.setOnAction(e -> {
             Question.setTime("1");
         });
         btn_TwoDays.setOnAction(e -> {
             Question.setTime("2");
         });
    }
}
