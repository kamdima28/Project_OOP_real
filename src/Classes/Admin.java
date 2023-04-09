package Classes;

public class Admin extends User{
    String login = "admin";
    String password = "admin";

    public Admin(String login, String password) {
        super(login, password);
    }
}
