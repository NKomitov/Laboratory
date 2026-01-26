import jakarta.persistence.*;

import javax.swing.text.Position;

@Entity
@Table(name = "employee")
public class Employee extends User{

    @ManyToOne
    @JoinColumn(name = "lab_id")
    private Laboratory laboratory;

    @Column(name = "position")
    private String position;

    public Employee() {}

    public Employee(String username, String password, String fullName, Role role,
                    Laboratory laboratory, String position) {
        super(username, password, fullName, role);
        this.laboratory = laboratory;
        this.position = position;
    }

    public Laboratory getLaboratory() {return laboratory;}
    public String getPosition() {return position;}

    public void setLaboratory(Laboratory laboratory) {this.laboratory = laboratory;}
    public void setPosition(String position) {this.position = position;}

}
