import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PracticaMapas {
	public static void main(String[] args) {

		Map<String,Contacto> agenda = new HashMap<String,Contacto>();
		Contacto c1 = new Contacto("Carlos","99999", "Carlos_Villavicencio@gmail.com","CFE");
		Contacto c2 = new Contacto("Samanta", "77777", "algo@gmail.com", "CFE");
		agenda.put(c1.getNumero(),c1);
		agenda.put(c2.getNumero(),c2);
		agenda.put("55350",new Contacto("Juan","55350","Juan_perez@gmail.com","Telmex"));
		agenda.put("12345", new Contacto("Fernanda","12345","fer@gmail.com", "SAT"));
		agenda.put("10293", new Contacto("Manuel","10293","manu@gmail.com", "CFE"));
		agenda.put("02039", new Contacto("Lorena","02039","lore@gmail.com", "GAMESA"));
		agenda.put("56473", new Contacto("Ana","56473","ana@gmail.com", "DHL"));
		agenda.put("20392", new Contacto("Gilberto","20392","gil@gmail.com", "UBER"));

		//Tamaño del mapa
		System.out.println(agenda.size());

		//Obtener un elemento específico del mapa
		System.out.println(agenda.get("02039"));

		//Elimina un elemento
		agenda.remove("02039");
		System.out.println(agenda);
		agenda.remove("99999",c1);
		System.out.println(agenda);

		System.out.println(agenda.containsKey("77777"));

		for(String key: agenda.keySet()){
			System.out.println(agenda.get(key).getNombre()+ ": " + agenda.get(key).getCompañia());
		}


		agenda.put("20392", new Contacto("karla","02392","karla@gmail.com","Tiktok"));

		for (Contacto con : agenda.values()){
			System.out.println(con);
		}

		Set<String> conjunto = new HashSet<>();

	}
}
