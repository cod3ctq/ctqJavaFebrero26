package com.ms_tipo_tarjeta.service;

import java.util.List;

public interface ITipoTarjetaService {

    Integer getIdByDescripction (String descripcion);

    List mostrar();
}
