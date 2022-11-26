package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PProfessionForNameB {
    @Id
    @GeneratedValue
    private int id;

    String profession ;

    @ManyToMany(mappedBy = "primaryProfession")
    private List<NameBasics> people;
}
