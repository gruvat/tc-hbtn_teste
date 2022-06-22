import java.time.LocalDate;
import java.util.Date;
import java.time.Period;
import java.util.concurrent.TimeUnit;

public class Pessoa {

    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;

    private float salary;

    public Pessoa(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
    }

    public String fullName() {
        return this.name + " " + this.surname;
    }

    public float calculateYearlySalary() {
        return this.salary * 12;
    }

    public boolean isMEI() {
        return calculateYearlySalary() < 130000 &&
                (getDateDiff(this.birthDate, new Date(), TimeUnit.DAYS)/365) > 18 &&
                !this.anotherCompanyOwner &&
                !this.pensioner &&
                !this.publicServer;
    }

    private long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
