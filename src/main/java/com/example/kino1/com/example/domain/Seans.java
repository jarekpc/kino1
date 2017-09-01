package com.example.kino1.com.example.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Seans {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private final String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bilet")
    private final Bilet bilet;

}
