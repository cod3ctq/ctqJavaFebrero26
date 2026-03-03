package paquete1;

public class Celular {

    public String marca;
    protected String modelo;
    private String material;

    public Celular(){}

    public Celular(String marca, String modelo, String material) {
        this.marca = marca;
        this.modelo = modelo;
        this.material = material;
        this.metodoInalcanzable(); //Este es un ejemplo de donde SI puedo acceder a este metodo privado, nivel 1
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    //Metodo privado: No es alcanzable desde afuera de la clase.
    private void metodoInalcanzable(){
        //logica
    }
}
