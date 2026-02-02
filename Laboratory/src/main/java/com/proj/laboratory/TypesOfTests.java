import jakarta.persistence.*;

@Entity
@Table(name = "types_of_tests")
public class TypesOfTests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "types_of_tests_id")
    private Long typesOfTestsId;

    @ManyToOne
    @JoinColumn(name = "lab_id")
    private Laboratory laboratory;

    @Column (name = "name_of_test")
    private String nameOfTest;

    public TypesOfTests() {}

    public TypesOfTests(String nameOfTest,  Laboratory laboratory) {
        this.nameOfTest = nameOfTest;
        this.laboratory = laboratory;
    }

    public Long getTypes_of_tests_id() {return typesOfTestsId;}
    public Laboratory getLaboratory() {return laboratory;}
    public String getName_of_test() {return nameOfTest;}

    public void setTypes_of_tests_id(Long typesOfTestsId) {this.typesOfTestsId = typesOfTestsId;}
    public void setLaboratory(Laboratory laboratory) {this.laboratory = laboratory;}
    public void setName_of_test(String nameOfTest) {this.nameOfTest = nameOfTest;}
}
