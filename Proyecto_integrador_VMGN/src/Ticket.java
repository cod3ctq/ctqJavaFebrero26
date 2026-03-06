import java.time.LocalDate;

public class Ticket {

    private String dirrecion;
    private LocalDate fecha;
    private double monto;
    private String tipoOperacion;
    private int folioOperacion;


    public Ticket(){}

    public Ticket(String dirrecion, LocalDate fecha, double monto, String tipoOperacion, int folioOperacion) {
        this.dirrecion = dirrecion;
        this.fecha = fecha;
        this.monto = monto;
        this.tipoOperacion = tipoOperacion;
        this.folioOperacion = folioOperacion;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
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
        return "Ticket{" +
                "dirrecion='" + dirrecion + '\'' +
                ", fecha=" + fecha +
                ", monto=" + monto +
                ", tipoOperacion='" + tipoOperacion + '\'' +
                ", folioOperacion=" + folioOperacion +
                '}';
    }
}
