package com.ms_tipo_tarjeta.logic;

import com.ms_persistence.entity.TipoTarjeta;
import com.ms_persistence.repository.TipoTarjetaRepository;
import com.ms_tipo_tarjeta.service.ITipoTarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TipoTarjetaLogic implements ITipoTarjetaService {

    @Autowired
    TipoTarjetaRepository tipoTarjetaRepository;
    @Override
    public Integer getIdByDescripction(String descripcion) {

        Optional<TipoTarjeta> tipoTarjeta = null;

        tipoTarjeta = tipoTarjetaRepository.findByDescription(descripcion);

        if(tipoTarjeta.isPresent()){
            return tipoTarjeta.get().getTipoTId();
        }else{
            return 0;
        }
    }

    @Override
    public List mostrar() {

        return tipoTarjetaRepository.findAll();
    }


}
