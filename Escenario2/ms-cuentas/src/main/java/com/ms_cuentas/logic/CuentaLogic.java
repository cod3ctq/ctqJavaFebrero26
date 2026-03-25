package com.ms_cuentas.logic;



import com.ms_cuentas.exception.BusinessException;
import com.ms_cuentas.service.ICuentaService;
import com.ms_persistence.dto.request.CuentaRequest;
import com.ms_persistence.dto.response.CuentaResponse;
import com.ms_persistence.entity.Clientes;
import com.ms_persistence.entity.Cuenta;
import com.ms_persistence.entity.TipoCuenta;
import com.ms_persistence.repository.ClienteRepository;
import com.ms_persistence.repository.CuentaRepository;
import com.ms_persistence.repository.TipoCuentaRepository;
import jakarta.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CuentaLogic implements ICuentaService {

    @Autowired
    CuentaRepository cuentaRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    TipoCuentaRepository tipoCuentaRepository;


    @Override
    public CuentaResponse guardar(CuentaRequest request) {

        Cuenta cuenta = null;
        /*
        AQUI SE ELABORA LA LOGICA PARA VALIDAR LO QUE NO SE LOGRO CON LAS ANOTACIONES
         */

        //VALIDAR QUE AÚN NO EXISTA UNA CUENTA CON EL NÚMERO DE CUENTA
        if (cuentaRepository.findByNumCuenta(request.getNumCuenta()).isPresent()){
            throw new BusinessException("YA EXISTE ESTE NUMERO DE CUENTA");
            //System.out.println("YA EXISTE ESTE NUMERO DE CUENTA");
        }else if (clienteRepository.findByRfcCliente(request.getRfc()).isEmpty()){
            //VALIDAR EL CLIENTE , BUSCAR POR RFC
            throw new BusinessException("NO HAY UN CLIENTE CON ESTE RFC !");
            //System.out.println("NO HAY UN CLIENTE CON ESTE RFC !");

        }else if (tipoCuentaRepository.findByDescripcion(request.getTipoCuenta()).isEmpty()){
            //VALIDAR EL TIPO DE CUENTA, BUSCAR POR DESCRIPCIÓN
            throw new BusinessException("NO EXISTE TAL TIPO DE CUENTA");
            //System.out.println("NO EXISTA TAL TIPO DE CUENTA");

        }else if (cuentaRepository.findByClabe(request.getClabe()).isPresent()){
            //VALIDAR QUE LA CLABE NO EXISTA
            throw new BusinessException("CLABE YA REGISTRADA");
            //System.out.println("CLABE YA REGISTRADA");
        }else {         //HASTA ESTE PUNTO, YA SE VALIDO TODO
            //BUSCAR AL CLIENTE POR EL RFC
            Clientes cliente = clienteRepository.findByRfcCliente(request.getRfc()).get();
            TipoCuenta tipoCuenta = tipoCuentaRepository.findByDescripcion(request.getTipoCuenta()).get();
            cuenta = new Cuenta();
            //BUSCAR AL TIPOCUENTAID POR SU DESCRIPCION

            cuenta.setClienteId(cliente.getClienteId());
            cuenta.setTipoCuenta(tipoCuenta.getTipoCuentaId());
            cuenta.setNumCuenta(request.getNumCuenta());
            cuenta.setClabe(request.getClabe());
            cuenta.setSaldo(request.getSaldo());
            cuenta.setFechaAp(LocalDate.now());
            cuenta.setStatus('1');

            cuentaRepository.save(cuenta);

            CuentaResponse response = new CuentaResponse(cuenta.getNumCuenta(),
                    request.getTipoCuenta(),
                    cuenta.getClabe(),
                    cuenta.getFechaAp());

            return response;
        }

    }

    @Override
    public CuentaResponse buscar(int id) {

        Cuenta cuenta =cuentaRepository.findActiveById(id).get();
        CuentaResponse response = new CuentaResponse(cuenta.getNumCuenta(),
                                Integer.toString(cuenta.getTipoCuenta()),
                                cuenta.getClabe(), cuenta.getFechaAp());

        return response;

    }

    @Override
    public List mostrar() {

        List<Cuenta> entidades = cuentaRepository.findAllActive().get();
        List<CuentaResponse> response = new ArrayList<CuentaResponse>();
        for (Cuenta cuenta : entidades){
            response.add(new CuentaResponse(cuenta.getNumCuenta(),
                    Integer.toString(cuenta.getTipoCuenta()),
                    cuenta.getClabe(), cuenta.getFechaAp()));
        }

        return response;

    }
    @Transactional
    @Override
    public String desactivar(String numCuenta) {

        cuentaRepository.deleteByNumCuenta(numCuenta);
        return " Eliminado !";
    }

    @Override
    public Integer getIdByNumCuenta(String numCuenta) {
        Optional<Cuenta> c = null;
        c = cuentaRepository.findByNumCuenta(numCuenta);

        if (c.isPresent()){
            return c.get().getCuentaId();
        }else{
            return 0;
        }

    }
}
