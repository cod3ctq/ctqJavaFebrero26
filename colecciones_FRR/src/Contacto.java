public class Contacto {
    
    private String nombre;
    private String numero;
    private String correo;
    private String company;


    public Contacto(){}

    public Contacto(String nombre, String numero, String correo, String company) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
        this.company = company;
    }

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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                ", correo='" + correo + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
