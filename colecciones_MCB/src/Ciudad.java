public class Ciudad {

    private String nombre;
    private int poblacion;
    private double extension;
    private String actividadEconmica;

    public Ciudad(){}

    public Ciudad(String nombre, int poblacion, double extension, String actividadEconmica) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.extension = extension;
        this.actividadEconmica = actividadEconmica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public String getActividadEconmica() {
        return actividadEconmica;
    }

    public void setActividadEconmica(String actividadEconmica) {
        this.actividadEconmica = actividadEconmica;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", extension=" + extension +
                ", actividadEconmica='" + actividadEconmica + '\'' +
                '}';
    }
}
