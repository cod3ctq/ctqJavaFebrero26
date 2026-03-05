import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practicaMapas {
    public static void main(String[] args) {

        //Crear un mapa : <String, String

        Map<String,contacto> agenda = new HashMap<String,contacto>();

        //Agrega un contacto: primero instancio al objeto y despues lo agrega
        contacto c1 = new contacto("Carlos","99999","carlos@ol.com","CFE");
        contacto c2 = new contacto("Samantha","77777","samos@ol.com","CFE");
        agenda.put(c1.getNumero(),c1);
        agenda.put(c2.getNumero(),c2);


        //Agrga un contacto; instancia el objeto al mismo tiempo de agregarlo
        agenda.put("12345", new contacto("Fernanda","12345","fer@gmail.com", "SAT"));
        agenda.put("10293", new contacto("Manuel","10293","manu@gmail.com", "CFE"));
        agenda.put("02039", new contacto("Lorena","02039","lore@gmail.com", "GAMESA"));
        agenda.put("56473", new contacto("Ana","56473","ana@gmail.com", "DHL"));
        agenda.put("20392", new contacto("Gilberto","20392","gil@gmail.com", "UBER"));


        //Ver el tamaño del mapa
        System.out.println(agenda.size());

        // Obtener un elemento especifico del mapa
        System.out.println(agenda.get("02039"));

        //Eliminar un elemento del mapa
        agenda.remove("02039"); //Elimina un registro buscando por la llave.
        System.out.println(agenda);
        agenda.remove("99999",c2); // Elimina si y solo si dicha llave esta asociada al objeto indicado.
        System.out.println(agenda);

        //Existe la llave
        System.out.println(agenda.containsKey("99999"));
        System.out.println(agenda.containsKey("00000"));

        // existe el objeto (valor)
        System.out.println(agenda.containsValue(c1)); //true

        // iterar unicamente sobre el conjunto de las llaves
        for (String key: agenda.keySet()){
            System.out.println(agenda.get(key).getNombre() + " : " + agenda.get(key).getCompañia());
        }

        // que pasa si regitro el mismo nuevero con un valor asociado diferente
        agenda.put("20392",new contacto("Karla","20392","karla@outlook.com","tiktok"));

        // Iterar directamente sobre los valores asociados
        for (contacto con : agenda.values()){
            System.out.println(con);
        }

























    }
}
