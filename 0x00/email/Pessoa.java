package email;
public class Pessoa {

    static boolean emailValid(String email) {
        return email.contains("@") && email.length() <= 50;
    }

}
