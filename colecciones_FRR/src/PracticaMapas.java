import java.util.HashMap;
import java.util.Map;

public class PracticaMapas {

    public static void main(String[] args) {


        //keySet
        Map<String, Contacto> agenda = new HashMap<String, Contacto>();

        //Agregar un elemento al Map
        Contacto c1 = new Contacto("Pedro", "99999", "pedro@Gmail.com", "CFE");
        Contacto c2 = new Contacto("Samanta", "77777", "sam@Gmail.com", "CFE");

        agenda.put(c1.getNumero(), c1);

        agenda.put("12345", new Contacto("Fernanda", "12345", "fer@gmail.com", "SAT"));
        agenda.put("10293", new Contacto("Manuel", "10293", "manu@gmail.com", "CFE"));
        agenda.put("02039", new Contacto("Lorena", "02039", "lore@gmail.com", "GAMESA"));
        agenda.put("56473", new Contacto("Ana", "56473", "ana@gmail.com", "DHL"));
        agenda.put("20392", new Contacto("Gilberto", "20392", "gil@gmail.com", "UBER"));

        //nota: si se agrega un valor a la misma key se sobreescribe
        agenda.put("9023",new Contacto("Karla", "20392", "fer@gmail.com", "SAT"));


                //Ver tamaño del mapa
        System.out.println(agenda.size());

        //Obtener un elemento especifico
        System.out.println(agenda.get("02039"));
        System.out.println(agenda.get("0203wee9")); //retorna null en caso de no econtrar algo


        //Eliminar un elemento del mapa
        agenda.remove("20392");
        System.out.println(agenda);
        agenda.remove("10293");
        System.out.println(agenda);


        //Eliminar un numero solo si dicha llave esta asociada alobjeto indicado
        agenda.remove("77777",c2);


        //Preguntar si existe o no una llave en especifico
        System.out.println(agenda.containsKey("77777"));

        //Preguntar si existe o no algun valor en especifico
        System.out.println(agenda.containsValue(c1));

        //Iterar unicamnete sobre el conjunto de llaves(keyset)
        for (String key:agenda.keySet())
        {
            System.out.println(key);
            System.out.println(agenda.get(key).getNombre()+" : "+agenda.get(key).getCompany());

        }




        //Iterrar sobre los valores asociados
        for(Contacto contac: agenda.values()){
            System.out.println(contac);
        }

    }
}
