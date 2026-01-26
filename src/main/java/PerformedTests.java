import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "performed_tests")
public class PerformedTests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "performed_tests_id")
    private int performed_tests_id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "lab_id")
    private Laboratory laboratory;

    @ManyToOne
    @JoinColumn(name = "type_of_tests_id")
    private TypesOfTests tests;

    @Column(name = "date", updatable = false)
    private LocalDateTime date;

    public PerformedTests() {}

    public PerformedTests(Patient patient, Employee employee, Laboratory laboratory, TypesOfTests tests) {
        this.patient = patient;
        this.employee = employee;
        this.laboratory = laboratory;
        this.tests = tests;
        this.date = LocalDateTime.now();
    }


    public int getPerformed_tests_id() {return performed_tests_id;}
    public Patient getPatient() {return patient;}
    public Employee getEmployee() {return employee;}
    public Laboratory getLaboratory() {return laboratory;}
    public TypesOfTests getTests() {return tests;}
    public LocalDateTime getDate() {return date;}

}
