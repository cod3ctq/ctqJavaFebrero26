public class Contacto {


    private String nombre;
    private String numero;
    private String correo;
    private String compania;

    public Contacto(){}


    //CONSTRUCTOR

    public Contacto(String nombre, String numero, String correo, String compania) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
        this.compania = compania;
    }


    //GETTER Y SETTER


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }


    //TO STRING

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                ", correo='" + correo + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }
}
