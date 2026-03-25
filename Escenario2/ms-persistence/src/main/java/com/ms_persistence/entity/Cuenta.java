package com.ms_persistence.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="CUENTAS")
public class Cuenta implements Serializable {
    @Id
    @Column(name = "CUENTA_ID", columnDefinition = "NUMBER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cuentaId;
    @Column(name = "CLIENTE_ID", columnDefinition = "NUMBER")
    private int clienteId;
    @Column(name = "TIPO_CUENTA", columnDefinition = "NUMBER")
    private int tipoCuenta;
    @Column(name = "NUM_CUENTA", columnDefinition = "NVARCHAR2(12)")
    private String numCuenta;
    @Column(name = "CLABE", columnDefinition = "NVARCHAR2(18)")
    private String clabe;
    @Column(name = "SALDO", columnDefinition = "NUMBER(8,2)")
    private double saldo;
    @Column(name = "FECHA_AP", columnDefinition = "DATE")
    private LocalDate fechaAp;
    @Column(name = "STATUS", columnDefinition = "CHAR(1)")
    private char status;

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaAp() {
        return fechaAp;
    }

    public void setFechaAp(LocalDate fechaAp) {
        this.fechaAp = fechaAp;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
