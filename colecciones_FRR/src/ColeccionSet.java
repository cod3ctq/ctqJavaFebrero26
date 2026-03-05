import java.util.HashSet;
import java.util.Set;

public class ColeccionSet {

    public static void main(String[] args) {
        //Similar a una lista pero no perm ite duplicados
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Hola");
        conjunto.add("Java17");
        conjunto.add("Java");

        System.out.println(conjunto);
    }
}
