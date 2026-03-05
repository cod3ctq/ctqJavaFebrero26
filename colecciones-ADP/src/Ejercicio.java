import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Crear esta estructura en codigo
//
//Llenar con:
//
//Datos de 3 estados
//cada estado tendra al menos 2 ciudades asociadas, llenar esas ciudades con sus datos
public class Ejercicio {
    public static void main(String[] args) {
        Map<String, List<Ciudad>> inegi = new HashMap<String, List<Ciudad>>();

        List<Ciudad> ciudadesOaxaca = new ArrayList<>();
        ciudadesOaxaca.add(new Ciudad( "De juarez", "85.0", 85.48, "Turismo"));
        ciudadesOaxaca.add(new Ciudad( "Salina cruz", "55.5", 131.9, "Petroleo"));


        List<Ciudad> ciudadesNL = new ArrayList<>();
        ciudadesNL.add(new Ciudad( "Monterrey", "90.0", 109.48, "Industria"));
        ciudadesNL.add(new Ciudad( "San Nicolas", "59.5", 149.9, "Manufactura"));


        List<Ciudad> ciudadesTaba = new ArrayList<>();
        ciudadesTaba.add(new Ciudad( "Villa Hermosa", "95.34", 450.48, "Comercio"));
        ciudadesTaba.add(new Ciudad( "Paraiso", "70.0", 169.9, "Petroleo"));

        inegi.put("Oaxaca", ciudadesOaxaca);
        inegi.put("Nuevo Leon", ciudadesNL);
        inegi.put("Tabasco",ciudadesTaba);

        //System.out.println(inegi);

        for (List<Ciudad>listas : inegi.values()){
            for (Ciudad c : listas){
                if(c.getActividadeconomica().equals("Comercio")){
                    System.out.println(c);
                }
                //-----------------------------------------------------------------














            }
        }





    }
}