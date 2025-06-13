package com.it_support_BackEnd.repository;

import com.it_support_BackEnd.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository  extends JpaRepository<Utilisateur,Integer > {
}
