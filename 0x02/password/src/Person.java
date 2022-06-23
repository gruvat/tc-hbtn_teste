import java.util.List;

public class Person {

    private String user;
    private String password;

    private static final List<String> specialCharacters = List.of(
            "!", "@", "#", "$", "%", "&", "*", "(", ")",
            "'", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">",
            "?", "[", "]", "^", "_", "`", "{", "|", "}"
    );

    private boolean hasSpecialCharacter(String word) {
        for (String s : specialCharacters) {
            if (word.contains(s)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDigit(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCapitalized(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkUser() {
        return this.user.length() >= 8 && !this.hasSpecialCharacter(this.user);
    }

    public boolean checkPassword() {
        return this.password.length() >= 8
                && this.hasSpecialCharacter(this.password)
                && this.hasDigit(this.password)
                && this.hasCapitalized(this.password);

    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
