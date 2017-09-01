package com.example.kino1.com.example.domain;

import javax.persistence.*;

@Entity
public class Seans {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bilet")
    private Bilet bilet;

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

    public Bilet getBilet() {
        return bilet;
    }

    public void setBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    public Seans(String name, Bilet bilet) {
        this.name = name;
        this.bilet = bilet;
    }

    public Seans(){

    }
}
