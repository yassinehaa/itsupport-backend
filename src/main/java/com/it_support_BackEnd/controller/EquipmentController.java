package com.it_support_BackEnd.controller;

import com.it_support_BackEnd.Services.EquipementService;
import com.it_support_BackEnd.dto.EquipmentDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/api/equipment")
@CrossOrigin(origins = "*")
public class EquipmentController {
    private final EquipementService equipementService;

    @PostMapping
    public EquipmentDto addEquipment(@RequestBody EquipmentDto equipmentDto) {
        return equipementService.addEquipment(equipmentDto);
    }
    @GetMapping("/{id}")
    public EquipmentDto getEquipmentById(@PathVariable Long id) {
        return equipementService.getEquipmentById(id);
    }
    @GetMapping
    public List<EquipmentDto> getAllEquipments(@RequestBody EquipmentDto equipmentDto){
        return equipementService.getAllEquipments();
    }
    @PutMapping("/update/{id}")
    public EquipmentDto updateEquipment(@PathVariable Long id, @RequestBody EquipmentDto equipmentDto) {
        return equipementService.updateEquipment(id, equipmentDto);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEquipment(@PathVariable Long id) {
        equipementService.deleteEquipment(id);
    }
}
