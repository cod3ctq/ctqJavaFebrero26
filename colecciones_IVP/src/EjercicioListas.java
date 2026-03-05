import java.util.ArrayList;
import java.util.List;

public class EjercicioListas {
	public static void main(String[] args) {

		List<String> datos = new ArrayList<>();

		datos.add("PERRO");
		datos.add("GATO");
		datos.add("LORO");
		datos.add("TIGRE");
		datos.add("LEON");
		datos.add("PERRO");
		datos.add("ELEFANTE");
		datos.add("JIRAFA");
		datos.add("GATO");
		datos.add("MONO");
		datos.add("ZORRO");
		datos.add("OSO");
		datos.add("PERRO");
		datos.add("RATON");
		datos.add("CABALLO");
		datos.add("LEON");
		datos.add("PERRO");
		datos.add("PANTERA");
		datos.add("TIGRE");
		datos.add("LOBO");
		datos.add("GATO");
		datos.add("ZORRO");
		datos.add("PERRO");
		datos.add("ARDILLA");
		datos.add("OSO");

//		Agrega los siguientes elementos al final de la lista:
//		"DELFIN"
//		"BALLENA"
//		Después imprime la lista completa.



		datos.add("DELFIN");
		datos.add("BALLENA");
		System.out.println(datos);





//				Obtén e imprime:
//		El elemento que se encuentra en la posición 3
//		El elemento que se encuentra en la posición 10

		System.out.println("posición 3: ");
		System.out.println(datos.get(3));

		System.out.println("posición 10: ");
		System.out.println(datos.get(10));

//		Imprime en consola:
//		La lista contiene X elementos
//		donde X corresponde al tamaño actual de la lista.

		System.out.println("la lista tiene " + datos.size() + " Elementos");

//				Verifica si la lista contiene:
//		"TIGRE"
//		"HIPOPOTAMO"
//		Imprime un mensaje indicando si existe o no existe cada elemento.

		if (datos.contains("TIGRE"))
			System.out.println("TIGRE existe en la lista ");
		else
			System.out.println("TIGRE no existe en la lista");

		if (datos.contains("HIPOPOTAMO"))
			System.out.println("HIPOPOTAMO existe en la lista ");
		else
			System.out.println("HIPOPOTAMO no existe en la lista");


//				Obtén la posición de:
//		"GATO"
//		"PANTERA"
//		Imprime el índice donde aparece por primera vez cada elemento.

		System.out.println("GATO aparece en la posición " + datos.indexOf("GATO"));
		System.out.println("PANTERA aparece en la posición " + datos.indexOf("PANTERA"));



//		Obtén la posición donde aparece por última vez:
//		"PERRO"
//		Imprime el índice.

		System.out.println("PERRO aparece por última vez en la posición " + datos.lastIndexOf("PERRO"));


//				Reemplaza:
//		El elemento en la posición 5 por "COCODRILO"
//		Después imprime el elemento modificado.

		datos.set(5,"COCODRILO");
		System.out.println(datos);



//				Realiza las siguientes operaciones:
//		Elimina el elemento en la posición 7
//		Elimina el elemento "ARDILLA" usando su valor
//		Después imprime el tamaño actualizado de la lista.


		datos.remove(7);
		datos.remove("ARDILLA");
		System.out.println("Tamaño actual de la lista: " + datos.size());

//		Convierte la lista a un arreglo de Strings.
//		Posteriormente recorre el arreglo e imprime cada elemento.

		Object [] array = datos.toArray();
			for (Object i : array)
				System.out.println(i);


//		Realiza un programa que:
//		Verifique si "LEON" existe en la lista.
//		Si existe, obtenga su primer índice.
//				Reemplace ese elemento por "LEON AFRICANO".
//				Imprima el tamaño final de la lista.


		if (datos.contains("LEON")){
			int indice = datos.indexOf("LEON");
			datos.set(indice, "LEON AFRICANO");
		}

		System.out.println("Tamaño final de la lista: " + datos.size());



	}
}
