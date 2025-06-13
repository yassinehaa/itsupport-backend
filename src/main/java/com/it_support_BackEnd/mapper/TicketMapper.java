package com.it_support_BackEnd.mapper;


import com.it_support_BackEnd.dto.TicketDto;
import com.it_support_BackEnd.entities.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TicketMapper {

    TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);

    @Mapping(source = "user.id", target = "idUti")
    @Mapping(source = "technicien.id", target = "idTech")
    @Mapping(source = "panne.id", target = "idPanne")
    @Mapping(source = "equipement.id", target = "idEquip")
    TicketDto toDTO(Ticket ticket);

    @Mapping(source = "idUti", target = "user.id")
    @Mapping(source = "idTech", target = "technicien.id")
    @Mapping(source = "idPanne", target = "panne.id")
    @Mapping(source = "idEquip", target = "equipement.id")
    Ticket toEntity(TicketDto ticketDto);

    List<TicketDto> toDTOList(List<Ticket> tickets);
    List<Ticket> toEntityList(List<TicketDto> ticketDtos);
}
