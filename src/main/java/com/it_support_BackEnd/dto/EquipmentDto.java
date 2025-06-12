package com.it_support_BackEnd.dto;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class EquipmentDto implements Serializable {
    Long id;
    String name;
    String serialNumber;
}