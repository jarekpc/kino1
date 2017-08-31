package com.example.kino1.com.example.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Cena {

    @Id
    @SequenceGenerator(name="cena_generator", sequenceName="cena_sequence", allocationSize = 1)
    @GeneratedValue(generator = "cena_generator")
    private int id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_bilet")
    private Bilet bilet;

    private BigDecimal koszt;

}
