package com.ms_persistence.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="ABONOS")
public class Abonos implements Serializable {

    @Id
    @Column(name="ABONO_ID", columnDefinition = "NUMBER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int abonoId;
    @Column(name="PRESTAMO_ID", columnDefinition = "NUMBER")
    private int prestamoId;
    @Column(name="MEDIO_PAGO", columnDefinition = "NUMBER")
    private int medioPagoId;
    @Column(name="FECHA", columnDefinition = "DATE")
    private LocalDate fecha;
    @Column(name="MONTO", columnDefinition = "NUMBER(8,2)")
    private double monto;

    public int getAbonoId() {
        return abonoId;
    }

    public void setAbonoId(int abonoId) {
        this.abonoId = abonoId;
    }

    public int getPrestamoId() {
        return prestamoId;
    }

    public void setPrestamoId(int prestamoId) {
        this.prestamoId = prestamoId;
    }

    public int getMedioPagoId() {
        return medioPagoId;
    }

    public void setMedioPagoId(int medioPagoId) {
        this.medioPagoId = medioPagoId;
    }

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
}
