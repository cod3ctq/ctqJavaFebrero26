public class Charmander extends Pokemon implements TipoFuego {


	public Charmander(String nombre, int vida, int ataque, int defensa) {
		super(nombre, vida, ataque, defensa);
	}

	@Override
	public void atacar() {
		lanzallamas();
	}

	@Override
	public void lanzallamas() {
		System.out.println(nombre + " usa Lanzallamas 🔥");
	}
}
