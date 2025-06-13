package com.it_support_BackEnd.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


public class Historique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "equipment_id",nullable = false)
    private Equipment equipment;
    @ManyToOne
    @JoinColumn(name = "panne_id",nullable = false)
    private Panne panne;



}