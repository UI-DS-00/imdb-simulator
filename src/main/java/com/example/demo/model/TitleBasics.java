package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TitleBasics {
    @Id
    private String tConst;

    private String titleType;//format of title:movie,short,tvSeries ets

    private String primaryTitle;

    private String originalTitle;

    private boolean isAdult;//0non adult , 1 adult

    SimpleDateFormat startYear = new SimpleDateFormat("yyyy");

    SimpleDateFormat endYear = new SimpleDateFormat("yyyy");

    private int runtimeMinute;

    //String[] genres
    @ManyToMany
    @JoinTable(
            name = "titleBasics_genres",
            joinColumns = @JoinColumn(name = "genre_Id"),
            inverseJoinColumns = @JoinColumn(name = "titleBasics_Id"))
    private List<Genre> genres;

    @ManyToMany
    @JoinTable(
            name = "titleBasics_nameBasics",
            joinColumns = @JoinColumn(name = "titleBasics_Id"),
            inverseJoinColumns = @JoinColumn(name = "nameBasics_Id")
    )
    private List<NameBasics> people ;

    @OneToMany(mappedBy = "tConst")
    private List<Principals> principals;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rating_Id" , referencedColumnName = "Id")
    private Ratings ratings;
}
