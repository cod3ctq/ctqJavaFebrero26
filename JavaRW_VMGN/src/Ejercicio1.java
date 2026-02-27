import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] dias = {
                "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
                "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve",
                "veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve",
                "treinta", "treinta y uno"
        };
        String[] meses = {
                "invalido", "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        String ruta = "C:\\Users\\200423981272\\Desktop\\ejercicio.txt";
        String rutaescritura = "C:\\Users\\200423981272\\Desktop\\Ruta de escritura.txt";
        String linea = "";
        File file = new File(ruta);
        File escritura = new File(rutaescritura);


        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(escritura);


            while ((linea = br.readLine()) != null) {
                int dia = Integer.parseInt(linea.substring(0, 2));
                int mes = Integer.parseInt(linea.substring(2, 4));
                String año = linea.substring(4);
                System.out.println(linea);
                String fechas = dias[dia] + " de " + meses[mes] + " de " + año;


                System.out.println(fechas);
                fw.write(fechas + "\n");


            }
            fw.close();

        } catch (Exception ex) {
            ex.printStackTrace();

        }


    }
}
