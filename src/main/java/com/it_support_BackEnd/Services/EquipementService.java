package com.it_support_BackEnd.Services;

import com.it_support_BackEnd.dto.EquipmentDto;
import com.it_support_BackEnd.entities.Equipment;
import com.it_support_BackEnd.repository.EquipmentRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EquipementService {
    private final EquipmentRepository equipmentRepository;
    private final ModelMapper modelMapper;


    public EquipmentDto addEquipment(EquipmentDto equipmentDto) {
        Equipment equipment = modelMapper.map(equipmentDto, Equipment.class);

        Equipment savedEquipment = equipmentRepository.save(equipment);
        return modelMapper.map(savedEquipment, EquipmentDto.class);
    }
    public List<EquipmentDto> getAllEquipments() {
        List<Equipment> equipments = equipmentRepository.findAll();
        return equipments.stream()
                .map(equipment -> modelMapper.map(equipment, EquipmentDto.class))
                .collect(Collectors.toList());
    }

    public EquipmentDto getEquipmentById(Long id) {
        Equipment equipment = equipmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipment not found"));
        return modelMapper.map(equipment, EquipmentDto.class);
    }
    public EquipmentDto updateEquipment(Long id, EquipmentDto equipmentDto) {
        Equipment existingEquipment = equipmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipment not found"));

        modelMapper.map(equipmentDto, existingEquipment);
        Equipment updatedEquipment = equipmentRepository.save(existingEquipment);
        return modelMapper.map(updatedEquipment, EquipmentDto.class);
    }
    public void deleteEquipment(Long id) {
        Equipment equipment = equipmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipment not found"));
        equipmentRepository.delete(equipment);
    }
}
