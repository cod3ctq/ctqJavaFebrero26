package com.ms_persistence.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="EMPLEADOS")
public class Empleados implements Serializable {

    @Id
    @Column(name="EMPLEADO_ID", columnDefinition = "NUMBER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empleadoId;
    @Column(name="NOMBRE", columnDefinition = "NVARCHAR2(255)")
    private String nombre;
    @Column(name="AP_P", columnDefinition = "NVARCHAR2(255)")
    private String apP;
    @Column(name="AP_M", columnDefinition = "NVARCHAR2(255)")
    private String apM;
    @Column(name="FECHA_IN", columnDefinition = "DATE")
    private LocalDate fechaIn;
    @Column(name="CORREO", columnDefinition = "NVARCHAR2(100)")
    private String correo;
    @Column(name="TEL", columnDefinition = "VARCHAR2(20)")
    private String tel;
    @Column(name="STATUS", columnDefinition = "NVARCHAR2(50)")
    private String status;

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApP() {
        return apP;
    }

    public void setApP(String apP) {
        this.apP = apP;
    }

    public String getApM() {
        return apM;
    }

    public void setApM(String apM) {
        this.apM = apM;
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
