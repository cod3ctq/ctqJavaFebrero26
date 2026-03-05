public class Ciudad {
    private String nombre;
    private String poblacion;
    private double extension;
    private String actividadeconomica;

    public Ciudad(String nombre, String poblacion, double extension, String actividadeconomica) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.extension = extension;
        this.actividadeconomica = actividadeconomica;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public String getActividadeconomica() {
        return actividadeconomica;
    }

    public void setActividadeconomica(String actividadeconomica) {
        this.actividadeconomica = actividadeconomica;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", extension=" + extension +
                ", actividadeconomica='" + actividadeconomica + '\'' +
                '}';
    }
}
