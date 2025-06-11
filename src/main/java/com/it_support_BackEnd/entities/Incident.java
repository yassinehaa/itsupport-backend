package com.it_support_BackEnd.it_support_BackEnd.entities;


import com.it_support_BackEnd.it_support_BackEnd.Enums.IncidentStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
@Entity
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Enumerated(EnumType.STRING)
    private IncidentStatus status;

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;
}
