package za.ac.tut.car.mobile.machanics.enities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Incident implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateCreated;
    private Date dateUpdated;
    private String status;
    private String comments;
    private Boolean isAssigned;
    private String cellnumber;
    private Long user;
    private String vehicleMake;
    private String transmission;
    private String bodyType;
    private String color;
    private String address;
    private String reason;
    private String loggedBy;
    private String technicianName;
    private Long technicianId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "invoice", referencedColumnName = "id")
    private Invoice invoice;
}
