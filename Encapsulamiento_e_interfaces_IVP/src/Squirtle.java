public class Squirtle extends Pokemon implements TipoAgua{
	public Squirtle(String nombre, int vida, int ataque, int defensa) {
		super(nombre, vida, ataque, defensa);
	}

	@Override
	public void atacar() {
		hidrobomba();
	}

	@Override
	public void hidrobomba() {
		System.out.println(nombre + " usa hidrobomba ");
	}
}
