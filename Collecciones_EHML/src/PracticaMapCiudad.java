import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticaMapCiudad {
    public static void main(String[] args){

        //CREAR UN MAPA
        Map<String, List<Ciudad>> agenda = new HashMap<String, List<Ciudad>>();

        //INSTANCIADO CIUDADES
        Ciudad c1 = new Ciudad("Aguascalientes",357378,5213.65,"Textil");
        Ciudad c2 = new Ciudad("Calvillo",82378,8563.65,"Ganaderia");
        Ciudad c3 = new Ciudad("Rincon de Romos",62378,5323.65,"Pesca");
        Ciudad c4 = new Ciudad("Tijuana",169878,99873.65,"Industria");
        Ciudad c5 = new Ciudad("Mexicali",5378,56833.65,"Pesca");
        Ciudad c6 = new Ciudad("Ensenada",52378,29153.65,"Textil");
        Ciudad c7 = new Ciudad("La Paz",963378,52985.65,"Pesca");
        Ciudad c8 = new Ciudad("Cabo San Lucas",566778,21216.21,"Industria");
        Ciudad c9 = new Ciudad("San Jose del Cabo",782378,64213.65,"Ganaderia");
        Ciudad c10 = new Ciudad("San Francisco de Campeche",452378,52973.65,"Textil");
        Ciudad c11 = new Ciudad("Ciudad del Carmen",332378,3213.65,"Pesca");
        Ciudad c12 = new Ciudad("Cahmpoton",342378,74513.65,"Ganaderia");

        //estados AGUSCALIENTES, BAJA CALFORNIA , BAJA CALIFORNIA SUR, CAMPECHE

        //GENERANDO LA LISTA DE LOS ESTADOS
        List <Ciudad> listaAguas = new ArrayList<>();
        listaAguas.add(c1);
        listaAguas.add(c2);
        listaAguas.add(c3);
        List <Ciudad> listaBaja = new ArrayList<>();
        listaBaja.add(c4);
        listaBaja.add(c5);
        listaBaja.add(c6);
        List <Ciudad> listaBajaSur = new ArrayList<>();
        listaBajaSur.add(c7);
        listaBajaSur.add(c8);
        listaBajaSur.add(c9);
        List <Ciudad> listaCampe = new ArrayList<>();
        listaCampe.add(c10);
        listaCampe.add(c11);
        listaCampe.add(c12);

        //LLENADO DE MAPA

        agenda.put("Aguscalientes",listaAguas);
        agenda.put("Baja California",listaBaja);
        agenda.put("Baja California Sur",listaBajaSur);
        agenda.put("Campeche",listaCampe);


        for (List<Ciudad> ciudad : agenda.values()){
            for (Ciudad c : ciudad){
                if (c.getActEco().equals("Ganaderia")){
                    System.out.println(c);
                }
            }
        }
    }
}
