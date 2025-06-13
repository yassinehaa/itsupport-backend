package com.it_support_BackEnd.controller;


import com.it_support_BackEnd.Services.TicketServiceImpl;
import com.it_support_BackEnd.dto.TicketDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/utilisateur")
public class UtilisateurControlle {

    @Autowired
    private TicketServiceImpl ticketService;


    @GetMapping("/{id}")
    public ResponseEntity<TicketDto> getTicketByUtilisateurId(@PathVariable int id) {
        TicketDto ticket = ticketService.getAllByUseID(id);
        if (ticket != null) {
            return ResponseEntity.ok(ticket);
        } else {
            return ResponseEntity.notFound().build();
        }
    }




}
