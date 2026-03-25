package com.ms_cuentas.service;



import com.ms_persistence.dto.request.CuentaRequest;
import com.ms_persistence.dto.response.CuentaResponse;


import java.util.List;

public interface ICuentaService {

    //SON LAS ACCIONES QUE SE PUEDEN HACER A LA TABLA CUENTA
    CuentaResponse guardar(CuentaRequest request);
    CuentaResponse buscar(int id);
    List mostrar();
    //CuentaResponse actualizar(CuentaRequest request);
    String desactivar(String numCuenta);

    Integer getIdByNumCuenta (String numCuenta);


}
