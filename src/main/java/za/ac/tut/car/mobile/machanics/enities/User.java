package za.ac.tut.car.mobile.machanics.enities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String cellNumber;
    private String password;
    private String gender;
    private Boolean isApproved;
    private String status;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "role", referencedColumnName = "id")
    private Role role;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "address", referencedColumnName = "id")
    private Address address;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "technician", referencedColumnName = "id")
    private Technician technician;

}

