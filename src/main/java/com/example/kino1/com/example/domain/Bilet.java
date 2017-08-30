package com.example.kino1.com.example.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Bilet {

    @Id
    @SequenceGenerator(name="bilet_generator", sequenceName="bilet_sequence", allocationSize = 1)
    @GeneratedValue(generator = "bilet_generator")
    private int id;
    private int id_widz;
    private int id_seans;
    private String type;
    //
    @ManyToOne
    @JoinColumn(name = "id_widz",insertable=false, updatable=false)
    public Widz getWidz;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_seans",insertable=false, updatable=false)
    private Seans seans;
    /*
    @OneToOne(mappedBy = "bilet")
    private Cena cena;
    */
}
