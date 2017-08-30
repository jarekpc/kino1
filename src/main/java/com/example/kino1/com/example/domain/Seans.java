package com.example.kino1.com.example.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Seans {

    @Id
    @SequenceGenerator(name="seans_generator", sequenceName="seans_sequence", allocationSize = 1)
    @GeneratedValue(generator = "seans_generator")
    private int id;
    //private String name;
    private int id_film;
    @Column(name = "time_seans")
    private Long timeSeans;

    @OneToOne(mappedBy = "seans", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Bilet bilet;


}
