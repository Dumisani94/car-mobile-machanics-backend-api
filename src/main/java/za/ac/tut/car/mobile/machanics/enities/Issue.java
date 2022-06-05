package za.ac.tut.car.mobile.machanics.enities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Issue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long loggedBy;
    private Date dateCreated;
    private Date dateUpdated;
    private String status;
    private String comments;
    private Boolean isAssigned;

}
