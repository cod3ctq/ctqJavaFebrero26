package com.ms_persistence.repository;

import com.ms_persistence.entity.TipoCuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoCuentaRepository extends JpaRepository<TipoCuenta,Integer> {
    @Query("SELECT tt FROM TipoCuenta tt WHERE tt.descripcion=:descripcion")
    Optional<TipoCuenta> findByDescripcion (@Param("descripcion")String descripcion);
}
