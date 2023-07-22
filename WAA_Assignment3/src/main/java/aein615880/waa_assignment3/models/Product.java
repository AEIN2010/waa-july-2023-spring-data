package aein615880.waa_assignment3.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
@Table
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private double price;
    private double rating;

    //@OneToOne
    //@JoinColumn(name = "category")
    //private Category category;

    //@OneToMany(mappedBy = "review")
    //private List<Review> ratingList;


}
