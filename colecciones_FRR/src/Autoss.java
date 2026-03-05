public class Autoss {

    private String marca;
    private String categoria;
    private String modelo;
    private double precio;
    private String color;
    private String combustible;
    private int cilindros;


    public Autoss(){}

    public Autoss(String marca, String categoria, String modelo, double precio, String color, String combustible, int cilindros) {
        this.marca = marca;
        this.categoria = categoria;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.combustible = combustible;
        this.cilindros = cilindros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }


    @Override
    public String toString() {
        return "Autoss{" +
                "marca='" + marca + '\'' +
                ", categoria='" + categoria + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", combustible='" + combustible + '\'' +
                ", cilindros=" + cilindros +
                '}';
    }
}
