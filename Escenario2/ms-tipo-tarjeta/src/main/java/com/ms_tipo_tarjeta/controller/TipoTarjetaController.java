package com.ms_tipo_tarjeta.controller;


import com.ms_persistence.dto.response.PrestamoResponse;
import com.ms_persistence.entity.TipoTarjeta;
import com.ms_tipo_tarjeta.logic.TipoTarjetaLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/tipotarjeta")
public class TipoTarjetaController {

    @Autowired
    TipoTarjetaLogic service;

    @GetMapping
    public ResponseEntity<List> mostrar(){
        List<TipoTarjeta> tipoTarjeta = service.mostrar();
        return new ResponseEntity<List>(tipoTarjeta, HttpStatusCode.valueOf(200));
    }

    @GetMapping("/buscar-id/{descripcion}")         //http://localhost:8092/api/v1/tipotarjeta/buscar-id/
    public ResponseEntity<Integer> getIdByDescription (@PathVariable String descripcion){
        Integer id = service.getIdByDescripction(descripcion);
        return new ResponseEntity<Integer>(id, HttpStatusCode.valueOf(200));
    }


}
