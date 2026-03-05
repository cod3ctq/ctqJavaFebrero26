import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        * Las listas son dinamicas, es decir su tamaño puede cambiar
        *
        *
        * List es una interface y ArrayList es una implementacion de la interface
        * */



        List<String> lista = new ArrayList<String>();

        //Añadir elementos
        lista.add("paco");
        lista.add("paco");
        lista.add("paco");
        lista.add("juan");
        lista.add("emilia");
        lista.add("Rodrigo");
        lista.add("Pati");


        /*Añadir elemento en un indice especifico sin reemplazar el valor
        que se pudiera econtrar ahi,mas bien recorre todas las posiciones*/
        lista.add(4,"******************");


        //Remplaza un valor en un indice especifico de la lista
        lista.set(5,"Tio betito");

        //Obtener un valor de la lista
        System.out.println(lista.get(0));


        //Obtener tamaño de la lista
        System.out.println(lista.size());


        //Preguntar si existe un elemento en la lista
        System.out.println(lista.contains("juan"));


        //Retorna el indice del primer elemento econtrado con un valor especifico
        System.out.println(lista.indexOf("paco")); // Retorna el indice del primer elemento en la lista con ese valor


        //Retorna el indice del ultimo elemento econtrado con un valor especifico
        System.out.println(lista.lastIndexOf("paco"));


        System.out.println(lista);

        //Eliminar elemento de la lista mediante indice
        lista.remove(0);


        //Eliminar elemento de la lista mediante un valor
        lista.remove("paco");


        //Retorna el contenido de la lista a una Array
        Object[] array = lista.toArray();
        System.out.println("----"+array[0]);


        //Imprimir lista completa
        System.out.println(lista);




    }
}