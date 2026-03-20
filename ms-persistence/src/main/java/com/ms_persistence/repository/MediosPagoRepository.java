package com.ms_persistence.repository;

import com.ms_persistence.entity.MediosPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediosPagoRepository extends JpaRepository<MediosPago, Integer> {
}
