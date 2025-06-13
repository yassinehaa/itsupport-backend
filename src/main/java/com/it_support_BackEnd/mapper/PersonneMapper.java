package com.it_support_BackEnd.mapper;




import com.it_support_BackEnd.dto.PersonneDto;
import com.it_support_BackEnd.entities.Personne;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonneMapper {
    Personne toEntity(PersonneDto DTO);
    PersonneDto toDTO(Personne entity);
    List<PersonneDto> toDTOList(List<Personne> personnes);
    List<Personne> toEntityList(List<PersonneDto> personneDtos);
}
