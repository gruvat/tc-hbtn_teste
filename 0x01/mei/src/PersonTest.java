import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private Person person;

    @BeforeEach
    void setup() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
         this.person = new Person("Paul",
                "McCartney",
                sdf.parse("30-01-2000"),
                true,
                true,
                true);
    }

    @Test
    void show_full_name() {
        assertEquals(person.fullName(), "Paul McCartney");
    }

    @Test
    void test_calculateYearlySalary() {
        this.person.setSalary(1200);
        assertEquals(14400, this.person.calculateYearlySalary());
    }

    @Test
    void person_is_MEI() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        Person p = new Person("Paul",
                "McCartney",
                sdf.parse("30-01-2000"),
                false,
                false,
                false);
        p.setSalary(1200);

        assertTrue(p.isMEI());
    }

    @Test
    void person_is_not_MEI() {
        this.person.setSalary(1200);
        assertFalse(this.person.isMEI());
    }
}
