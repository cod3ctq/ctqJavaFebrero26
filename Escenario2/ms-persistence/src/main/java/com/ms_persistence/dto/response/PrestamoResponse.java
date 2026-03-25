package com.ms_persistence.dto.response;

import java.time.LocalDate;

public class PrestamoResponse {

    /*private int prestamoId;
    private int tipoId;
    private int clienteId;*/
    private LocalDate fecha;
    private double monto;
    private LocalDate fechaFin;
    private double restante;

    //ONCSTRUCTORES
    public PrestamoResponse(){}

    public PrestamoResponse( LocalDate fecha, double monto, LocalDate fechaFin, double restante) {

        this.fecha = fecha;
        this.monto = monto;
        this.fechaFin = fechaFin;
        this.restante = restante;
    }

    //GETTER Y SETTER

    /*public int getPrestamoId() {
        return prestamoId;
    }

    public void setPrestamoId(int prestamoId) {
        this.prestamoId = prestamoId;
    }

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
*/
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    //to st4ring

    @Override
    public String toString() {
        return "PrestamoResponse{ " +
                " fecha=" + fecha +
                ", monto=" + monto +
                ", fechaFin=" + fechaFin +
                ", restante=" + restante +
                '}';
    }
}
