import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Parametizables: tu le puedes indicar el tipo d edato que recibirá la lista
    //Lista vs Aarray list
    //List interface +
        //Array list una de varias implementación de la interface
        //Array list ess un tipo especifico de lista.
List<String> lista =  new ArrayList<String>();


        //Aññade valores a lista
        lista.add("hola");
        lista.add("fsd");
        lista.add("hoa");
        lista.add("hsdfsla");
        lista.add("hoa");
        lista.add("hpueblk");

        System.out.println(lista);

        //calcular el tamaño de la lista
        System.out.println(lista.size());

        //obtener valores especificos de la lista
        System.out.println(lista.get(3));

        //existe el elemento en la lista?
        System.out.println(lista.contains("Java"));

        //obtener el indice donde se encuentra un elemento de la lista
        //Si el elemento existe mas de una vez devuelve el inidce doonde lo encuentra l
        //la primera vez
        System.out.println(lista.indexOf("hoa"));

        //Obtener el indice donde esta por ultima vez un determindado elemneto
        System.out.println(lista.lastIndexOf("hoa"));

        //Eliminar un elemento de la lista, inidicando con el indice
        System.out.println(lista.remove(3));
        System.out.println(lista);

        //Eliminar un elemento de la lista, pasandole una copia del elemento a eliminar
            lista.remove("hoa");
            System.out.println(lista);

            //Añadir un elemento, indicandoledonde quiero que lo establezca la lista
            lista.add(4,"*****");
            System.out.println(lista);

            //Reemplazar el elemnto en una posicion dada.
            lista.set(3,"abc");//reemplaza
            System.out.println(lista);

            //Deveuleve el conetnido actual de la lista, guardado en un array de object
            Object [] array = lista.toArray();
            System.out.println(array[3]);

    }
}








