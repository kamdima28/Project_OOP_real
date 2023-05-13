import java.io.IOException;
import java.util.Objects;


import Classes.Admin;
import Classes.Student;
import Classes.User;
import Classes.UserException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.swing.*;
import Classes.UserException;
import javafx.stage.StageStyle;

public class LogInController {
    User user = new User("user", "user");
    Student student = new Student("student", "student");
    Admin admin = new Admin("admin", "admin");
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

        String Login, Pass;
        Pass = password_field.getText();
        Login = login_field.getText();

        if(Login.equals(user.login) && Pass.equals(user.password)){

            LogInButton.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/question.fxml")));
            Stage mainStage = new Stage();
            mainStage.initStyle(StageStyle.TRANSPARENT);
            Scene scene = new Scene(root);
            scene.setFill(Color.TRANSPARENT);
            mainStage.setScene(scene);
            mainStage.show();

        }else if(Login.equals(student.login) && Pass.equals(student.password)){

            System.out.println("student");

        }else if(Login.equals(admin.login) && Pass.equals(admin.password)){

            System.out.println("admin");

        }else {

            JOptionPane.showMessageDialog(null, "Uncorrect login or password!");
            login_field.clear();
            password_field.clear();

        }
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
