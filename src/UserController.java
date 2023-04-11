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

public class UserController {

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
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/tours.fxml")));
        Stage mainStage = new Stage();
        mainStage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void btnAcount_clicked(ActionEvent event) throws IOException {

        btn_acount.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/LogIn.fxml")));
        Stage mainStage = new Stage();
        mainStage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        mainStage.setScene(scene);
        mainStage.show();
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

}
