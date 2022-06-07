package za.ac.tut.car.mobile.machanics.enities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@ToString
public class CardDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bankName;
    private String accountHolder;
    private String cardNumber;
    private String expiryDate;
    private String securityCode;
    private String postalCode;
    private Long user;
}
