package com.ms_tarjeta.controller;

import com.ms_persistence.dto.request.TarjetaRequest;
import com.ms_persistence.dto.response.TarjetaResponse;
import com.ms_tarjeta.logic.TarjetaLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//Asigna el rol de controlador  de peticiones a esta clase
@RequestMapping("api/v1/tarj")
public class TarjetaController {


    @Autowired
    TarjetaLogic service;

    @GetMapping //http://localhost:8093/api/v1/tarj
    public ResponseEntity<List> mostrar(){
        List<TarjetaResponse> tarj = service.mostrar();
        return new ResponseEntity<List>(tarj, HttpStatusCode.valueOf(200));
    }
    //MovimientoRequest define la forma del objeto que recibira mediante la peticion
    //@RequestBody habilita la extracion/recepcion de datos en el cuerpo de la peticion
    //Verbo HTTP
    @PostMapping//http//localhost:8093/api/v1/tarj
    public ResponseEntity<TarjetaResponse>resgistrar(@RequestBody TarjetaRequest request){
        TarjetaResponse tar = service.guardar(request);
        return new ResponseEntity<TarjetaResponse>(tar,HttpStatusCode.valueOf(200));
    }

    @PutMapping //http//localhost:8093/api/v1/tarj
    public ResponseEntity<TarjetaResponse>actualizar(@RequestBody TarjetaRequest request){
        TarjetaResponse tar = service.actualizar(request);
        return new ResponseEntity<TarjetaResponse>(tar,HttpStatusCode.valueOf(200));
    }

    @GetMapping("/buscar/{id}")//  http://localhost:8093/api/v1/movs/buscar/15
    public ResponseEntity<TarjetaResponse>buscar(@PathVariable int id){
        TarjetaResponse tar = service.buscar(id);
        return new ResponseEntity<TarjetaResponse>(tar,HttpStatusCode.valueOf(200));
    }
    @DeleteMapping ("/eliminar/{id}")
    public ResponseEntity<String>eliminar(@PathVariable int id){
        String mensaje = service.eliminar(id);
        return new ResponseEntity<String>(mensaje,HttpStatusCode.valueOf(200));
    }

}
