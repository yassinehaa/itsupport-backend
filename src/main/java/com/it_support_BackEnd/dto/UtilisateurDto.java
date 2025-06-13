package com.it_support_BackEnd.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class UtilisateurDto extends PersonneDto implements Serializable {

    private String telephone;
    private String adresse;
    private String genre;


}
