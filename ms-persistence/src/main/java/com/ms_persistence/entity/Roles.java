package com.ms_persistence.entity;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "ROLES")
public class Roles implements Serializable {

    @Id
    @Column(name="ROL_ID", columnDefinition = "NUMBER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rolId;
    @Column(name="DESCRIPCION", columnDefinition = "NVARCHAR2(255)")
    private String nombre;
    @Column(name="SUELDO", columnDefinition = "NUMBER(8,2)")
    private double sueldo;


    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
