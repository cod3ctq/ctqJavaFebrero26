package com.ms_persistence.repository;

import com.ms_persistence.entity.Clientes;
import com.ms_persistence.entity.TipoPrestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Integer> {

    @Query("SELECT cl FROM Clientes cl WHERE cl.rfc=:rfcCliente")
    Optional<Clientes> findByRfcCliente (@Param("rfcCliente") String rfcCliente);
}
