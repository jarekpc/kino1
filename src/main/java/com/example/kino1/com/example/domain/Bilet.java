package com.example.kino1.com.example.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class Bilet {

    @Id
    @SequenceGenerator(name="bilet_generator", sequenceName="bilet_sequence", allocationSize = 1)
    @GeneratedValue(generator = "bilet_generator")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private Type type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_kasjer")
    private Kasjer kasjer;

    @OneToOne(mappedBy = "bilet")
    private Cena cena;


}
