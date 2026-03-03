package paquete2;

//En codigo empresarial, todos los atributos de una clase cualquiera deben ser private.
//A menos que haya alguna razon en particular para usar public o protected.


public class Camara {

    private double mpx;
    private double distFocal;
    private int zoom;
    private int valorISO;

    public Camara(){

    }

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
