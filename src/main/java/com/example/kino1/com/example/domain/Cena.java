package com.example.kino1.com.example.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Cena {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bilet")
    private Bilet bilet;

    private BigDecimal koszt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bilet getBilet() {
        return bilet;
    }

    public void setBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    public BigDecimal getKoszt() {
        return koszt;
    }

    public void setKoszt(BigDecimal koszt) {
        this.koszt = koszt;
    }

    public Cena(Bilet bilet, BigDecimal koszt) {
        this.bilet = bilet;
        this.koszt = koszt;
    }

    public Cena(){

    }
}
