package com.ms_prestamos.service;


import com.ms_persistence.dto.request.PrestamoRequest;
import com.ms_persistence.dto.response.PrestamoResponse;

import java.util.List;

public interface IPrestamoService {

    PrestamoResponse guardar(PrestamoRequest request);
    PrestamoResponse buscar(int id);
    List mostrar();

    PrestamoResponse actualizar(PrestamoRequest request);
    String eliminar (int id);
}
