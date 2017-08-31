package com.example.kino1.com.example.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@RequiredArgsConstructor
public class Kasjer {

    @Id
    @SequenceGenerator(name="kasjer_generator", sequenceName="kasjer_sequence", allocationSize = 1)
    @GeneratedValue(generator = "kasjer_generator")
    private int id;

    @Column(name ="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    //1 do wielu Bilet
    //one to many
    @OneToMany(mappedBy = "kasjer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Bilet> biletSet;

}
