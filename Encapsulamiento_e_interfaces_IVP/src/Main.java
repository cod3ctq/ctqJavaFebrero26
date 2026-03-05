public class Main {
	public static void main(String[] args) {
		Pokemon charmander = new Charmander("Charmandito", 100, 50, 20);
		Pokemon pokemonHibrido = new PokemonHibrido("Hybrid", 100, 60,20);
		Pokemon squirtle = new Squirtle("Big Squitle", 120, 40 , 30);


		charmander.recibirDaño(pokemonHibrido);
		squirtle.recibirDaño(charmander);


	}
}