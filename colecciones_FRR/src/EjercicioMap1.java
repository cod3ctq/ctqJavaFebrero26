import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjercicioMap1 {

    public static void main(String[] args) {

        List<Ciudad> ciudadesHidalgo = new ArrayList<Ciudad>();
        ciudadesHidalgo.add(new Ciudad("Pachuca",134545,2434.0));
        ciudadesHidalgo.add(new Ciudad("Actopan",2345672,575432.0));

        List<Ciudad> ciudadesGuadalajala = new ArrayList<Ciudad>();
        ciudadesGuadalajala.add(new Ciudad("Zapopan",4567654,34532.0));
        ciudadesGuadalajala.add(new Ciudad("Tlaquepaque",789765,764657.0));

        List<Ciudad> ciudadesPuebla = new ArrayList<Ciudad>();
        ciudadesPuebla .add(new Ciudad("Zacatlan",89765432,8756453.0));
        ciudadesPuebla.add(new Ciudad("Atlixco",2436790,312434.0));



        Map<String, List<Ciudad>> inegi = new HashMap<String,List<Ciudad>>();
        inegi.put("Hidalgo",ciudadesHidalgo);
        inegi.put("Guadalajara",ciudadesGuadalajala);
        inegi.put("Puebla",ciudadesPuebla);

        System.out.println(inegi);


        for (Map.Entry<String, List<Ciudad>> registro : inegi.entrySet()) {

            System.out.println("-----------------");
            System.out.println("Estado -> "+registro.getKey());
            System.out.println("Ciudades: ");
            for (Ciudad c: registro.getValue()){
                System.out.println(c.getNombre()+" - "+c.getExtensionKm2()+" km2");
            }
            System.out.println("-----------------");

        }



    }
}
