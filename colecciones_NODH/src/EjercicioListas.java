import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* Agrega los siguientes elementos al final de la lista:
"DELFIN"
"BALLENA"
Después imprime la lista completa.


Obtén e imprime:
El elemento que se encuentra en la posición 3
El elemento que se encuentra en la posición 10


Imprime en consola:
La lista contiene X elementos
donde X corresponde al tamaño actual de la lista.


Verifica si la lista contiene:
"TIGRE"
"HIPOPOTAMO"
Imprime un mensaje indicando si existe o no existe cada elemento.


Obtén la posición de:
"GATO"
"PANTERA"
Imprime el índice donde aparece por primera vez cada elemento.




Obtén la posición donde aparece por última vez:
"PERRO"
Imprime el índice.



Reemplaza:
El elemento en la posición 5 por "COCODRILO"
Después imprime el elemento modificado.


Realiza las siguientes operaciones:
Elimina el elemento en la posición 7
Elimina el elemento "ARDILLA" usando su valor
Después imprime el tamaño actualizado de la lista.



Convierte la lista a un arreglo de Strings.
Posteriormente recorre el arreglo e imprime cada elemento.



Realiza un programa que:
Verifique si "LEON" existe en la lista.
Si existe, obtenga su primer índice.
Reemplace ese elemento por "LEON AFRICANO".
Imprima el tamaño final de la lista. */

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

        System.out.println(datos);

        datos.add("DELFIN");
        datos.add("BALLENA");
        System.out.println(datos);

        System.out.println(datos.get(3));
        System.out.println(datos.get(10));

        System.out.println("La lista contiene " + datos.size() + " elementos donde " + datos.size() + " corresponde al tamaño actual de la lista");

        System.out.println((datos.contains("TIGRE")) ? "Si contiene el elemento TIGRE" : "No contiene el elemento TIGRE");
        System.out.println((datos.contains("HIPOPOTAMO") ? "Si contiene el elemento HIPOPOTAMO" : "No contiene el elemento HIPOPOTAMO"));

        System.out.println(datos.indexOf("GATO"));
        System.out.println(datos.indexOf("PANTERA"));

        System.out.println(datos.lastIndexOf("PERRO"));

        System.out.println(datos.set(5, "COCODRILO"));
        System.out.println(datos);

        datos.remove(7);
        datos.remove("ARDILLA");
        System.out.println(datos);

        Object[] animales = datos.toArray();
        for (Object animal : animales) {
            System.out.println(animal);
        }

        if (datos.indexOf("LEON") != -1) {
            datos.set(datos.indexOf("LEON"), "LEON AFRICANO");
        }

        System.out.println(datos);
    }
}
