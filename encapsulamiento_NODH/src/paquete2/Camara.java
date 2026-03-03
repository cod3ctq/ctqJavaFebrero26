package paquete2;
//En codigo empresarial, todos los atributos de una clase cualquiera deben ser private.
//A menos que haya alguna razon en particular para usar public o protected, si no la tienen
//entonces debe usarse private
public class Camara {
    private double mpx;
    private double distFocal;
    private int zoom;
    private int valirISO;

    public Camara() {

    }

    public Camara(double mpx, double distFocal, int zoom, int valirISO) {
        this.mpx = mpx;
        this.distFocal = distFocal;
        this.zoom = zoom;
        this.valirISO = valirISO;
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

    public int getValirISO() {
        return valirISO;
    }

    public void setValirISO(int valirISO) {
        this.valirISO = valirISO;
    }

    @Override
    public String toString() {
        return "Camara{" +
                "mpx=" + mpx +
                ", distFocal=" + distFocal +
                ", zoom=" + zoom +
                ", valirISO=" + valirISO +
                '}';
    }
}
