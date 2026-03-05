import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //LAS LISTAS SON PARAMETRIZABLES -> LE PUEDES INDICAR EL TIPO DE DATO QUE RECIBIRA LA LISTA
        //LIST VS ARRAYLIST
        //LIST ES UNAINTERFACE
        //ARRAYLIST ES UNA (DE VARIAS) IMPLEMENTACION DE LA INTERFACE
        //ARRAY LIST ES IN TIPO ESPECIFICO DE LISTA
        List<String> lista = new ArrayList<>();

        //ADICION DE VALORES A LA LISTA
        lista.add("hola");
        lista.add("mundo");
        lista.add("desde");
        lista.add("java");
        lista.add("17");
        lista.add("texto");
        lista.add("java");
        lista.add("mund0");

        System.out.println(lista);

        //CALCULANDO EL TAMAñO DE LA LISTA

        System.out.println("El tama;o de la lista es: "+lista.size());

        //OBTENER UN VALOR ESPECIFICO DE LA LISTA

        System.out.println("Obteniendo el valor de un indice"+lista.get(4));

        //EXISTE EL ELEMENTO EN LA LISTA

        System.out.println("Buscando el elemento "+lista.contains("java"));

        //OBTENER EL INDICE DONDE SE ENCUENTRA UN ELEMENTO DE LA LISTA
        System.out.println("Buencando el indice del elemento 17 "+lista.indexOf("17"));


        //OBTENER EL INDICE DONDE ESTA POR ULTIMA VEZ UN ELEMENTO
        System.out.println("El ultimo indice de Java es: "+lista.lastIndexOf("java"));

        //List<String> set = new HashSet<String>();

        //ELIMINA UN ELEMENTO DE LA LISTA , PASANDOLE UNA COPIA DEL ELEMENTO A ELIMINAR
        System.out.println("Eliminando :"+lista.remove("mundo"));

        //AÑADIR UN ELEMENTO , INDICANDOLE EL INDICE
        System.out.println("Añadiendo un elemento aun indice fijo " );
        lista.add(4,"Asterisco");

        //METODO SET REEMEPLAZA O SOBREEXCRIBE EN EL INDICE DADO
        System.out.println("Reemplazando el elemento del indice 3"+lista.set(3,"abcde"));

        //DEVUELVE EL CONTENIDO ACTUAL DE LA LISTA EN UN ARRAY DE OBJECT
        Object[] array = lista.toArray();

        System.out.println(Arrays.toString(array));

    }
}
