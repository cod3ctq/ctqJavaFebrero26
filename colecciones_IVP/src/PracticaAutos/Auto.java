package PracticaAutos;

public class Auto {
	private String modelo;
	private double precio;
	private String color;
	private String categoria;
	private String combustible;
	private String cilindrada;

	public Auto() {
	}

	@Override
	public String toString() {
		return "Auto{" +
				"modelo='" + modelo + '\'' +
				", precio=" + precio +
				", color='" + color + '\'' +
				", categoria='" + categoria + '\'' +
				", combustible='" + combustible + '\'' +
				", cilindrada='" + cilindrada + '\'' +
				'}';
	}

	public Auto(String modelo, double precio, String color, String categoria, String combustible, String cilindrada) {
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.categoria = categoria;
		this.combustible = combustible;
		this.cilindrada = cilindrada;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
}
