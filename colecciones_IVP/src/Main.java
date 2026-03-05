import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		lista.add("Hola");
		lista.add("Mundo");
		lista.add("Desde");
		lista.add("Java");
		lista.add("17");

		System.out.println(lista.size());

		System.out.println(lista.get(2));

		System.out.println(lista.contains("Java"));

		System.out.println(lista.indexOf("17"));

		System.out.println(lista.lastIndexOf("Desde"));

		System.out.println(lista.remove(2));

		System.out.println(lista.get(2));

		lista.add(2,"escrito");

		Object [] array = lista.toArray();

		lista.set(2,"programado");

		System.out.println(lista);

		System.out.println(array[0]);
	}
}