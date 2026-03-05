import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PracticaMapas {
    public static void main(String[] args) {


        //Crear un mapa: <String,String>

        Map<String, Contacto> agenda = new HashMap<String, Contacto>();

        //Agrega un contacto: primero instancio al objeto y despues lo agrego
        Contacto c1 = new Contacto("Carlos", "99999", "carlos@aol.com", "CFE");
        Contacto c2 = new Contacto("Samantha", "77777", "sam@aol.co", "CFE");
        agenda.put(c1.getNumero(), c1);
        agenda.put(c2.getNumero(), c2);

        //Agrega un contacto: instacia al objeto al mismo tiempo de agregralo
        agenda.put("12345", new Contacto("Fernanda", "12345", "fer@gmail.com", "SAT"));
        agenda.put("10293", new Contacto("Manuel", "10293", "manu@gmail.com", "CFE"));
        agenda.put("02039", new Contacto("Lorena", "02039", "lore@gmail.com", "GAMESA"));
        agenda.put("56473", new Contacto("Ana", "56473", "ana@gmail.com", "DHL"));
        agenda.put("20392", new Contacto("Gilberto", "20392", "gil@gmail.com", "UBER"));


        //Ver el tamaño del mapa
        System.out.println(agenda.size());

        //Obtener un elemento especifico del mapa
        System.out.println(agenda.get("02039"));   //devuelve null porque no existe

        //Eliminar un elemento del mapa
        agenda.remove("02039");
        System.out.println(agenda);
        agenda.remove("99999", c2); //elimina si y solo si dicha llave esta asociada al objeto indicado
        System.out.println(agenda);

        //Existe la llave?
        System.out.println(agenda.containsKey("99999"));   //true
        System.out.println(agenda.containsKey("00000"));    // false


        //Existe el objeto (valor) ?
        System.out.println(agenda.containsValue(c1));  //true


        //iterar unicamnete sobre el conjunto de las llaves (keyset)
        for (String key : agenda.keySet()) {
            //Dentro haces lo que quieras usando la llave
            System.out.println(agenda.get(key).getNombre() + " : " + agenda.get(key).getCompañia());
        }

        //Registro el mismo numero( llave) con un valor asociado diferente
        agenda.put("20392", new Contacto("Karla", "20392", "karla.outlook.com", "TIKTOK"));


        //Iterar directamente sobre los valores asociados
        for (Contacto con : agenda.values()) {
            System.out.println(con);
        }


        //----------------------------------------------------------------------------------------------

        Set<String> conjunto=new HashSet<>(); //No permite duplicados






    }
}
