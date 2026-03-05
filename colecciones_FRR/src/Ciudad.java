public class Ciudad {

    private String nombre;
    private int poblacion;
    private double extensionKm2;


    public Ciudad(){}


    public Ciudad(String nombre, int poblacion, double extensionKm2) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.extensionKm2 = extensionKm2;
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

    public double getExtensionKm2() {
        return extensionKm2;
    }

    public void setExtensionKm2(double extensionKm2) {
        this.extensionKm2 = extensionKm2;
    }


    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", extensionKm2=" + extensionKm2 +
                '}';
    }
}
