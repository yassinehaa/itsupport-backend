package com.it_support_BackEnd.repository;

import com.it_support_BackEnd.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketRepository  extends JpaRepository<Ticket,Integer > {

    Optional<Ticket> findAllByuserId(int Id);
}
