package com.ms_persistence.dto.request;

public class TarjetaRequest {

    private String numCuenta;
    private String descripcion;
    private String numTarjeta;
    private String nip;
    //private String fechaVen;
    //EL STATUS SE COLCORIA POR DEFAULT 1

    //CONCTRUCTORES
    public TarjetaRequest (){}

    public TarjetaRequest(String numCuenta, String descripcion, String numTarjeta, String nip) {
        this.numCuenta = numCuenta;
        this.descripcion = descripcion;
        this.numTarjeta = numTarjeta;
        this.nip = nip;
        //this.fechaVen = fechaVen;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

/*    public String getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(String fechaVen) {
        this.fechaVen = fechaVen;
    }*/

    @Override
    public String toString() {
        return "TarjetaRequest{" +
                "numCuenta='" + numCuenta + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", numTarjeta='" + numTarjeta + '\'' +
                ", nip='" + nip + '\'' +

                '}';
    }
}
