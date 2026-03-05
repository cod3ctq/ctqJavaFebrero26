public class Ciudad {
    private String nombre;
    private int poblacion;
    private double extensionkm;
    private String actEco;

    //CONSTRUCTOR
    public Ciudad(){}

    public Ciudad(String nombre, int poblacion, double extensionkm, String actEco) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.extensionkm = extensionkm;
        this.actEco = actEco;
    }

    //GETTER Y SETTER

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

    public double getExtensionkm() {
        return extensionkm;
    }

    public void setExtensionkm(double extensionkm) {
        this.extensionkm = extensionkm;
    }

    public String getActEco() {
        return actEco;
    }

    public void setActEco(String actEco) {
        this.actEco = actEco;
    }

    //TO STRING

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", extensionkm=" + extensionkm +
                ", actEco='" + actEco + '\'' +
                '}';
    }
}
