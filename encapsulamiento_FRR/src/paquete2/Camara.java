package paquete2;

public class Camara {

    private double mpx;
    private double distFocal;
    private int zooom;
    private int valorISO;


    public Camara(){}

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

    public int getZooom() {
        return zooom;
    }

    public void setZooom(int zooom) {
        this.zooom = zooom;
    }

    public int getValorISO() {
        return valorISO;
    }

    public void setValorISO(int valorISO) {
        this.valorISO = valorISO;
    }
}
