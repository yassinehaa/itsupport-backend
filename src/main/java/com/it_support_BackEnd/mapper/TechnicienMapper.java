package com.it_support_BackEnd.mapper;



import com.it_support_BackEnd.dto.TechnicienDto;
import com.it_support_BackEnd.entities.Technicien;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface TechnicienMapper {
    Technicien toEntity(TechnicienDto DTO);
    TechnicienDto toDTO(Technicien entity);
    List<TechnicienDto> toDTOList(List<Technicien> techniciens);
    List<Technicien> toEntityList(List<TechnicienDto> technicienDtos);
}
