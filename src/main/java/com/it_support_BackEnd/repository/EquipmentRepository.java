package com.it_support_BackEnd.repository;

import com.it_support_BackEnd.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment,Long> {
}
