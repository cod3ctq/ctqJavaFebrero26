/*
Dadp una catalogo de diferentes marcas,
se debe organizar la informacion de cada auto
(Marca, modelo, precio, color categoria, combustible, cilindrada)
tomando en cuenta la categoria y la marca.
Marca,Categoria,Modelo,Precio,Color,Combustible,Cilindros
Toyota,Sedan,Corolla,420000,Blanco,Gasolina,4
Toyota,SUV,RAV4,560000,Gris,Gasolina,4
Toyota,Pickup,Hilux,610000,Negro,Diesel,4
Nissan,Sedan,Versa,340000,Plata,Gasolina,4
Nissan,SUV,X-Trail,590000,Azul,Gasolina,4
Nissan,Pickup,Frontier,640000,Blanco,Diesel,4
Chevrolet,Sedan,Cavalier,380000,Rojo,Gasolina,4
Chevrolet,SUV,Captiva,470000,Gris,Gasolina,4
Chevrolet,Pickup,Silverado,890000,Negro,Gasolina,8
Honda,Sedan,Civic,520000,Azul,Gasolina,4
Honda,SUV,CR-V,610000,Blanco,Gasolina,4
Honda,Hatchback,Fit,350000,Rojo,Gasolina,4
Mazda,Sedan,Mazda3,410000,Gris,Gasolina,4
Mazda,SUV,CX-5,580000,Blanco,Gasolina,4
Mazda,SUV,CX-30,510000,Negro,Gasolina,4
Ford,Pickup,Ranger,720000,Azul,Diesel,4
Ford,SUV,Escape,620000,Plata,Hibrido,4
Ford,Deportivo,Mustang,1150000,Rojo,Gasolina,8
Volkswagen,Sedan,Jetta,460000,Blanco,Gasolina,4
Volkswagen,SUV,Tiguan,670000,Gris,Gasolina,4
Volkswagen,Hatchback,Golf GTI,780000,Rojo,Gasolina,4

 */
public class Auto {

    private String marca;
    private String categoria;
    private String modelo;
    private double precio;
    private String color;
    private String combustible;
    private int cilindros;

    public Auto(String marca, String categoria, String modelo,
                double precio, String color,
                String combustible, int cilindros) {

        this.marca = marca;
        this.categoria = categoria;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.combustible = combustible;
        this.cilindros = cilindros;
    }

    public String getMarca() { return marca; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return "Modelo: " + modelo +
                ", Precio: $" + precio +
                ", Color: " + color +
                ", Combustible: " + combustible +
                ", Cilindros: " + cilindros;
    }
}