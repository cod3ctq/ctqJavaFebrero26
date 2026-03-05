public class Ciudad {
    private String nombre;
    private String poblacion;
    private double extencionKM2;
    private String actividadEconomica;

    public Ciudad() {

    }

    public Ciudad(String nombre, String poblacion, double extencionKM2, String actividadEconomica) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.extencionKM2 = extencionKM2;
        this.actividadEconomica = actividadEconomica;
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

    public double getExtencionKM2() {
        return extencionKM2;
    }

    public void setExtencionKM2(double extencionKM2) {
        this.extencionKM2 = extencionKM2;
    }

    public String  getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", extencionKM2=" + extencionKM2 +
                ", actividadEconomica=" + actividadEconomica +
                '}';
    }
}
