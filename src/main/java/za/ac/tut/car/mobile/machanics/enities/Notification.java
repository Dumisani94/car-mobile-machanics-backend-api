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
public class Notification implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateCreated;
    private String notificationName;
    private String notificationDescription;
    private Long userId;
    private Boolean isViewed;
}
