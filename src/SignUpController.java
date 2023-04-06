
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button signUpButton;

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
    void initialize() {

    }

}
