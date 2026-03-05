import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Parametizables: tu le puedes indicar el tipo de dato que recibirá la lista.
        //Lista vs. Arraylist: List es una interface, y el arrayList es la implementación
        //List es una interface
        //ArrayList es una de (de varias) implementacion de la interface.
        //Arraylist es un tipo específico de Lista
        List<String> lista = new ArrayList<>();
        System.out.println(lista);

        //Añade valores a la lista
        lista.add("hola");
        lista.add("mundo");
        lista.add("desde");
        lista.add("Java");
        lista.add("17");
        lista.add("texto");
        lista.add("Java");
        lista.add("mund0");

        System.out.println(lista);

        //Calcular el tamaño de la lista
        System.out.println(lista.size());

        //Obtener un valor específico de la lista
        System.out.println(lista.get(4));

        //Existe el elemento de la lista?
        System.out.println(lista.contains("Java"));

        //Obtener el indice donde se encuentra un elemento de la lista
        //Si el elemento existe más de una vez, devuelve el índice donde lo encuentra la primera vez
        System.out.println(lista.indexOf("17"));

        //Obtener el indice donde esta por ultima vez un determinado elemento
        System.out.println(lista.lastIndexOf("Java"));

        //Eliminar un elemento de la lista
        System.out.println(lista.remove(2));
        System.out.println(lista);

        //Eliminar un elemento de la lista, pasándole una copia del elemento a eliminar
        lista.remove("mundo");
        System.out.println(lista);

        //Añadir un elemento, indicándole donde quiero que lo establezca la lista
        lista.add(4, "****");
        System.out.println(lista);

        //Reemplazar el elemento en una posición dada
        lista.set(3,"abc123"); //REEMPLAZA
        System.out.println(lista);

        //Devuelve el contenido actual de la lista guardado en un array de Object.
        //O[ ]               O[ ]
        Object[] array = lista.toArray();
        System.out.println(array[3]);

    }
}