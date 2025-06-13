package com.it_support_BackEnd.repository;

import com.it_support_BackEnd.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonneRepository  extends JpaRepository<Personne,Integer > {
    Optional<Personne> findByMail(String username);
}
