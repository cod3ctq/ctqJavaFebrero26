public class Auto {
    private String marca;
    private String modelo;
    private double precio;
    private String ciuindrada;
    private int peso;
    private String combustible;
    private String categoria;

    public Auto(){};

    public Auto(String marca, String modelo, double precio, String ciuindrada, int peso, String combustible, String categoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.ciuindrada = ciuindrada;
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

    public String getCiuindrada() {
        return ciuindrada;
    }

    public void setCiuindrada(String ciuindrada) {
        this.ciuindrada = ciuindrada;
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
                ", ciuindrada='" + ciuindrada + '\'' +
                ", peso=" + peso +
                ", combustible='" + combustible + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
