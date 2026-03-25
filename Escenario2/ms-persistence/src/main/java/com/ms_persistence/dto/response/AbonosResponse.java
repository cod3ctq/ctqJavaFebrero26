package com.ms_persistence.dto.response;

public class AbonosResponse {

    private String fecha;
    private double monto;
    private String medioPago;

    //CONSTRUCTORES
    public AbonosResponse(){}

    public AbonosResponse(String fecha, double monto, String medioPago) {
        this.fecha = fecha;
        this.monto = monto;
        this.medioPago = medioPago;
    }

    //GETTER Y SETTER

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    //TO STRING

    @Override
    public String toString() {
        return "AbonosResponse{" +
                "fecha='" + fecha + '\'' +
                ", monto=" + monto +
                ", medioPago='" + medioPago + '\'' +
                '}';
    }
}
