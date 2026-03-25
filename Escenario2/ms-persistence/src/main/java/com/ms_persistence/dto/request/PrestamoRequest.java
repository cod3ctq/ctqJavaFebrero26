package com.ms_persistence.dto.request;

import java.time.LocalDate;

public class PrestamoRequest {

/*
    private int prestamoId;
    private int tipoId;
    private int clienteId;
    private LocalDate fecha;
    private double monto;
    private LocalDate fechaFin;
    private double restante;
*/

    //LO NUEVOS ATRIBUTOS
    private String descripcionPrestamo;
    private String rfcCliente;
    private double monto;
    private LocalDate fechaFin;
    private double restante;


    //CONTRUCTORES
    public PrestamoRequest(){}

    public PrestamoRequest(String descripcionPrestamo, String rfcCliente, double monto, LocalDate fechaFin, double restante) {
        this.descripcionPrestamo = descripcionPrestamo;
        this.rfcCliente = rfcCliente;
        this.monto = monto;
        this.fechaFin = fechaFin;
        this.restante = restante;
    }

    /*
    public PrestamoRequest(int prestamoId, int tipoId, int clienteId, LocalDate fecha, double monto, LocalDate fechaFin, double restante) {
        this.prestamoId = prestamoId;
        this.tipoId = tipoId;
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.monto = monto;
        this.fechaFin = fechaFin;
        this.restante = restante;
    }
*/

    //GETTER UYY SETTER

    public String getDescripcionPrestamo() {
        return descripcionPrestamo;
    }

    public void setDescripcionPrestamo(String descripcionPrestamo) {
        this.descripcionPrestamo = descripcionPrestamo;
    }

    public String getRfcCliente() {
        return rfcCliente;
    }

    public void setRfcCliente(String rfcCliente) {
        this.rfcCliente = rfcCliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getRestante() {
        return restante;
    }

    public void setRestante(double restante) {
        this.restante = restante;
    }

    //TO STRING


    @Override
    public String toString() {
        return "PrestamoRequest{" +
                "descripcionPrestamo='" + descripcionPrestamo + '\'' +
                ", rfcCliente='" + rfcCliente + '\'' +
                ", monto=" + monto +
                ", fechaFin=" + fechaFin +
                ", restante=" + restante +
                '}';
    }
}
