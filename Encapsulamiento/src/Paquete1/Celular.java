package Paquete1;

import Paquete2.ICamara;
import Paquete2.IGrabadora;
import Paquete2.IReproductorMusica;

public class Celular implements IGrabadora, ICamara, IReproductorMusica {


    //ENCAPSULAMIENTO : ES EL MECANISMO PARA CONTROLAR LA VIIBILIDAD Y ACCESO A LOS MIEMBROS
    //DE UN CLASE, ADEMAS Q EXPONE LA FUNCIONALIDAD OCULTANDO LOS DETALLES
    //SE APLICA A TRAVEZ DE 3 MODIFICADORES DE ACCESO

    public String marca;
    protected String modelo;
    private String material;

    //CONSTRUCTORES
    public Celular(){}

    public Celular(String marca, String modelo, String material) {
        this.marca = marca;
        this.modelo = modelo;
        this.material = material;
    }


    //GETTER Y SETTER

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //TO STRING

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public void comernzaGrabacion() {

    }

    @Override
    public void pausarGrabacion() {

    }

    @Override
    public void detenerGrabacion() {

    }

    @Override
    public void reproducirGrabacion() {

    }

    @Override
    public void capturaFoto() {

    }

    @Override
    public void grabarVideo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pausa() {

    }

    @Override
    public void subirVolumne() {

    }

    @Override
    public void bajarvolumen() {

    }

    @Override
    public void cancionSig() {

    }

    @Override
    public void cancionAnt() {

    }
}
