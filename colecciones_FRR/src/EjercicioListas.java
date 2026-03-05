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


        /*
        * Agrega los siguientes elementos al final de la lista:
        "DELFIN"
        "BALLENA"
        Después imprime la lista completa.
        * */
        System.out.println("-------------------------------------------");
        datos.set(datos.size()-1,"BALLENA");
        datos.set(datos.size()-2,"DELFIN");

        System.out.println(datos);


        /*
        *
        *Obtén e imprime:
         El elemento que se encuentra en la posición 3
         El elemento que se encuentra en la posición 10
        * */

        System.out.println("-------------------------------------------");
        System.out.println(datos.get(3));
        System.out.println(datos.get(10));



        /*
        *Imprime en consola:
         La lista contiene X elementos
         donde X corresponde al tamaño actual de la lista.
        * */
        System.out.println("-------------------------------------------");
        System.out.println("La lista contiene "+datos.size()+" donde "+datos.size()+" corresponde al tamaño actual de la lista");


        /*
        *Verifica si la lista contiene:
         "TIGRE"
         "HIPOPOTAMO"
         Imprime un mensaje indicando si existe o no existe cada elemento.
        * */
        System.out.println("-------------------------------------------");
        System.out.println("TIGRE existe? "+datos.contains("TIGRE"));
        System.out.println("HIPOPOTAMO existe? "+datos.contains("HIPOPOTAMO"));



        /*
        *Obtén la posición de:
         "GATO"
         "PANTERA"
         Imprime el índice donde aparece por primera vez cada elemento.
        * */
        System.out.println("-------------------------------------------");
        System.out.println(datos.indexOf("GATO"));
        System.out.println(datos.indexOf("PANTERA"));


        /*
        *Obtén la posición donde aparece por última vez:
         "PERRO"
         Imprime el índice.

        * */

        System.out.println("-------------------------------------------");
        System.out.println(datos.lastIndexOf("PERRO"));



        /*
        *Reemplaza:
         El elemento en la posición 5 por "COCODRILO"
         Después imprime el elemento modificado.
        * */
        System.out.println("-------------------------------------------");
        datos.set(5,"COCODRILO");
        System.out.println(datos);

        /*
        *Realiza las siguientes operaciones:
        Elimina el elemento en la posición 7
        Elimina el elemento "ARDILLA" usando su valor
        Después imprime el tamaño actualizado de la lista.
        * */
        System.out.println("-------------------------------------------");
        datos.remove(7);
        datos.remove("ARDILLA");
        System.out.println(datos.size());

        /*
        *Convierte la lista a un arreglo de Strings.
        Posteriormente recorre el arreglo e imprime cada elemento.
        * */
        System.out.println("-------------------------------------------");
        //El metodo toArray necesita como parametro un array del tipo que se desea que retorne
        /*En este caso se pasa un new String[0] para que automaticamente se cree un arreglo a la medida de la lista
         de lo contrario tambien se pudiera hacer asi:
         String[] arreglo = lista.toArray(new String[lista.size()]);*/

        String[] arrayAnimales = datos.toArray(new String[0]);

        for (int i=0; i<arrayAnimales.length;i++){
            System.out.println(arrayAnimales[i]);
        }

        /*
        *Realiza un programa que:
        Verifique si "LEON" existe en la lista.
        Si existe, obtenga su primer índice.
        Reemplace ese elemento por "LEON AFRICANO".
        Imprima el tamaño final de la lista.
        * */
        System.out.println("-------------------------------------------");
        int posLeon = datos.indexOf("LEON");
        if (posLeon>=0){
            datos.set(posLeon,"LEON AFRICANO");
        }
        System.out.println(datos.size()+" "+datos);





    }
}
