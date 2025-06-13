package com.it_support_BackEnd.mapper;



import com.it_support_BackEnd.dto.PanneDto;
import com.it_support_BackEnd.entities.Panne;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PanneMapper {

    Panne toEntity(PanneDto DTO);
    PanneDto toDTO(Panne entity);
    List<PanneDto> toDTOList(List<Panne> pannes);
    List<Panne> toEntityList(List<PanneDto> panneDtos);
}
