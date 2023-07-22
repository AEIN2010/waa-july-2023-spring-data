package aein615880.waa_assignment3.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@Table
@Entity
public class Review {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String comment;
    //@JoinColumn(name = "prodId")
    //@OneToOne
    //private Product prod;

    //@JoinColumn(name = "userId")
    //@ManyToOne
    //private User user;





}
