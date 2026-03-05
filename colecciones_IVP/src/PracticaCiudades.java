import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticaCiudades {
	public static void main(String[] args) {

		Map <String,List<Ciudad>> estados= new HashMap<>();

		estados.put("Estado de México",new ArrayList<>());
		estados.put("Oaxaca",new ArrayList<>());
		estados.put("Guanajuato",new ArrayList<>());

		Ciudad e1c1= new Ciudad("Coacalco de Berriozabal",293444,35.5,"Comercio y servicios");
		Ciudad e1c2= new Ciudad("Valle de Bravo", 61599, 421.95,"Turismo");
		Ciudad e2c1= new Ciudad("Oaxaca",270955,218,"Turismo");
		Ciudad e2c2= new Ciudad("Puerto Escondido",45000,12.06,"Turismo");
		Ciudad e3c1= new Ciudad("Guanajuato",72237,30.607,"Turismo");
		Ciudad e3c2= new Ciudad("Silao",203556,12.1,"Comercio y servicios");

		estados.get("Estado de México").add(e1c1);
		estados.get("Estado de México").add(e1c2);
		estados.get("Oaxaca").add(e2c1);
		estados.get("Oaxaca").add(e2c2);
		estados.get("Guanajuato").add(e3c1);
		estados.get("Guanajuato").add(e3c2);

		for (List<Ciudad> estado  : estados.values()){
			for (Ciudad ciudad : estado){
				if (ciudad.getActividadEconomica()=="Turismo"){
					System.out.println(ciudad.getNombre());
				}
			}
		}





	}
}
