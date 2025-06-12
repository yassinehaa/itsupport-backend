package com.it_support_BackEnd.Services;


import com.it_support_BackEnd.dto.PanneDto;
import com.it_support_BackEnd.entities.Panne;
import com.it_support_BackEnd.mapper.PanneMapper;
import com.it_support_BackEnd.repository.PanneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class PanneServiceImpl implements PanneService {
    @Autowired
    private PanneRepository panneRepository;

    @Autowired
    private PanneMapper panneMapper;


    @Override
    public PanneDto create(PanneDto panneDto) {
        var panne = panneMapper.toEntity(panneDto);
        return panneMapper.toDTO(panneRepository.save(panne));
    }


    @Override
    public void delete(int id) {
        panneRepository.deleteById(id);
    }

    @Override
    public List<PanneDto> getAll() {
        List<Panne> pannes = panneRepository.findAll();
        return pannes.stream()
                .map(panneMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PanneDto getPanneById(int id) {
        Optional<Panne> panne = panneRepository.findById(id);
        return panne.map(panneMapper::toDTO).orElse(null);
    }

    @Override
    public PanneDto update(int id, PanneDto panneDto) {
        Optional<Panne> optionalPanne = panneRepository.findById(id);
        if (optionalPanne.isPresent()) {
            Panne panne = optionalPanne.get();
            panne.setNom(panneDto.getNom());
            panne.setEtatPanne(panneDto.getEtatPanne());
            panne.setDescription(panneDto.getDescription());
            panne.setPriorite(panneDto.getPriorite());
            panne.setLocalisation(panneDto.getLocalisation());


            Panne updatePanne = panneRepository.save(panne);
            return panneMapper.toDTO(updatePanne);
        } else {
            return null;
        }
    }
}
