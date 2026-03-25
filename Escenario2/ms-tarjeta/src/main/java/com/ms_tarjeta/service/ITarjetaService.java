package com.ms_tarjeta.service;

import com.ms_persistence.dto.request.TarjetaRequest;
import com.ms_persistence.dto.response.TarjetaResponse;

import java.util.List;

public interface ITarjetaService {

    TarjetaResponse guardar(TarjetaRequest request);


    List mostrar();
    TarjetaResponse buscar(int id);

    //solo por cuestion didactica
    TarjetaResponse actualizar(TarjetaRequest request);
    String eliminar(int id);

}
