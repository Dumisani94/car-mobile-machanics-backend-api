package za.ac.tut.car.mobile.machanics.enities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@ToString
@Entity
public class Technician implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String companyName;
    private String price;
    private String address;
    private Integer ratings;
    private Boolean isAvailable;
    private Long userId;
    private Boolean isApproved;

}
