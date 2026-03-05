import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Estado de Mexico(Cuautitlan, Naucalpan), Puebla(Zacatlan, Puebla de Zaragoza), Guerrero (Acapulco de Juarez, Taxco)
        List<Ciudad> edoMex = new ArrayList<Ciudad>();
        edoMex.add(new Ciudad("Cuautitlan", "100000", 8000900,"Empresarial"));
        edoMex.add(new Ciudad("Naucalpan", "400000", 46004400,"Textil"));

        List<Ciudad> puebla = new ArrayList<Ciudad>();
        puebla.add(new Ciudad("Zacatlan", "60000", 21900,"Turismo"));
        puebla.add(new Ciudad("Puebla", "455000", 521900,"Ganaderia"));

        List<Ciudad> guerrero = new ArrayList<Ciudad>();
        guerrero.add(new Ciudad("Acapulco de Juarez", "56000", 215900,"Turismo"));
        guerrero.add(new Ciudad("Taxco", "74000", 5213900,"Pesca"));

        Map<String,List<Ciudad>> estados = new HashMap<String, List<Ciudad>>();
        estados.put("Estado de Mexico", edoMex);
        estados.put("Puebla", puebla);
        estados.put("Guerrero", guerrero);

        System.out.println(estados);

        //Imprimir unicamente el nombre y su extencion
        System.out.println(estados.size());

        //estados.values().stream().forEach(Ciudad::getNombre);

        for (Map.Entry<String, List<Ciudad>> estado : estados.entrySet()) {
            for (Ciudad ciudad : estado.getValue()) {
                System.out.println(ciudad.getNombre());
                System.out.println(ciudad.getExtencionKM2());
            }
        }


        for (List<Ciudad> ciudades : estados.values()) { //Por cada lista de ciudades
            for (Ciudad ciudad : ciudades) {
                System.out.println(ciudad.getActividadEconomica());
            }
        }

        Set<String> conjunto = new HashSet<>(); //No permite duplicados

        conjunto.add("Hola");
        conjunto.add("Java");
        conjunto.add("17");
        conjunto.add("Java");

        System.out.println(conjunto);
    }
}
