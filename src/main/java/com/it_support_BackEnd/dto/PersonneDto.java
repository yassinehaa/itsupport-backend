package com.it_support_BackEnd.dto;

import lombok.Data;

@Data
public class PersonneDto {
    private Long id;
    private String nom;
    private String mail;
    private String password;
}
