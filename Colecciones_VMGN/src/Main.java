import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //parametrizables: tu le puedes indicar el tipo de dato que recibira la lista
        // list vs arrayList  ?
        // List es una interface
        // Array list es una ( de varias) implemenetacion de la interface
        // Array list es un tipo especifico de lista
        List<String> lista= new ArrayList<>();


        lista.add("hola");
        lista.add("mundo");
        lista.add("desde");
        lista.add("java");
        lista.add("17");
        lista.add("texto");
        lista.add("Java");
        lista.add("mundo");

        System.out.println(lista);


        //Calcular el tamaño de la lista
        System.out.println(lista.size());

        //Obtener un valor especifico de la lista
        System.out.println(lista.get(4));

        //Existe el elemento en la lista?
        System.out.println(lista.contains("java"));

        //Obtener el indice donde se encuentra un elemento de la lista
        // Si el elemnto existe mas de una vez devuelve el indice donde lo encuentra por primera vez
        System.out.println(lista.indexOf("17"));

        //obteteber el indice donde esta por ultima vez el elemento
        System.out.println(lista.lastIndexOf("java"));

        //eliminar un elemento de la lista, indicandolo con el indice
        System.out.println(lista.remove(2));
        System.out.println(lista);

        //Eliminar un elemento de la lista, pasandole una copia del elemnto a eliminar
        lista.remove("mundo");
        System.out.println(lista);

        //Añadir un elemento, indicandole donde quiero que lo establezca la lista
        lista.add(4,"xxx");//añade
        System.out.println(lista);

        //Remplazar el elemnto en una posicion exacta
        lista.set(3,"abc123");// remplaza
        System.out.println(lista);

        //Devuelve el contenido actual de la lista guarado en un array de object
        Object[] array=lista.toArray();
        System.out.println(array[3]);

    }
}