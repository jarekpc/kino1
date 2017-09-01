package com.example.kino1.com.example.domain;

import javax.persistence.*;

@Entity
public class Bilet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private Type type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_kasjer")
    private Kasjer kasjer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Kasjer getKasjer() {
        return kasjer;
    }

    public void setKasjer(Kasjer kasjer) {
        this.kasjer = kasjer;
    }

    public Bilet(Type type, Kasjer kasjer) {
        this.type = type;
        this.kasjer = kasjer;
    }

    public Bilet(){

    }
}
