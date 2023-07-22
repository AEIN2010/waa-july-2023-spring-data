package aein615880.waa_assignment3.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;



@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String email;
    private String password;
    private String firstname;
    private String lastName;


    //@OneToMany(mappedBy = "user")
    //private List<Review> reviewsList;

    @JoinColumn(name = "id")
    @OneToOne
    private Address address;
}
