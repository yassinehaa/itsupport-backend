package com.it_support_BackEnd.dto;

import com.it_support_BackEnd.Enums.Etat_panne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PanneDto {
        private  int id;
    private String description;
    private   String nom;
    private String priorite;
    private String localisation;
    private Etat_panne etatPanne;
}
