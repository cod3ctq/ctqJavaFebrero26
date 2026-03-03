package paquete2;


//EN codigo empresarial, todos los atributos de una clase cualquiera deben ser private.
// amenos que hay alguna razon en particular par ausar public o proteted, si no la tienen
//entonces debe usarse private

public class Camara {

    private double mpx;
    private double disFocal;
    private int zoom;
    private int valorISO;

    public Camara(){

    }

    public Camara(double mpx, double disFocal, int zoom, int valorISO) {
        this.mpx = mpx;
        this.disFocal = disFocal;
        this.zoom = zoom;
        this.valorISO = valorISO;
    }

    public double getMpx() {
        return mpx;
    }

    public void setMpx(double mpx) {
        this.mpx = mpx;
    }

    public double getDisFocal() {
        return disFocal;
    }

    public void setDisFocal(double disFocal) {
        this.disFocal = disFocal;
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

    @Override
    public String toString() {
        return "Camara{" +
                "mpx=" + mpx +
                ", disFocal=" + disFocal +
                ", zoom=" + zoom +
                ", valorISO=" + valorISO +
                '}';
    }
}
