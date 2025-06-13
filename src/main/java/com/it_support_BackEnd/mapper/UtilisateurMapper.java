package com.it_support_BackEnd.mapper;


import com.it_support_BackEnd.dto.UtilisateurDto;
import com.it_support_BackEnd.entities.Utilisateur;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper {
    Utilisateur toEntity(UtilisateurDto dto);
    UtilisateurDto toDTO(Utilisateur entity);
    List<UtilisateurDto> toDTOList(List<Utilisateur> utilisateurs);
    List<Utilisateur> toEntityList(List<UtilisateurDto> utilisateurDtos);
}
