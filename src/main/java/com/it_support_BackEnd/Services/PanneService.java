package com.it_support_BackEnd.Services;


import com.it_support_BackEnd.dto.PanneDto;

import java.util.List;

public interface PanneService {
    PanneDto create(PanneDto panneDto);
    void delete(int id);
    List<PanneDto> getAll();
    PanneDto getPanneById(int id);
    PanneDto update(int id, PanneDto panneDto);
}
