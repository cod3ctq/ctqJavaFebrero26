package Paquete2;

/*
EN CODIGO EMPRESARIAL, TODOS LOS ATRIBUTOS DE UNA CLASE CUALQUIERA DEBEN SER PRIVADOS.
A MENOS QUE EXISTA ALGUNA RAZON EN PARTICULAR PARA USAR PUBLIC O PROTECTED
SINO LA TIENEN ENTONCES DEBE USARSE PRIVATE
 */

public class Camara {
    //encapsulamiento

    private double mpx;
    private double distFocal;
    private int zoom;
    private int valorISO;

    // CONSTRUCTORES
    public Camara(){}

    public Camara(double mpx, double distFocal, int zoom, int valorISO) {
        this.mpx = mpx;
        this.distFocal = distFocal;
        this.zoom = zoom;
        this.valorISO = valorISO;
    }

    //getter y setter

    public double getMpx() {
        return mpx;
    }

    public void setMpx(double mpx) {
        this.mpx = mpx;
    }

    public double getDistFocal() {
        return distFocal;
    }

    public void setDistFocal(double distFocal) {
        this.distFocal = distFocal;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public int getValorISO() {
        return valorISO;
    }

    public void setValorISO(int valorISO) {
        this.valorISO = valorISO;
    }
}
