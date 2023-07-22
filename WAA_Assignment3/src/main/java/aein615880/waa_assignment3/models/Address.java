package aein615880.waa_assignment3.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Address {

    @Id
    private String id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    private User user;
}
