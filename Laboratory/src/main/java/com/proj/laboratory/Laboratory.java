import jakarta.persistence.*;

@Entity
@Table(name = "laboratory")
public class Laboratory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lab_id")
    private Long lab_id;

    @Column(name = "name")
    private String name;

    public Laboratory() {}

    public Laboratory(String name) {
        this.name = name;
    }

    public Long getLab_id() {return lab_id;}
    public String getName() {return name;}

    public void setLab_id(Long lab_id) {this.lab_id = lab_id;}
    public void setName(String name) {this.name = name;}

}
