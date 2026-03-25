package com.ms_prestamos.logic;

import com.ms_persistence.dto.request.PrestamoRequest;
import com.ms_persistence.dto.response.PrestamoResponse;
import com.ms_persistence.entity.Clientes;
import com.ms_persistence.entity.Prestamo;
import com.ms_persistence.entity.TipoPrestamo;
import com.ms_persistence.repository.ClienteRepository;
import com.ms_persistence.repository.PrestamoRepository;
import com.ms_persistence.repository.TipoPrestamoRepository;
import com.ms_prestamos.service.IPrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PrestamoLogic implements IPrestamoService {

    @Autowired
    PrestamoRepository Prestamorepo;

    //DE ESTAS TABLAS ES NECESARIO LA AYUDA, PARA OBETENER LOS ID DE SUS DESCRIPCIONES
    @Autowired
    TipoPrestamoRepository tipoPresRepo;

    @Autowired
    ClienteRepository clienteRepo;



    @Override
    public PrestamoResponse guardar(PrestamoRequest request) {

        Prestamo pres = new Prestamo();

        TipoPrestamo tipoPres = tipoPresRepo.findByDescription(request.getDescripcionPrestamo()).get();
        Clientes cliente = clienteRepo.findByRfcCliente(request.getRfcCliente()).get();

        pres.setTipoId(tipoPres.getTipoPrestamoId());
        pres.setClienteId(cliente.getClienteId());
        pres.setFecha(LocalDate.now());
        pres.setMonto(request.getMonto());
        pres.setFechaFin(request.getFechaFin());
        pres.setRestante(request.getRestante());

        System.out.println(pres);
        Prestamorepo.save(pres);

        PrestamoResponse response = new PrestamoResponse(pres.getFecha(),pres.getMonto(),pres.getFechaFin(),pres.getRestante());

        return response;
    }

    @Override
    public PrestamoResponse buscar(int id) {

        Prestamo pres = Prestamorepo.findById(id).get();
        PrestamoResponse response = new PrestamoResponse(pres.getFecha(),pres.getMonto(),pres.getFechaFin(),pres.getRestante());

        return response;

    }

    @Override
    public List mostrar() {

        List<PrestamoResponse> lista = new ArrayList<PrestamoResponse>();

        for (Prestamo pres : Prestamorepo.findAll()){
            lista.add(new PrestamoResponse(pres.getFecha(),pres.getMonto(),pres.getFechaFin(),pres.getRestante()));
        }
        return lista;
    }

    @Override
    public PrestamoResponse actualizar(PrestamoRequest request) {

        Prestamo pres = new Prestamo();

        TipoPrestamo tipoPres = tipoPresRepo.findByDescription(request.getDescripcionPrestamo()).get();
        Clientes cliente = clienteRepo.findByRfcCliente(request.getRfcCliente()).get();

        pres.setPrestamoId(tipoPres.getTipoPrestamoId());

        pres.setClienteId(cliente.getClienteId());
        pres.setMonto(request.getMonto());
        pres.setFechaFin(request.getFechaFin());
        pres.setRestante(request.getRestante());

        Prestamorepo.save(pres);

        PrestamoResponse response = new PrestamoResponse(pres.getFecha(),pres.getMonto(),pres.getFechaFin(),pres.getRestante());

        return response;
    }

    @Override
    public String eliminar(int id) {

        Prestamorepo.deleteById(id);
        return "SE ELIMINO";
    }
}
