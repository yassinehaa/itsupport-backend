package com.it_support_BackEnd.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String serialNumber;

    @OneToMany(mappedBy = "equipment", cascade = CascadeType.ALL)
    private List<Incident> incidents;
}
