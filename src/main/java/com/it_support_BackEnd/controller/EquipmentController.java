package com.it_support_BackEnd.controller;

import com.it_support_BackEnd.Services.EquipementService;
import com.it_support_BackEnd.dto.EquipmentDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/equipment")
public class EquipmentController {
    private final EquipementService equipementService;

    @GetMapping("/add")
    public EquipmentDto addEquipment(@RequestBody EquipmentDto equipmentDto) {
        return equipementService.addEquipment(equipmentDto);
    }
    @PostMapping("/get")
    public EquipmentDto getEquipmentById(@RequestParam Long id) {
        return equipementService.getEquipmentById(id);
    }
    @PostMapping("/update")
    public EquipmentDto updateEquipment(@RequestParam Long id, @RequestBody EquipmentDto equipmentDto) {
        return equipementService.updateEquipment(id, equipmentDto);
    }
    @DeleteMapping("/delete")
    public void deleteEquipment(@RequestParam Long id) {
        equipementService.deleteEquipment(id);
    }
}
