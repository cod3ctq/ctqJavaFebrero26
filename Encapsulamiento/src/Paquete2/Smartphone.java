package Paquete2;

import Paquete1.Celular;

import java.util.Arrays;

public class Smartphone extends Celular {


    //COMPOSICION
    // ASI ADQUIERES LA PROPIEDADSES DEL OBEJTO CAMARA, EN ESTE EJEMPLO OBTENEMOS LAS CARACTERITICAS DE LA CAMARA
    private String sistemaOperativo;
    private Camara[] cam = new Camara[5];


    public Smartphone (){}

    public Smartphone(String marca, String modelo, String material, String sistemaOperativo, Camara[] cam) {
        super(marca, modelo, material);
        this.sistemaOperativo = sistemaOperativo;
        this.cam = cam;

    }

    //getter y setter

    public Camara[] getCam() {
        return cam;
    }

    public void setCam(Camara[] cam) {
        this.cam = cam;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }


    //TO STRING

    @Override
    public String toString() {
        return "Smartphone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", cam=" + Arrays.toString(cam) +
                '}';
    }
}
