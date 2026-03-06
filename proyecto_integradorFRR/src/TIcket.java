import java.time.LocalDate;

public class TIcket {

    private String direccion;
    private LocalDate fecha;
    private double monto;
    private String tipoOperacion;
    private int folioOperacion;


    public TIcket(){}

    public TIcket(String direccion, LocalDate fecha, double monto, String tipoOperacion, int folioOperacion) {
        this.direccion = direccion;
        this.fecha = fecha;
        this.monto = monto;
        this.tipoOperacion = tipoOperacion;
        this.folioOperacion = folioOperacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public int getFolioOperacion() {
        return folioOperacion;
    }

    public void setFolioOperacion(int folioOperacion) {
        this.folioOperacion = folioOperacion;
    }

    @Override
    public String toString() {
        return "TIcket{" +
                "direccion='" + direccion + '\'' +
                ", fecha=" + fecha +
                ", monto=" + monto +
                ", tipoOperacion='" + tipoOperacion + '\'' +
                ", folioOperacion=" + folioOperacion +
                '}';
    }
}
