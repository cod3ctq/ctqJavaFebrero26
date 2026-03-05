import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Parametrizables: Tu le puedes indicar el tipo de dato que recibira la lista
        //List vs Arraylist

        //List es la interface
        //ArrayList es una de varias implementaciones de la interface
        //ArrayList es un tipo de List
        List<String> list =new ArrayList<String>();

        System.out.println(list);
        list.add("Hola");
        list.add("Mundo");
        list.add("desde");
        list.add("Java");
        list.add("Java");
        list.add("17");
        list.add("Cuak");
        list.add("Java");
        list.add("mundo");

        System.out.println(list);

        //Calcular el tamaño de la lista
        System.out.println(list.size());

        //Obtener un valor especifico de la lista
        System.out.println(list.get(4));

        //Existe elemento en la lista ?
        System.out.println(list.contains("mundo"));

        //Botener el indice donde se encuentra un elemento de la lista
        //Si el elemento existe mas de una vez, devuelve el indeci donde lo encuentra la primera vez
        System.out.println(list.indexOf("Java"));

        //Obtener el indice donde esta por ultima vez un determinado elemento
        System.out.println(list.lastIndexOf("Java"));

        //Eliminar un elemento de la lista
        System.out.println(list.remove(2));
        System.out.println(list);

        //Eliminar un elemento de la lista, pasandole una copia del elemento a eliminar
        list.remove("mundo");
        System.out.println(list);

        //Añadir un elemento, indicandole donde quiero que lo establezca la lista
        list.add(4, "*****");
        System.out.println(list);

        //Reemplazar el elemento en una posicion dada
        list.set(3,"abc123");
        System.out.println(list);

        //Devuelve el contenido actual de la lista, guardado en un array de Object
        Object[] array = list.toArray();
        System.out.println(array[3]);
    }
}