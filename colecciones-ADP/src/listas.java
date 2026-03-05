import java.util.ArrayList;
import java.util.List;

public class listas {
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
        //Después imprime la lista completa.

        datos.add(25,"DELFIN");
        datos.add(26,"BALLENA");
        System.out.println(datos);
        //Obtén e imprime:
        //El elemento que se encuentra en la posición 3
        //El elemento que se encuentra en la posición 10
        System.out.println(datos.get(3));
        System.out.println(datos.get(10));

        //Imprime en consola:
        //La lista contiene X elementos
        //donde X corresponde al tamaño actual de la lista
        System.out.println("la lista contiene " + datos.size() + " elementos donde " + datos.size() + " el tamaño actual de la lista");
        //Verifica si la lista contiene:
        //"TIGRE"
        //"HIPOPOTAMO"
        //Imprime un mensaje indicando si existe o no existe cada elemento.
        System.out.println(datos.contains("TIGRE" )  + " existe");
        System.out.println(datos.contains("HIPOPOTAMO" )  + " no existe");

        //Obtén la posición de:
        //"GATO"
        //"PANTERA"
        //Imprime el índice donde aparece por primera vez cada elemento.
        System.out.println(datos.indexOf("GATO"));
        System.out.println(datos.indexOf("PANTERA"));

        //Obtén la posición donde aparece por última vez:
        //"PERRO"
        //Imprime el índice.
        System.out.println(datos.lastIndexOf("PERRO"));

        //Reemplaza:
        //El elemento en la posición 5 por "COCODRILO"
        //Después imprime el elemento modificado.
        datos.set(5,"COCODRILO"); //REMPLAZA
        System.out.println(datos);

        //Realiza las siguientes operaciones:
        //Elimina el elemento en la posición 7
        //Elimina el elemento "ARDILLA" usando su valor
        //Después imprime el tamaño actualizado de la lista.
        System.out.println(datos.remove(7));
        System.out.println(datos.remove("ARDILLA"));
        System.out.println(datos);

        //Convierte la lista a un arreglo de Strings.
        //Posteriormente recorre el arreglo e imprime cada elemento.
        String[] arreglo = datos.toArray(new String[0]);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);

        }

        //Realiza un programa que:
        //Verifique si "LEON" existe en la lista.
        //Si existe, obtenga su primer índice.
        //Reemplace ese elemento por "LEON AFRICANO".
        //Imprima el tamaño final de la lista.
        System.out.println(datos.contains("LEON"));
        System.out.println(datos.indexOf("LEON"));
        datos.set(4,"LEON AFRICANO"); //REMPLAZA
        System.out.println(datos);
        System.out.println(datos.size());



















    }
}
