import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PracticaMapas {

    public static void main(String[] args) {

        //Crear un mapa: <String,String>
        //parametrizacion
        Map<String,Contacto> agenda = new HashMap<String,Contacto>();

        Contacto c1 = new Contacto("Carlos","99999","carlos@aol.com","cfe");
        Contacto c2 = new Contacto("Sam","77777","sam@aol.com","cfe");


        //agregar elementos: primero instancia el objeto y despues lo agrego
        agenda.put(c1.getNumero(), c1);
        agenda.put(c2.getNumero(), c2);

        //Agrega un contacnto:instancia el objeto al mismo tiempo de agregarlo

        agenda.put("1234", new Contacto("Fernanda","1234","fer@gmail.com","SAT"));
        agenda.put("1243", new Contacto("Manuel","1243","man@gmail.com","CFE"));
        agenda.put("1700", new Contacto("Lorena","1700","lor@gmail.com","GAMESA"));
        agenda.put("1223", new Contacto("Ana","1223","ana@gmail.com","DHL"));
        agenda.put("2434", new Contacto("Gilberto","2434","car@gmail.com","UBER"));

        //Ver el tamaño del mapa
        System.out.println(agenda.size());

        //Obtener un elemento especifico del mapa
        System.out.println(agenda.get("1700"));
        //System.out.println(agenda.get("1343244"));//Devuelve null porque no existe

        //Eliminar un elemento del mapa
        agenda.remove("1223");
        System.out.println(agenda);
        agenda.remove("99999",c2);//Elimina si y solo si dicha llave esta asociada al onjeto indicado.
        System.out.println(agenda);

        //Existe la llave?

        System.out.println(agenda.containsKey("99999"));//true
        System.out.println(agenda.containsKey("0000"));//false

        //Exsiste el (valor)?
        System.out.println(agenda.containsValue(c1));//true

        //Iterar unicamente sobre el conjunto de las llaves (keySet)
        //por cada llave dentro de agenda
        for (String key:agenda.keySet()){
            System.out.println(agenda.get(key).getNombre()+":"+agenda.get(key).getCompañia());
        }
        //Registro el mismo numero (llave) con un valor asociado diferente
        agenda.put("2434",new Contacto("Karla","20392","karla@gmail.com","tiktok"));


        //Iterar directamente sobre los valores asociados
        for (Contacto con:agenda.values()){
           // System.out.println(con);//impriendo a todo el objeto contancto
            System.out.println(con);
        }



        //-------------------------------------------------------------------------------
        Set<String> conjunto = new HashSet<>();// No permite duplicados .....

        conjunto.add("Hola");
        conjunto.add("JAVA");
        conjunto.add("45");
        conjunto.add("JAVA");

        System.out.println(conjunto);



    }
}
