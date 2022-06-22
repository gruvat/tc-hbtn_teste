import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private Pessoa pessoa;

    @BeforeEach
    void setup() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
         this.pessoa = new Pessoa("Paul",
                "McCartney",
                sdf.parse("30-01-2000"),
                true,
                true,
                true);
    }

    @Test
    void show_full_name() {
        assertEquals(pessoa.fullName(), "Paul McCartney");
    }

    @Test
    void test_calculateYearlySalary() {
        this.pessoa.setSalary(1200);
        assertEquals(14400, this.pessoa.calculateYearlySalary());
    }

    @Test
    void person_is_MEI() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        Pessoa p = new Pessoa("Paul",
                "McCartney",
                sdf.parse("30-01-2000"),
                false,
                false,
                false);
        p.setSalary(1200);

        assertTrue(p.isMEI());
    }

}
