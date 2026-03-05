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

        System.out.println(datos);

        //Agrega los siguientes elementos al final de la lista:
        //"DELFIN"
        //"BALLENA"
        datos.add("DELFIN");
        datos.add("BALLENA");
        System.out.println(datos);

        //Obtén e imprimir:
        //El elemento que se encuentra en la posición 3
        //El elemento que se encuentra en la posición 10
        System.out.println(datos.get(3));
        System.out.println(datos.get(10));

        //Imprime en consola:
        //La lista contiene X elementos
        //donde X corresponde al tamaño actual de la lista.
        System.out.println("La lista contiene " + datos.size() + "elementos, donde " + datos.size() + "corresponde al tamaño actual de la lista");

        //Verifica si la lista contiene:
        //"TIGRE"
        //"HIPOPOTAMO"
        //Imprime un mensaje indicando si existe o no existe cada elemento.

        if (datos.contains("TIGRE")) {
            System.out.println("Si existe");
        } else {
            System.out.println("No existe");
        }


        if (datos.contains("HIPOPOTAMO")) {
            System.out.println("Si existe");
        } else {
            System.out.println("No existe");
        }

        //Obtén la posición de:
        //"GATO"
        //"PANTERA"
        //Imprime el índice donde aparece por primera vez cada elemento.

        System.out.println("El primer índice donde aparece GATO es " + datos.indexOf("GATO"));
        System.out.println("El primer índice donde aparece PANTERA es " + datos.indexOf("PANTERA"));

        //Obtén la posición donde aparece por última vez:
        //"PERRO"
        //Imprime el índice.
        System.out.println("El último índice donde aparece PERRO es " + datos.lastIndexOf("PANTERA"));

        //Reemplaza:
        //El elemento en la posición 5 por "COCODRILO"
        //Después imprime el elemento modificado.
        datos.set(5, "COCODRILO");
        System.out.println(datos.get(5));

        //Realiza las siguientes operaciones:
        //Elimina el elemento en la posición 7
        //Elimina el elemento "ARDILLA" usando su valor
        //Después imprime el tamaño actualizado de la lista.
        datos.remove(7);
        datos.remove("ARDILLA");
        System.out.println(datos.size());

        //Convierte la lista a un arreglo de Strings.
        //Posteriormente recorre el arreglo e imprime cada elemento.
        String[] arrayAnimales = datos.toArray(new String[0]);
        for (String animal : arrayAnimales) {
            System.out.print(animal + " ");
        }
        //Realiza un programa que:
        //Verifique si "LEON" existe en la lista.
        //Si existe, obtenga su primer índice.
        //Reemplace ese elemento por "LEON AFRICANO".
        //Imprima el tamaño final de la lista.
        if (datos.contains("LEON")) {
            int indiceLeon = datos.indexOf("LEON");
            datos.set(indiceLeon, "LEON AFRICANO");
            System.out.println("Se reemplazó en el índice: " + indiceLeon);

        }

        System.out.println(datos.size());
    }
}
