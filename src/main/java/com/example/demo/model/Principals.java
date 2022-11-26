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
public class Principals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @ManyToOne
    @JoinColumn(name = "principals")
    private TitleBasics tConst;

    private int ordering;

    @ManyToOne
    @JoinColumn(name = "nCost")
    private NameBasics nCosts;

    private String category;
    private String job;
    private String character;
}
