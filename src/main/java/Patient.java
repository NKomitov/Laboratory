import jakarta.persistence.*;

@Entity
@Table(name = "patient")
public class Patient extends User{

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "gender")
    private Gender gender;

    public Patient() {}

    public Patient(String username, String password, String fullName, Role role,
                    String phoneNumber, Gender gender) {
        super(username, password, fullName, role);
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getPhoneNumber() {return phoneNumber;}
    public Gender getGender() {return gender;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void setGender(Gender gender) {this.gender = gender;}

}
