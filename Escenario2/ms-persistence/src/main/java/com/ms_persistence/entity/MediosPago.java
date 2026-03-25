package com.ms_persistence.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "MEDIOS_PAGO")
public class MediosPago implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEDIO_ID", columnDefinition = "NUMBER")
    private int medioId;

    @Column(name = "DESCRIPCION", columnDefinition = "NVARCHAR2(100)")
    private String descripcion;

    public int getMedioId() {
        return medioId;
    }

    public void setMedioId(int medioId) {
        this.medioId = medioId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
