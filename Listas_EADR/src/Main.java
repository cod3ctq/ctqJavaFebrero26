import java.util.ArrayList;
import java.util.List;

public class Main {
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

        // Agregar elementos al final
        datos.add("DELFIN");
        datos.add("BALLENA");

        // Imprimir lista completa
        System.out.println("Lista completa:");
        System.out.println(datos);

        // Obtener elementos por posición
        System.out.println("Elemento en posición 3: " + datos.get(3));
        System.out.println("Elemento en posición 10: " + datos.get(10));

        // Tamaño de la lista
        System.out.println("La lista contiene " + datos.size() + " elementos");

        // Verificar si contiene elementos
        System.out.println("¿Existe TIGRE? " +
                (datos.contains("TIGRE") ? "SI EXISTE" : "NO EXISTE"));

        System.out.println("¿Existe HIPOPOTAMO? " +
                (datos.contains("HIPOPOTAMO") ? "SI EXISTE" : "NO EXISTE"));

        // Obtener posición (primer aparición)
        System.out.println("Primera posición de GATO: " + datos.indexOf("GATO"));
        System.out.println("Primera posición de PANTERA: " + datos.indexOf("PANTERA"));

        // Última posición de PERRO
        System.out.println("Última posición de PERRO: " + datos.lastIndexOf("PERRO"));

        // Reemplazar elemento en posición 5
        datos.set(5, "COCODRILO");
        System.out.println("Elemento modificado en posición 5: " + datos.get(5));

        // Eliminar elemento en posición 7
        datos.remove(7);

        // Eliminar por valor
        datos.remove("ARDILLA");

        System.out.println("Tamaño después de eliminar: " + datos.size());

        // Convertir a arreglo
        String[] arreglo = datos.toArray(new String[0]);

        System.out.println("Elementos del arreglo:");
        for (String animal : arreglo) {
            System.out.println(animal);
        }

        // Programa final solicitado
        if (datos.contains("LEON")) {
            int indice = datos.indexOf("LEON");
            datos.set(indice, "LEON AFRICANO");
        }

        System.out.println("Tamaño final de la lista: " + datos.size());
    }
}