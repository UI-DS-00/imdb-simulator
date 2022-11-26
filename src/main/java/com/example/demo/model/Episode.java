package com.example.demo.model;//no matter

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Episode {
    @Id
    @GeneratedValue
    private String tConst;

    private String  parentTConst ; // ?!

    private int seasonNumber ; // ?!

    private int episodeNumber ; // ?!


}
