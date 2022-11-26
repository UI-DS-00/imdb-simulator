package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Ratings {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // private int Id ;
    @OneToOne(mappedBy = "ratings")
    private TitleBasics tConst;

    private int averageRating;

    private int numVotes;



}
