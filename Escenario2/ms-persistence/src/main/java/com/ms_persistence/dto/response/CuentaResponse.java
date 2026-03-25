package com.ms_persistence.dto.response;

import java.time.LocalDate;

public class CuentaResponse {

    private String numCuenta;
    private String tipoCuenta;
    private String clabe;
    private LocalDate fechaAp;

    //CONSTRUCTORES
    public CuentaResponse(){}

    public CuentaResponse(String numCuenta, String tipoCuenta, String clabe, LocalDate fechaAp) {
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
        this.clabe = clabe;
        this.fechaAp = fechaAp;
    }


    //GETTER Y SETTER

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public LocalDate getFechaAp() {
        return fechaAp;
    }

    public void setFechaAp(LocalDate fechaAp) {
        this.fechaAp = fechaAp;
    }


    //TO STRING


    @Override
    public String toString() {
        return "CuentaResponse{" +
                "numCuenta='" + numCuenta + '\'' +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                ", clabe='" + clabe + '\'' +
                ", fechaAp=" + fechaAp +
                '}';
    }
}
