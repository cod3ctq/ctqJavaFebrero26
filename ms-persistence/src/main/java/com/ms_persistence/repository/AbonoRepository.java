package com.ms_persistence.repository;

import com.ms_persistence.entity.Abonos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonoRepository extends JpaRepository<Abonos,Integer> {
}
