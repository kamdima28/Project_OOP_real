
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_LogIn;

    @FXML
    private AnchorPane signUpFemale;

    @FXML
    private CheckBox signUpMale;

    @FXML
    private TextField singupCountry;

    @FXML
    private TextField singupLogin;

    @FXML
    private TextField singupName;

    @FXML
    private TextField singupPassword;

    @FXML
    private TextField singupSurname;

    @FXML
    public void LoginButton_clicked(ActionEvent actionEvent) throws IOException {
        btn_LogIn.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/LogIn.fxml")));
        Stage mainStage = new Stage();
        mainStage.initStyle(StageStyle.UNDECORATED);
        mainStage.setScene(new Scene(root));
        mainStage.show();
    }

}
