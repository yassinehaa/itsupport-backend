package com.it_support_BackEnd.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;


@Value
@Getter
@Setter
public class EquipmentDto implements Serializable {
    Long id;
    String name;
    String serialNumber;
}