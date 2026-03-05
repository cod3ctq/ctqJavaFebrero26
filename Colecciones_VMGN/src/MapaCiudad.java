import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapaCiudad {
    public static void main(String[] args) {


        Map<String, List<Ciudades>> map = new HashMap<String, List<Ciudades>>();
        List<Ciudades> jalisco = new ArrayList<Ciudades>();
        jalisco.add(new Ciudades("Guadalajara", "1.4 M", "187.9 km²", "Sector servicios"));
        jalisco.add(new Ciudades("Puerto Vallarta", "300,000", "1,300.67 km²", "Turismo"));

        List<Ciudades> nuevoln = new ArrayList<Ciudades>();
        nuevoln.add(new Ciudades("Monterrey", "5.3 millones ", "324.8 km²", "Manofactura"));
        nuevoln.add(new Ciudades("Santa catarina", "306,322", "46.59 km²", "Comercio"));

        List<Ciudades> edomx = new ArrayList<Ciudades>();
        edomx.add(new Ciudades("Tlanepantla", "672,202", "69.7 km²", "Manofactura"));
        edomx.add(new Ciudades("Satelite", "456,272", "31.7 km²", "Sector servicios"));

        map.put("Jalisco", jalisco);
        map.put("Nuevo Leon", nuevoln);
        map.put("Estado de Mexico", edomx);

        System.out.println(map);

        //Filtrar por actividad economica

        for (List<Ciudades> ciudades : map.values()) {     // Por cada lista de ciudades
            //Vamos a iterard dentro de cada lista

            for (Ciudades c : ciudades) {
                if (c.getAcEcon().equals("Sector servicios")) {
                    System.out.println(c);

                }

            }

        }


    }
}
