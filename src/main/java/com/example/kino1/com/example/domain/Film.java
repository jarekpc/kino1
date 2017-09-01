package com.example.kino1.com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Film {

    @Id
    @SequenceGenerator(name="film_generator", sequenceName="film_sequence", allocationSize = 1)
    @GeneratedValue(generator = "film_generator")
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Film(String name) {
        this.name = name;
    }

    public Film(){

    }
}
