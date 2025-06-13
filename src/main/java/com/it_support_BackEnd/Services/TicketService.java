package com.it_support_BackEnd.Services;


import com.it_support_BackEnd.dto.TicketDto;

import java.util.List;

public interface TicketService {
    TicketDto create(TicketDto ticketDto);
    void delete(int id);

    List<TicketDto> getAll();
    TicketDto getById(int id);
    TicketDto update(int id, TicketDto ticketDto);
}
