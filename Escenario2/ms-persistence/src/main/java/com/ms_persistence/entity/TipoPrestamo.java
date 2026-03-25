package com.ms_persistence.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TIPO_PRESTAMO")
public class TipoPrestamo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TIPO_PRESTAMO_ID", columnDefinition = "NUMBER")
    private int tipoPrestamoId;

    @Column(name = "DESCRIPCION", columnDefinition = "NVARCHAR2(100)")
    private String descripcion;

    @Column(name = "INTERESES", columnDefinition = "NUMBER")
    private int interes;

    @Column(name = "PLAZO", columnDefinition = "NUMBER")
    private int plazo;


    public int getTipoPrestamoId() {
        return tipoPrestamoId;
    }

    public void setTipoPrestamoId(int tipoPrestamoId) {
        this.tipoPrestamoId = tipoPrestamoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
