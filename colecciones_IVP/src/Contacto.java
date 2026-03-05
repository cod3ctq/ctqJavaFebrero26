public class Contacto {
		private  String nombre;
		private String numero;
		private String correo;
		private String compañia;

	public Contacto() {
	}

	public Contacto(String nombre, String numero, String correo, String compañia) {
		this.nombre = nombre;
		this.numero = numero;
		this.correo = correo;
		this.compañia = compañia;
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

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Contacto{" +
				"nombre='" + nombre + '\'' +
				", numero='" + numero + '\'' +
				", correo='" + correo + '\'' +
				", compañia='" + compañia + '\'' +
				'}';
	}
}
