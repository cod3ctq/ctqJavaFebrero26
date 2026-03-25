package com.ms_persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

//PADRE
@Entity
@Table(name = "TIPO_TARJETA")
public class TipoTarjeta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TIPO_T_ID", columnDefinition = "NUMBER")
    private int tipoTId;

    @Column(name = "DESCRIPCION", columnDefinition = "NVARCHAR2(100)")
    private String descripcion;

    //ESTE ES UN ATRIBUTO RELACIONAL, NO EXISTE FISICAMENTE EN LA TABLA
    @JsonManagedReference
    @OneToMany(mappedBy = "tipo")
    private List<Tarjeta> tarjetas;

    public int getTipoTId() {
        return tipoTId;
    }

    public void setTipoTId(int tipoTId) {
        this.tipoTId = tipoTId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }
}
