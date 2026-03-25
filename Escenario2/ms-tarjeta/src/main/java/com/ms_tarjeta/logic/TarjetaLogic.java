package com.ms_tarjeta.logic;

import com.ms_persistence.dto.request.TarjetaRequest;
import com.ms_persistence.dto.response.TarjetaResponse;
import com.ms_persistence.entity.Cuenta;
import com.ms_persistence.entity.Tarjeta;
import com.ms_persistence.entity.TipoTarjeta;
import com.ms_persistence.repository.CuentaRepository;
import com.ms_persistence.repository.TarjetaRepository;
import com.ms_persistence.repository.TipoTarjetaRepository;
import com.ms_tarjeta.service.ITarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TarjetaLogic  implements ITarjetaService {


    //Inversion de control (IoC)<--Investigar  //La clase decide cuando instanciar al componente inyectado
    //Inyeccion de dependencias         //Consumo//Exposicion de la logica de un componente desacoplado

    @Autowired
    TarjetaRepository repo;//MInetras no se necesite, no existe...

    @Autowired
    TipoTarjetaRepository tipoTarjetaRepo;

    @Autowired
    CuentaRepository cuentaRepo;

    RestTemplate http = new RestTemplate();

    @Override
    public TarjetaResponse guardar(TarjetaRequest request) {

        Tarjeta tar = new Tarjeta();

        TipoTarjeta tipoTarjeta = tipoTarjetaRepo.findByDescription(request.getDescripcion()).get();
        Cuenta cuenta = cuentaRepo.findByNumCuenta(request.getNumCuenta()).get();

        LocalDate fechaVen = LocalDate.now().plusYears(5);

        //Integer tipoTarjetaId = http.getForObject("http://localhost:8092/api/v1/tipotarjeta/buscar-id/"+request.getDescripcion(), Integer.class);

        tar.setCuentaId(cuenta.getCuentaId());
        tar.setTipo(tipoTarjeta);
        tar.setNumTarjeta(request.getNumTarjeta());
        tar.setNip(request.getNip());
        tar.setFechaVen(fechaVen);
        tar.setStatus("ACTIVO");

        repo.save(tar);

        TarjetaResponse response = new TarjetaResponse(request.getNumTarjeta(),request.getNip(),tar.getFechaVen().toString(),tar.getStatus().charAt(0));

        return response;
    }

    @Override
    public List mostrar() {
        List<TarjetaResponse> lista=new ArrayList<>();

        for (Tarjeta t:repo.findAll()){
            lista.add(new TarjetaResponse(t.getNumTarjeta(),t.getNip(),t.getFechaVen().toString(),t.getStatus().charAt(0)));
        }

        return lista;
    }

    @Override
    public TarjetaResponse buscar(int id) {
        Tarjeta t = repo.findById(id).get();
        TarjetaResponse response = new TarjetaResponse(t.getNumTarjeta(),t.getNip(),t.getFechaVen().toString(),t.getStatus().charAt(0));
        return response;


    }

    @Override
    public TarjetaResponse actualizar(TarjetaRequest request) {

        Tarjeta tar = new Tarjeta();

        TipoTarjeta tipoTarjeta = tipoTarjetaRepo.findByDescription(request.getNumTarjeta()).get();
        Cuenta cuenta = cuentaRepo.findByNumCuenta(request.getNumCuenta()).get();

        tar.setCuentaId(cuenta.getCuentaId());
        tar.setTipo(tipoTarjeta);
        tar.setNumTarjeta(request.getNumTarjeta());
        tar.setNip(request.getNip());
        tar.setFechaVen(LocalDate.now().plusYears(5));
        tar.setStatus("1");

        repo.save(tar);

        TarjetaResponse response = new TarjetaResponse(request.getNumTarjeta(),request.getNip(),tar.getFechaVen().toString(),tar.getStatus().charAt(0));

        return response;
    }

    @Override
    public String eliminar(int id) {
        repo.deleteById(id);
        return "Eliminado";
    }

}
