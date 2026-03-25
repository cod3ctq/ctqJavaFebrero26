package com.ms_persistence.repository;

import com.ms_persistence.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer> {

    /*
    @Query -> es capaz de ejecutar sentencias JPQL con select por default
    si se requiere ejecutar una insert, delete, update, se agragaria a la consulta
    @Modifying
     */

    //BUSCARA LA CUENTA QUE COINCIDA CON LA DESCRIPCION
    @Query("SELECT cu FROM Cuenta cu WHERE cu.numCuenta=:descripcion AND cu.status='1'")
    Optional<Cuenta> findByNumCuenta (@Param("descripcion") String descripcion);

    //BUSCARA UNA CUENTA PERO QUE ESTE SOLO ACTIVA
    @Query("SELECT cu FROM Cuenta cu WHERE cu.cuentaId=:cuentaId and cu.status='1'")
    Optional<Cuenta> findActiveById (@Param("cuentaId") Integer id);

    //BUSCARA TODAS LAS CUENTAS ACTIVAS
    @Query("SELECT cu FROM Cuenta cu WHERE cu.status='1'")
    Optional<List<Cuenta>> findAllActive ();

    //DESCATIVAR UNA CUENTA POR EL NUMERO DE CUENTA
    @Modifying
    @Query("UPDATE Cuenta c SET c.status = '0' WHERE c.numCuenta =:numCuenta")
    int deleteByNumCuenta(@Param("numCuenta") String numCuenta);

    @Query("SELECT cu FROM Cuenta cu WHERE cu.clabe=:clabe")
    Optional<Cuenta> findByClabe(@Param("clabe") String clabe);


}
