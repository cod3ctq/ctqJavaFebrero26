public class PokemonHibrido extends Pokemon implements  TipoFuego,TipoElectrico{

	public PokemonHibrido(String nombre, int vida, int ataque, int defensa) {
		super(nombre, vida, ataque, defensa);
	}

	@Override
	public void atacar() {
		impactrueno();
		lanzallamas();
	}

	@Override
	public void impactrueno() {
		System.out.println(nombre + " usa impactrueno");
	}

	@Override
	public void lanzallamas() {
		System.out.println(nombre + " usa lanzallamas");
	}
}
