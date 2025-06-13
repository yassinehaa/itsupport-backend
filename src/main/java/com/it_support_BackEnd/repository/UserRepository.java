package com.it_support_BackEnd.repository;

import com.it_support_BackEnd.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
Optional<User> findByEmail(String email);

}
