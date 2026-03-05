public class Auto {
    private String marca;
    private String modelo;
    private double precio;
    private String cilindrado;
    private  int peso;
    private String combustible;
    private String categoria;

    public Auto(String marca, String modelo, double precio, String cilindrado, int peso, String combustible, String categoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cilindrado = cilindrado;
        this.peso = peso;
        this.combustible = combustible;
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCilindrado() {
        return cilindrado;
    }

    public void setCilindrado(String cilindrado) {
        this.cilindrado = cilindrado;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", cilindrado='" + cilindrado + '\'' +
                ", peso=" + peso +
                ", combustible='" + combustible + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
