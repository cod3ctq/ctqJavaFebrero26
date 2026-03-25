package com.ms_persistence.repository;

import com.ms_persistence.entity.TipoTarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoTarjetaRepository extends JpaRepository<TipoTarjeta, Integer> {

    @Query("SELECT tt FROM TipoTarjeta tt WHERE tt.descripcion=:descripcion")
    Optional<TipoTarjeta> findByDescription (@Param("descripcion") String descripcion);

}
