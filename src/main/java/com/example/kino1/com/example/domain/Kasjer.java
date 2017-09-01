package com.example.kino1.com.example.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Kasjer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name ="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "kasjer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Bilet> biletSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Bilet> getBiletSet() {
        return biletSet;
    }

    public void setBiletSet(Set<Bilet> biletSet) {
        this.biletSet = biletSet;
    }

    public Kasjer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Kasjer(){

    }
}
