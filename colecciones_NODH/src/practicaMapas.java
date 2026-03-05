import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practicaMapas {
    public static void main(String[] args) {
        //Crear un map: <String, Contacto>
        Map<String, Contacto> agenda = new HashMap<String, Contacto>();

        //Agrega un contacto: primero instancia al objeto y despues lo agrego
        Contacto contacto1 = new Contacto("Carlos", "99999", "carlos@aol.com", "CFE");
        Contacto contacto2 = new Contacto("Samantha", "77777", "sam@aol.com","CFE");
        agenda.put(contacto1.getNumero(), contacto1);
        agenda.put(contacto2.getNumero(), contacto2);

        //Agrega un contacto: instancia al objeto al mismo tiempo de agregarlo
        agenda.put("12345", new Contacto("Fernanda", "12345", "fer@gmail.com", "SAT"));
        agenda.put("102993", new Contacto("Manuel", "102993", "manu@gmail.com", "CFE"));
        agenda.put("02039", new Contacto("Lorena", "02039", "lore@gmail.com", "GAMESA"));
        agenda.put("56473", new Contacto("Ana", "56473", "ana@gmail.com", "DHL"));
        agenda.put("20392", new Contacto("Gilberto", "20392", "gil@gmail.com", "UBER"));

        //Ver el tamaño del mapa
        System.out.println(agenda.size());

        //Obtener un elemento especifico del mapa
        System.out.println("092039");
        //System.out.println("092039"); devuelve null, no existe

        //Eliminar un elemento del mapa
        agenda.remove("02039");
        System.out.println(agenda);
        agenda.remove("99999", contacto2); //Elimina si solo si dicha llave esta asociada al objeto indicado
        System.out.println(agenda);

        //Existe la llave ?
        System.out.println(agenda.containsKey("99999"));
        System.out.println(agenda.containsKey("00000"));

        //Existe el objeto () ?
        System.out.println(agenda.containsValue(contacto1));

        //Iterar unicamente sobre el conjunto de las llaves (keyset)
        for (String key : agenda.keySet()) {
            System.out.println(agenda.get(key).getNombre() + " " + agenda.get(key).getCompañia());
        }

        //Registro el mismo numero (llave) con un valor asociado diferente
        agenda.put("20392", new Contacto("Karla", "20392", "karla@outlook.com", "tiktok"));

        //Iterar directamente sobre los valores asociados
        for (Contacto contacto : agenda.values()) {
            System.out.println(contacto);
        }

    }
}
