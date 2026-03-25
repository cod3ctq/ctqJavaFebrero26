package com.ms_prestamos.controller;


import com.ms_persistence.dto.request.PrestamoRequest;
import com.ms_persistence.dto.response.PrestamoResponse;
import com.ms_persistence.entity.Prestamo;
import com.ms_prestamos.logic.PrestamoLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pres")
public class PrestamoController {

    @Autowired
    PrestamoLogic service;

    @GetMapping
    public ResponseEntity<List> mostrar(){
        List<PrestamoResponse> pres = service.mostrar();
        return new ResponseEntity<List>(pres, HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<PrestamoResponse> registrar(@RequestBody PrestamoRequest request){
        PrestamoResponse pres = service.guardar(request);
        return new ResponseEntity<PrestamoResponse>(pres, HttpStatusCode.valueOf(200));
    }

    @PutMapping
    public ResponseEntity<PrestamoResponse> actualizar(@RequestBody PrestamoRequest request){
        PrestamoResponse pres = service.actualizar(request);
        return new ResponseEntity<PrestamoResponse>(pres, HttpStatusCode.valueOf(200));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<PrestamoResponse> buscar(@PathVariable int id){
        PrestamoResponse pres = service.buscar(id);
        return new ResponseEntity<PrestamoResponse>(pres,HttpStatusCode.valueOf(200) );
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id){
        String mensaje = service.eliminar(id);
        return new ResponseEntity<String>(mensaje, HttpStatusCode.valueOf(200));
    }

}
