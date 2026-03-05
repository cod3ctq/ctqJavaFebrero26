public class Ciudades {

    String nombre;
    String poblacion;
    String extkm;
    String acEcon;



    public Ciudades(){}


    public Ciudades(String nombre, String poblacion, String extkm, String acEcon) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.extkm = extkm;
        this.acEcon = acEcon;
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

    public String getExtkm() {
        return extkm;
    }

    public void setExtkm(String extkm) {
        this.extkm = extkm;
    }

    public String getAcEcon() {
        return acEcon;
    }

    public void setAcEcon(String acEcon) {
        this.acEcon = acEcon;
    }

    @Override
    public String toString() {
        return "Ciudades{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", extkm='" + extkm + '\'' +
                ", acEcon='" + acEcon + '\'' +
                '}';
    }
}
