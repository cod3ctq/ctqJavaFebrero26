package paquete2;

import paquete1.Celular;

import java.util.Arrays;


public class SmartPhone extends Celular implements IGrabadora,ICamara,IReproductorMusica {

    private String sistemeOperativo;

    //Composicion
    private Camara [] cam;

    public SmartPhone(){}


    public SmartPhone(String marca, String modelo, String material, String sistemeOperativo, Camara[] cam) {
        super(marca, modelo, material);
        this.sistemeOperativo = sistemeOperativo;
        this.cam = cam;
    }


    public String getSistemeOperativo() {
        return sistemeOperativo;
    }

    public void setSistemeOperativo(String sistemeOperativo) {
        this.sistemeOperativo = sistemeOperativo;
    }

    public Camara[] getCam() {
        return cam;
    }

    public void setCam(Camara[] cam) {
        this.cam = cam;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "cam=" + Arrays.toString(cam) +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemeOperativo='" + sistemeOperativo + '\'' +
                '}';
    }

    @Override
    public void comenzarGrbabacion() {

    }

    @Override
    public void pausarGrabacion() {

    }

    @Override
    public void detenerGrabacion() {

    }

    @Override
    public void ReproducirGrabacion() {

    }

    @Override
    public void capturarFoto() {

    }

    @Override
    public void grabarVideo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pausar() {

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
}
