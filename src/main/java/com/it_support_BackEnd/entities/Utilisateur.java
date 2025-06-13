package com.it_support_BackEnd.entities;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Utilisateur extends Personne {


    private String telephone;
    private String adresse;
    private String genre;

}
