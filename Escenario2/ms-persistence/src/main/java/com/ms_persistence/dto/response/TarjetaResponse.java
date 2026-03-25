package com.ms_persistence.dto.response;

public class TarjetaResponse {

    private String numTarjeta;
    private String nip;
    private String fechaVen;
    private char status;

    //CPOSNTRUCTORES
    public TarjetaResponse (){}

    public TarjetaResponse(String numTarjeta, String nip, String fechaVen, char status) {
        this.numTarjeta = numTarjeta;
        this.nip = nip;
        this.fechaVen = fechaVen;
        this.status = status;
    }

    //GETTER Y SETTER


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

    public String getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(String fechaVen) {
        this.fechaVen = fechaVen;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    //TO STRING

    @Override
    public String toString() {
        return "TarjetaResponse{" +
                "numTarjeta='" + numTarjeta + '\'' +
                ", nip='" + nip + '\'' +
                ", fechaVen='" + fechaVen + '\'' +
                ", status=" + status +
                '}';
    }
}
