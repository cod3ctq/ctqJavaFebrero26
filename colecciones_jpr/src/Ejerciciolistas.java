import java.util.ArrayList;
import java.util.List;

public class Ejerciciolistas {
    public static void main(String[] args) {

        List<String> datos = new ArrayList<String>();

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

        datos.add(25, "DELFIN");
        datos.add(26, "BALLENA");
        System.out.println(datos);

        System.out.println("obten e imprime 3 " + datos.get(3));
        System.out.println("obten e imprime 10 " + datos.get(10));

        System.out.println("la lista contiene " + datos.size() + " elementos");

        System.out.println("lA LISTA CONTIENEN TIGRE?:" + datos.contains("TIGRE"));
        System.out.println("lA LISTA CONTIENEN HIPOPOTAMO?:" + datos.contains("HIPOPOTAMO"));

        System.out.println("posicion de GATO : " + datos.indexOf("GATO"));
        System.out.println("posicion de PANTERA : " + datos.indexOf("PANTERA"));

        System.out.println("PERRO por ultima vez: " + datos.lastIndexOf("PERRO"));

        datos.set(5, "COCODRILO");//reemplaza
        System.out.println(datos);

        datos.remove(7);
        datos.remove("ARDILLA");
        System.out.println(datos);

        String[] arreglo = new String[datos.size()];
        for (int i = 0; i < datos.size(); i++) {
            arreglo[i] = datos.get(i);
            System.out.println("++++++" + arreglo[i]);
        }

        System.out.println("verifique si LEON esta en la lista: " + datos.contains("LEON"));
        System.out.println("indice: " + datos.indexOf("LEON"));

        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).equals("LEON")) {
                datos.set(i, "LEON AFRICANO");
            }
        }
        System.out.println(datos);
        System.out.println(datos.size());

        }

}
