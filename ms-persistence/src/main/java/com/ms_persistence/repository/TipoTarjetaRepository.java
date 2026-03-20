package com.ms_persistence.repository;

import com.ms_persistence.entity.TipoTarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTarjetaRepository extends JpaRepository<TipoTarjeta, Integer> {
}
