package com.ms_persistence.dto.request;

import jakarta.validation.constraints.*;
import org.apache.logging.log4j.message.Message;

import java.time.LocalDate;

public class CuentaRequest {

    private int cuentaId;

    //VALIDACIONES
    /*
    RFC -> NO VACIO, NULO O MENOR A 13
     */
    @NotBlank(message="EL RFC NO DEBE SER VACIO")
    @Size(min = 13, max = 13, message="EL RFC DEBE TENER 13 CARACTERES")
    private String rfc;
    //NO VACIO NI NULO TIPOCUENTA
    @NotBlank(message="TIPO DE CUENTA NO DEBE SER NULO NI VACIO")
    private String tipoCuenta;

    //NO VACIO, NO NULO Y DE 12
    @NotBlank(message="EL NUMERO DE CUENTA NO DEBE QUEDAR NULO NI VACIO")
    private String numCuenta;


    //NO VACIO NO NULO Y DE 18
    @NotBlank(message="LA CLABE NO PUEDE SER NULA O VACIO")
    @Size(min = 18, max = 18, message = "LA CALBE DEBE CONTENER 18 CARACTERES")
    private String clabe;
    //VALORES POSITIVOS
    @Positive(message = "EL SALDO NO PUEDE SER MENOR DE 0")
    private double saldo;

    @FutureOrPresent(message = "LA FECHA DE REGISTRO NOI PUEDE SER DEL PASADO")
    private LocalDate fechaAp;
    private char status;

    /*
    CUNADO YA NO EXISTA UNA ANOTACION APRA VALIDAR ALGO MAS ESPECIFICO, SE TIEE QUE REALIZAR LOGICA, POR LO QUE
    SE TENDIRA QUE TRABAJAR EN EL LOGIC, OEN LA LOGICA DEL NEGOCIO
     */

    //CONSTRUCTOR
    public CuentaRequest(){}

    public CuentaRequest(int cuentaId, String rfc, String tipoCuenta, String numCuenta, String clabe, double saldo, LocalDate fechaAp, char status) {
        this.cuentaId = cuentaId;
        this.rfc = rfc;
        this.tipoCuenta = tipoCuenta;
        this.numCuenta = numCuenta;
        this.clabe = clabe;
        this.saldo = saldo;
        this.fechaAp = fechaAp;
        this.status = status;
    }

    //GETTER Y SETTER

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
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

    //TO STRING

    @Override
    public String toString() {
        return "CuentaRequest{" +
                "cuentaId=" + cuentaId +
                ", rfc='" + rfc + '\'' +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", clabe='" + clabe + '\'' +
                ", saldo=" + saldo +
                ", fechaAp=" + fechaAp +
                ", status=" + status +
                '}';
    }
}
