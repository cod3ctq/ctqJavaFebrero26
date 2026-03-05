import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ciudades {

    public static void main(String[] args) {

        Map<String, List<Ciudad>> inegi = new HashMap<String, List<Ciudad>>();

        List<Ciudad> ciudadesPuebla = new ArrayList<>();
        ciudadesPuebla.add(new Ciudad("Teziutlan", 1455, 12133.12, "textil"));
        ciudadesPuebla.add(new Ciudad("Puebla", 1234556, 82133.12, "automotriz"));


        List<Ciudad> ciudadesQueretaro = new ArrayList<>();
        ciudadesQueretaro.add(new Ciudad("San Juan del Rio", 6555, 324.12, "aeroespacial"));
        ciudadesQueretaro.add(new Ciudad("Tequis", 46555, 1213512, "comercio"));


        List<Ciudad> ciudadesVeracruz = new ArrayList<>();
        ciudadesVeracruz.add(new Ciudad("Mtz de la torre", 1455, 12133.12, "agricola"));
        ciudadesVeracruz.add(new Ciudad("Vega de alatorre", 1455, 12133.12, "turismo"));

        inegi.put("Puebla", ciudadesPuebla);
        inegi.put("Queretaro", ciudadesQueretaro);
        inegi.put("Veracruz", ciudadesVeracruz);

        for (String estado : inegi.keySet()) {

            for (Ciudad ciudad : inegi.get(estado)) {
                System.out.println(ciudad);
            }
    }
}
    }

