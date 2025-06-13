package com.it_support_BackEnd.dto;

import com.it_support_BackEnd.Enums.Ticket_statut;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TicketDto {

    private String description;
    private String priorite;
    private Date dateCreation; // Conformément aux conventions Java
    private Ticket_statut ticketStatut;
    private int idUti; // Conformément aux conventions Java
    private int idTech; // Conformément aux conventions Java
    private int idPanne; // Conformément aux conventions Java
    private int idEquip; // Conformément aux conventions Java
}
