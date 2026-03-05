import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //parametrizables: tu le puedes indicar el tipo de dato que recibira la lista
        //LIst vs Arraylist
        //List: es una interface
        // Arraylist es una de varias) implementacion de la interface.
        //Arraylis; es un tipo especifico de lista

        List<String> Lista = new ArrayList<String>();
        System.out.println(Lista);

        Lista.add("hola");
        Lista.add("mundo");
        Lista.add("hdesde");
        Lista.add("Java");
        Lista.add("17");
        Lista.add("texto");
        Lista.add("Java");
        Lista.add("Mundo");

        System.out.println(Lista);
        //simular el tamaño de la lista
        System.out.println(Lista.size());
        //Obtener un valores especifico de la lista
        System.out.println(Lista.get(4));
        // Existe el elemento en la lista?
        System.out.println(Lista.contains("Java"));
        //Obtener el indice donde se encuentra un elemento de la lista
        // si el elemento existe mas de una vez devuelve el indice donde lo encuentra la primeea vez
        System.out.println(Lista.indexOf("17"));
        //Obtener el indice donde esta por ultima vez un determinado elemento
        System.out.println(Lista.lastIndexOf("Java"));
        // Eliminar un elemento de la lista indicandolo con el indice
        System.out.println(Lista.remove(3));
        System.out.println(Lista);

        //Eliminar un elemento de la lista  pasandole una copia del elemento a elminar
        Lista.remove("mundo");
        System.out.println(Lista);

        //Añadir un elemeno indicando donde quiero que lo establezca la lista
        Lista.add(4,"*******");
        System.out.println(Lista);

        //Remplaza el elemento en una posicion dada
        Lista.set(3,"abc123"); //REMPLAZA
        System.out.println(Lista);
        //Devuelve el contenido actual de la lista , guardado en array de objet
        //0                //0
        Object[] array= Lista.toArray();
        System.out.println(array[3]);//<----






















    }
}