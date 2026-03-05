public abstract class Pokemon {

	String nombre;
	int vida;
	int ataque;
	int defensa;

	public Pokemon(String nombre, int vida, int ataque, int defensa) {
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
	}

	public int recibirDaño (Pokemon atacante){
		atacante.atacar();

		int daño=0;
		if (defensa<ataque)
			daño = atacante.ataque - defensa;
		vida = vida - daño;
		System.out.println(nombre + " recibió " + daño + "puntos de daño");
		return daño;
	}

	public abstract void atacar();


}
