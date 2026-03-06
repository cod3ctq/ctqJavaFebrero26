import java.time.LocalDate;

public class Ticket {

    private String direccion;
    private LocalDate fecha;
    private double monto;
    private String tipoOperacion;
    private int folio;

    public Ticket(){}

    public Ticket(String direccion, LocalDate fecha, double monto, String tipoOperacion, int folio) {
        this.direccion = direccion;
        this.fecha = fecha;
        this.monto = monto;
        this.tipoOperacion = tipoOperacion;
        this.folio = folio;
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

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "direccion='" + direccion + '\'' +
                ", fecha=" + fecha +
                ", monto=" + monto +
                ", tipoOperacion='" + tipoOperacion + '\'' +
                ", folio=" + folio +
                '}';
    }
}

