public class Ciudad {
	private String nombre;
	private long poblacion;
	private double extension;
	private String actividadEconomica;

	public Ciudad() {
	}

	public Ciudad(String nombre, long poblacion, double extension, String actividadEconomica) {
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.extension = extension;
		this.actividadEconomica = actividadEconomica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(long poblacion) {
		this.poblacion = poblacion;
	}

	public double getExtension() {
		return extension;
	}

	public void setExtension(double extension) {
		this.extension = extension;
	}

	public String getActividadEconomica() {
		return actividadEconomica;
	}

	public void setActividadEconomica(String actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}

	@Override
	public String toString() {
		return "Ciudad{" +
				"nombre='" + nombre + '\'' +
				", poblacion=" + poblacion +
				", extension=" + extension +
				", actividadEconomica='" + actividadEconomica + '\'' +
				'}';
	}
}
