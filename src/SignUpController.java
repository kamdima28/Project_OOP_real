import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import ChangingScene.ChangingScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SignUpController extends ChangingScene {

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
        changingSceneToLogIn();
    }

}
