package com.example.demo.model;//no matter


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Movie {

    @Id
    private String titleId;

    private int ordering;

    private String title;

    private String region;

    private String language;


    //attributes[] type ;
    @OneToMany(mappedBy = "movie")
    @ToString.Exclude
    private List<TypeForTitle> type;

    //String[] attribute ;
    @OneToMany(mappedBy = "movie")
    @ToString.Exclude
    private List<AttributeForTitle> attribute;

    private boolean isOriginalTitle; //0no , 1yes



    @ManyToMany
    @JoinTable(
            name = "movies_directors",
            joinColumns = @JoinColumn(name = "movie_Id"),
            inverseJoinColumns = @JoinColumn(name = "director_id")
    )
    private List<NameBasics> directors;//maybe null

    @ManyToMany
    @JoinTable(
            name = "movies_writers",
            joinColumns = @JoinColumn(name = "movie_Id"),
            inverseJoinColumns = @JoinColumn(name = "writer_id")
    )
    private List<NameBasics> writers;//maybe null








}
