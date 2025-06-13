package com.it_support_BackEnd.Services;


import com.it_support_BackEnd.dto.TicketDto;
import com.it_support_BackEnd.entities.Ticket;
import com.it_support_BackEnd.mapper.TicketMapper;
import com.it_support_BackEnd.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public TicketDto create(TicketDto ticketDto) {
        Ticket ticket = ticketMapper.toEntity(ticketDto);
        Ticket savedTicket = ticketRepository.save(ticket);
        return ticketMapper.toDTO(savedTicket);
    }

    @Override
    public void delete(int id) {
        ticketRepository.deleteById(id);
    }


    @Override
    public List<TicketDto> getAll() {
        List<Ticket> tickets = ticketRepository.findAll();
        return tickets.stream()
                .map(ticketMapper::toDTO)
                .collect(Collectors.toList());
    }



    @Override
    public TicketDto getById(int id) {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        return ticket.map(ticketMapper::toDTO).orElse(null);
    }

    @Override
    public TicketDto update(int id, TicketDto ticketDto) {
        Optional<Ticket> optionalTicket = ticketRepository.findById(id);
        if (optionalTicket.isPresent()) {
            Ticket ticket = optionalTicket.get();
            ticket.setDescription(ticketDto.getDescription());
            ticket.setPriorite(ticketDto.getPriorite());
            ticket.setTicketStatut(ticketDto.getTicketStatut());

            // Update relationships if necessary
            // Example: ticket.setUser(new User(ticketDto.getUserId()));
            // Similarly for other relationships

            Ticket updatedTicket = ticketRepository.save(ticket);
            return ticketMapper.toDTO(updatedTicket);
        } else {
            return null;
        }
    }

    public TicketDto getAllByUseID(int id){
        Optional<Ticket> ticket = ticketRepository.findAllByuserId(id);
        return ticket.map(ticketMapper::toDTO).orElse(null);
    }
}
