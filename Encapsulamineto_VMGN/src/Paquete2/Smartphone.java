package Paquete2;

import Paquete1.Celular;

import java.util.Arrays;

public class Smartphone extends Celular implements IGrabadora,ICamara,IReproductorMusica {

    private String sistemaOperativo;


    //Composicion:: array de objetos

    private Camara[] cam;  //Aqui solo se declara el array



    public Smartphone(){}

    public Smartphone(String marca, String modelo, String material, String sistemaOperativo, Camara[] cam) {
        super(marca, modelo, material);
        this.sistemaOperativo = sistemaOperativo;
        this.cam = cam;




    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Camara[] getCam() {
        return cam;
    }

    public void setCam(Camara[] cam) {
        this.cam = cam;
    }

    @Override
    public void captuararFoto() {

    }

    @Override
    public void grabarVideo() {

    }

    @Override
    public void comenzarGrabacion() {

    }

    @Override
    public void pausarGrabacion() {

    }

    @Override
    public void reproducirGrabacion() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pauasa() {

    }

    @Override
    public void subirVolumen() {

    }

    @Override
    public void bajarVolumen() {

    }

    @Override
    public void cancionSig() {

    }

    @Override
    public void cancionAnt() {

    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", cam=" + Arrays.toString(cam) +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
