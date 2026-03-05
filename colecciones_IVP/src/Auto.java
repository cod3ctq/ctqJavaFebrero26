public class Auto {
	private String marca;
	private  String modelo;
	private double precio;
	private String cilindrada;
	private int peso;
	private String combustible;
	private String categoría;

	public Auto() {
	}

	public Auto(String marca, String modelo, double precio, String cilindrada, int peso, String combustible, String categoría) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.cilindrada = cilindrada;
		this.peso = peso;
		this.combustible = combustible;
		this.categoría = categoría;
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

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
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

	public String getCategoría() {
		return categoría;
	}

	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}

	@Override
	public String toString() {
		return "Auto{" +
				"marca='" + marca + '\'' +
				", modelo='" + modelo + '\'' +
				", precio=" + precio +
				", cilindrada='" + cilindrada + '\'' +
				", peso=" + peso +
				", combustible='" + combustible + '\'' +
				", categoría='" + categoría + '\'' +
				'}';
	}
}
