import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {

    private Person person;

    @BeforeAll
    void setup() {
        this.person = new Person();
    }

    @ParameterizedTest(name = " O user {0} é válido?")
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    void check_user_valid(String user) {
        this.person.setUser(user);
        assertTrue(this.person.checkUser());
    }

    @ParameterizedTest(name = " O user {0} é inválido?")
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    void check_user_not_valid(String user) {
        this.person.setUser(user);
        assertFalse(this.person.checkUser());
    }

    @ParameterizedTest(name = " O password {0} não tem letra?")
    @ValueSource(strings = {"123456789", "#$%1234"})
    void does_not_have_letters(String password) {
        this.person.setPassword(password);
        assertFalse(this.person.checkPassword());
    }

    @ParameterizedTest(name = " O password {0} não tem número?")
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    void does_not_have_numbers(String password) {
        this.person.setPassword(password);
        assertFalse(this.person.checkPassword());
    }

    @ParameterizedTest(name = " O password {0} não tem tamanho suficiente?")
    @ValueSource(strings = {"Abc@123", "12$@hbt"})
    void does_not_have_eight_chars(String password) {
        this.person.setPassword(password);
        assertFalse(this.person.checkPassword());
    }

    @ParameterizedTest(name = " O password {0} é válido?")
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    void check_password_valid(String password) {
        this.person.setPassword(password);
        assertTrue(this.person.checkPassword());
    }

}
