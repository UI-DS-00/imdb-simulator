package com.example.demo.model;//mo matter

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
public class AttributeForTitle {
    @Id
    @GeneratedValue
    private int id ;

    String attribute ;

    @ManyToOne
    @JoinColumn(name = "attribute")
    private Movie movie;
}
