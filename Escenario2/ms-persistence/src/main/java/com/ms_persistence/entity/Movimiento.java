package com.ms_persistence.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

//Anotaciones de Hibernate (@Entity, @Table, @Id, @Column, @GeneratedValue, @OneToMany, @ManyToMany)
//Serializacion : Desintegracion en bytes del estado de un objeto

@Entity //Asigna el rol de entidad a esta clase
@Table(name="MOVIMIENTOS") //Señala a que tabla representa esta entidad
public class Movimiento implements Serializable {

    @Id //Establece el atributo que sera llave primaria de la entidad
    @Column(name ="MOV_ID", columnDefinition = "NUMBER") //Enlaza una columna con el atributo de la clase
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Configura la generacion automatica del id de la entidad
    private int movId;
    @Column(name ="CUENTA_ID", columnDefinition = "NUMBER")
    private int cuentaId;
    @Column(name ="TIPO", columnDefinition = "NVARCHAR2(100)")
    private String tipo;
    @Column(name ="FECHA_OP", columnDefinition = "DATE")
    private LocalDate fechaOp;
    @Column(name ="MONTO", columnDefinition = "NUMBER(8,2)")
    private double monto;

    //Sin constructores

    public int getMovId() {
        return movId;
    }

    public void setMovId(int movId) {
        this.movId = movId;
    }

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaOp() {
        return fechaOp;
    }

    public void setFechaOp(LocalDate fechaOp) {
        this.fechaOp = fechaOp;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
