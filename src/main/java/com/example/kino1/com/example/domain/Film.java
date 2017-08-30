package com.example.kino1.com.example.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Data
public class Film {

    @Id
    @SequenceGenerator(name="film_generator", sequenceName="film_sequence", allocationSize = 1)
    @GeneratedValue(generator = "film_generator")
    private int id;

    private String name;

}
