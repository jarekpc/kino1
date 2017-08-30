package com.example.kino1.com.example.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Widz {

    @Id
    @SequenceGenerator(name="widz_generator", sequenceName="widz_sequence", allocationSize = 1)
    @GeneratedValue(generator = "widz_generator")
    private int id;
    @Column(name ="first_name")
    private String firstName;
    @Column(name ="last_name")
    private String lastName;
    private String street;
    private String city;
    @Column(name ="phone_number")
    private String phoneNumber;
    //book_category
    /* 1 widz ma wiele biletow
    @ManyToOne
    @JoinColumn(name = "id_widz")
    private Bilet bilet;
    */
}
