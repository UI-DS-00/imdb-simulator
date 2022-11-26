package com.example.demo.model;// no matter


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
public class TypeForTitle {
    @ManyToOne
    @JoinColumn(name = "type")
    private Movie movie;

    private attributes type ;

    @Id
    @GeneratedValue
    private Long id;


}
