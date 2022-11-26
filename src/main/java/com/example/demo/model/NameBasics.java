package com.example.demo.model;


import lombok.*;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class NameBasics {
    @Id
    String nCost ;

    String primaryName ;

    SimpleDateFormat birthYear = new SimpleDateFormat("yyyy");

    SimpleDateFormat deathYear = new SimpleDateFormat("yyyy");//maybe null

    @ManyToMany
    @JoinTable(
            name = "nameBasics_primaryProfession",
            joinColumns = @JoinColumn(name = "nameBasic_ID"),
            inverseJoinColumns = @JoinColumn(name = "primaryProfession_Id")
    )
    private List<PProfessionForNameB> primaryProfession ;

    @ManyToMany(mappedBy = "people")
    private List<TitleBasics> knownForTitles;

    @OneToMany(mappedBy = "nCosts")
    private List<Principals> principals;
////////
    @ManyToMany(mappedBy = "directors")
    private List<Movie> DMovies;

    @ManyToMany(mappedBy = "writers")
    private List<Movie> WMovies;
}
