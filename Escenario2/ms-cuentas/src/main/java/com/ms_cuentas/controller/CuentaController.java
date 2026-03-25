package com.ms_cuentas.controller;


import com.ms_cuentas.logic.CuentaLogic;
import com.ms_persistence.dto.request.CuentaRequest;
import com.ms_persistence.dto.response.CuentaResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/counts")
public class CuentaController {

    @Autowired
    CuentaLogic service;
    @GetMapping
    public ResponseEntity<List> mostrar(){
        List<CuentaResponse> cuentas = service.mostrar();
        return new ResponseEntity<List>(cuentas, HttpStatusCode.valueOf(200));
    }


    @PostMapping
    public ResponseEntity<CuentaResponse> registrar(@Valid @RequestBody CuentaRequest request){
        CuentaResponse cuenta = service.guardar(request);
        return new ResponseEntity<CuentaResponse>(cuenta, HttpStatusCode.valueOf(200));

    }

/*    @PutMapping
    public ResponseEntity<Cuenta> actualizar(@RequestBody CuentaRequest request){
        Cuenta cuenta = service.actualizar(request);
        return new ResponseEntity<Cuenta>(cuenta, HttpStatusCode.valueOf(200));

    }*/

    @GetMapping("/buscar/{id}")   //http://localhost:8090/api/v1/counts/buscar/XX        SE TIENE QUE AGREGAR /BUSCAR, PORQUE ASI ESTA EN EL MAPPING
    public ResponseEntity<CuentaResponse> buscar(@PathVariable int id){
        CuentaResponse cuenta = service.buscar(id);
        return new ResponseEntity<CuentaResponse>(cuenta, HttpStatusCode.valueOf(200));

    }

    @DeleteMapping("/eliminar/{numCuenta}")
    public ResponseEntity<String> eliminar(@PathVariable String numCuenta){
        String mensaje = service.desactivar(numCuenta);
        return new ResponseEntity<String>(mensaje, HttpStatusCode.valueOf(200));

    }

    @GetMapping("/buscar-id/{numCuenta}")   //http://localhost:8090/api/v1/counts/buscar-id/       SE TIENE QUE AGREGAR /BUSCAR, PORQUE ASI ESTA EN EL MAPPING
    public ResponseEntity<Integer> getIdByNumCuenta(@PathVariable String numCuenta){
        Integer id = service.getIdByNumCuenta(numCuenta);
        return new ResponseEntity<Integer>(id, HttpStatusCode.valueOf(200));

    }
}
