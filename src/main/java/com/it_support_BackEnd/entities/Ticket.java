package com.it_support_BackEnd.entities;

import com.it_support_BackEnd.Enums.Ticket_statut;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    private String priorite;
    private Date dateCreation;

    @Enumerated(EnumType.STRING)
    private Ticket_statut ticketStatut;

    @ManyToOne
    @JoinColumn(name = "id_uti", nullable = false)
    private Utilisateur user;

    @ManyToOne
    @JoinColumn(name = "id_tech", nullable = false)
    private Technicien technicien;

    @ManyToOne
    @JoinColumn(name = "id_panne", nullable = false)
    private Panne panne;

    @ManyToOne
    @JoinColumn(name = "id_equip", nullable = false)
    private Equipment equipement;
}
