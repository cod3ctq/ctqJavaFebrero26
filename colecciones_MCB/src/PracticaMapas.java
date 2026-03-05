import java.util.*;

public class PracticaMapas {
    public static void main(String[] args) {

        //Crear un mapa: <String, String>

        Map<String, Contacto> agenda = new HashMap<String, Contacto>();

        //Agrega un contacto: primero instancio al objeto y después lo agrego
        Contacto c1 = new Contacto("Carlos", "99999", "carlos@aol.com", "CFE");
        Contacto c2 = new Contacto("Samantha", "77777", "sam@aol.com", "CFE");
        agenda.put(c2.getNumero(), c2);
        agenda.put(c1.getNumero(), c1);

        //Agrega un contacto: instancia el objeto al mismo tiempo de agregarlo. Estos contactos solo existen aquí, dentro del mapa.
        agenda.put("12345", new Contacto("Fernanda","12345","fer@gmail.com", "SAT"));
        agenda.put("10293", new Contacto("Manuel","10293","manu@gmail.com", "CFE"));
        agenda.put("02039", new Contacto("Lorena","02039","lore@gmail.com", "GAMESA"));
        agenda.put("56473", new Contacto("Ana","56473","ana@gmail.com", "DHL"));
        agenda.put("20392", new Contacto("Gilberto","20392","gil@gmail.com", "UBER"));

        //Ver el tamaño del mapa
        System.out.println(agenda.size());

        //Obtener un elemento específico del mapa
        System.out.println(agenda.get("02039"));
        //System.out.println(agenda.get(02039")); <---- Devuelve null porque no existe

        //Eliminar un en elemento del mapa
        agenda.remove("02039");
        System.out.println(agenda);
        agenda.remove("99999", c2); //<--- solo elimina si la llave sí está asociada al objeto indicado.
        System.out.println(agenda);

        //Existe la llave?....
        System.out.println(agenda.containsKey("99999")); //true
        System.out.println(agenda.containsKey("000000")); //false

        //Existe el valor?....
        System.out.println(agenda.containsValue(c1)); //true
        System.out.println(agenda.containsValue(c2)); //true

        //Cómo aislar el key set para ITERARLO?
        for(String key: agenda.keySet()){
            System.out.println(agenda.get(key).getNombre()+ ": "+ agenda.get(key).getCompañia());
        }

        //Registro el mismo numero (llave), con un valor asociado diferente
        agenda.put("20392", new Contacto("Karla","2039","karla@outlook.com","Tiktok"));

        //Iterar directmanete sobre los valores asociados
        for (Contacto con : agenda.values()){
            System.out.println(con);
        }

        //--------------------------------------------------------------------------------------------------------------------

        //Agrega las ciudades: primero instancio al objeto y después lo agrego.
        Ciudad oaxaca1 = new Ciudad("Puerto Escondido", 29903, 12.06, "Turismo");
        Ciudad oaxaca2 = new Ciudad("Oaxaca de Juárez",270955, 85.48,"Secto terciario");
        Ciudad puebla1 = new Ciudad("Cholula", 290000, 51.03, "Sector servicios");
        Ciudad puebla2 = new Ciudad("Atlixco", 141793,41.2, "Agriultura");
        Ciudad yucatan1 = new Ciudad("Guadalajara", 1385629, 187.9, "Comercio");
        Ciudad yucatan2 = new Ciudad("Puerto Vallarta", 291839, 1300.67, "Turismo");

        //Lista para agrupar las ciudades por estado
        List<Ciudad> Oaxaca = new ArrayList<>();
        Oaxaca.add(oaxaca1);
        Oaxaca.add(oaxaca2);

        List<Ciudad> Puebla = new ArrayList<>();
        Puebla.add(puebla1);
        Puebla.add(puebla2);

        List<Ciudad> Yucatan = new ArrayList<>();
        Yucatan.add(yucatan1);
        Yucatan.add(yucatan2);

        Map<String, List<Ciudad>> inegi = new HashMap<>();

        inegi.put("Oaxaca", Oaxaca);
        inegi.put("Puebla", Puebla);
        inegi.put("Yucatán", Yucatan);

        //for (String estado : inegi.keySet()) {
            //System.out.println("Estado: " + estado);
        for(List<Ciudad> ciudades: inegi.values()){
            for (Ciudad c: ciudades){
                if (c.getActividadEconmica().equals("Turismo")){
                    System.out.println(c);
                }

            }


            //for (Ciudad c : inegi.get(estado)) {
                //System.out.println("Ciudad asociada: " + c.getNombre()+ " Poblacion: "+ c.getPoblacion()+ " Extensión: "+c.getExtension()+ " Actividad Económica: ");
                        }

        //---------------------------------------------------------------------------------------------------------------
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Hola");
        conjunto.add("Java");
        conjunto.add("17");
        conjunto.add("Java");

        System.out.println(conjunto);

        //Subir a git el proyecto de colecciones COMPLETO.



    }
}