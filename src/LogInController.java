import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;

public class LogInController {
    @FXML
    private Button LogInButton;
    @FXML
    private Button CanselButton;
    @FXML
    private Button RegisterButton;
    @FXML
    private TextField login_field;
    @FXML
    private TextField password_field;
    public void CanselButton_clicked(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) CanselButton.getScene().getWindow();
        stage.close();

    }

    public void LoginButton_clicked(ActionEvent actionEvent) throws IOException{

        String user, pass;
        pass = password_field.getText();
        user = login_field.getText();
        if(user.equals("user") && pass.equals("user")) {

            LogInButton.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/app.fxml")));
            Stage mainStage = new Stage();
            mainStage.initStyle(StageStyle.TRANSPARENT);
            Scene scene = new Scene(root);
            scene.setFill(Color.TRANSPARENT);
            mainStage.setScene(scene);
            mainStage.show();

        }else

            JOptionPane.showMessageDialog(null, "Uncorrect login or password!");
            login_field.clear();
            password_field.clear();

    }
    public void RegisterButton_clicked(ActionEvent actionEvent) throws IOException {

        RegisterButton.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/register.fxml")));
        Stage mainStage = new Stage();
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
        mainStage.show();

    }
}
