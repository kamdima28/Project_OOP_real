import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import ChangingScene.ChangingScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UserController extends ChangingScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Questions;

    @FXML
    private Button btn_acount;

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
    private Button btn_tourMap;

    @FXML
    void btnTourMap_clicked(ActionEvent event) throws IOException {
        btn_tourMap.getScene().getWindow().hide();
        changingSceneToTours();
    }

    @FXML
    void btnAcount_clicked(ActionEvent event) throws IOException {

        btn_acount.getScene().getWindow().hide();
        changingSceneToLogIn();
    }

    @FXML
    void btnExit_clicked(ActionEvent event) {
        Stage stage = (Stage) btn_exit.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnMaps_clicked(ActionEvent event) {

    }

    @FXML
    void btnQuestions_clicked(ActionEvent event) {

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

}
