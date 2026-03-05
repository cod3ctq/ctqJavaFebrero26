import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class PracticaMapas {
    public static void main(String[] args){




        //CREAR UN MAPA
        Map<String, Contacto> agenda = new HashMap<String, Contacto>();

        //PRIMERO CREAMOS EL OBJETO CONTACTO
        Contacto c1 = new Contacto("Carlos","99999","carlos@gmail.com","CFE");
        Contacto c2 = new Contacto("Samantha","77777","sam@aol.com","CFE");

        //AGREGANDO AL MAPA EL DATO
        agenda.put(c1.getNumero(),c1);
        agenda.put(c2.getNumero(),c2);

        //OTRO MODO DE AGREGAR
        agenda.put("12345",new Contacto("Fernanda","12345","fer@gmail.com","SAT"));
        agenda.put("10293",new Contacto("Manuel","10293","manu@gmail.com","CFE"));
        agenda.put("02039",new Contacto("Lorena","02039","lore@gmail.com","GAMESA"));
        agenda.put("56473",new Contacto("Ana","56473","ana@gmail.com","DHL"));
        agenda.put("20392",new Contacto("Gilberto","20392","gil@gmail.com","UBER"));

        //VER TAMAÑO DEL MAPA
        System.out.println(agenda.size());

        //OBTENER UN ELEMENTO ESPEDIFICO DEL MAPA
        System.out.println(agenda.get("02039"));


        //ELIMINAR UN ELEMENTO DEL MAPA
        agenda.remove("02039"); //ELIMINA UN REGISTRO BUSNCADO POR LA LLAVE
        System.out.println(agenda);

        agenda.remove("99999",c2); //ELIMINA SI Y SOLO SI DICHA LLAV ESTA ASOCIADA AL OBJETO INDICADO
        System.out.println(agenda);

        //EXISTE UN ELEMENTO
        System.out.println(agenda.containsKey("99999"));

        System.out.println(agenda.containsKey("00000"));

        //EXISTE EL OBJETO POR SU CONTENIDO EN VALOR
        System.out.println(agenda.containsValue(c1));


        //ITERAR UNICAMENTE SOBRE EL KEYSET
        for (String key : agenda.keySet()) {
            System.out.println(key);
            //para concoer la info que tiene el key
            System.out.println(agenda.get(key));

            //AHORA SI QUIERO VALORES EN ESPECIFICO
            System.out.println(agenda.get(key).getNombre() + ":" + agenda.get(key).getCompania());
        }

        //REGISTRO DE UN MISMO NUMERO (LLAVE) CON UN VALOR ASICIADO DIFERENTE
        agenda.put("20392",new Contacto("Karla","20392","karla@outlook.com","tiktok"));

        //ITERAR DIRECTAMENTE SOBRE LOS VALORES ASOCIADOS
        for(Contacto cont : agenda.values()){
            System.out.println(cont);
        }



    }
}
