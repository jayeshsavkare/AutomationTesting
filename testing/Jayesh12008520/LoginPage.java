package Jayesh12008520;

public class LoginPage {

    // validate username
    public boolean validateUsername(String username) {
        if (username.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
            return true;
        }
        return false;
    }

    // validate credentials
    public boolean validateCredentials(String username, String password) {
        if (username.equals("username") && password.equals("password")) {
            return true;
        }
        return false;
    }

    // validate password
    public boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        } else if (!password.matches(".*\\d.*")) {
            return false;
        } else if (!password.matches(".*[@#$%&+=].*")) {
            return false;
        }
        return true;
    }
}

