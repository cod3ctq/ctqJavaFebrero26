import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        String[] dias31 = {
                "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince",
                "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
                "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco",
                "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta",
                "treinta y uno"
        };

        String rutaEscritura = "C:\\Users\\ramod\\OneDrive\\Desktop\\EjercicioEscrituraCETEQ.txt";
        String rutaLectura = "C:\\Users\\ramod\\OneDrive\\Desktop\\EjercicioLecturaCETEQ.txt";

        File escritura = new File(rutaEscritura);
        File lectura = new File(rutaLectura);

        String leer = "";
        String escribir = "";

        try {
            FileReader fr = new FileReader(lectura);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(escritura);

            while ((leer = br.readLine()) != null) {
                escribir = dias31[(Integer.parseInt(leer.substring(0,2)))-1] + " de " + meses[(Integer.parseInt(leer.substring(2,4)))-1] + " de " + leer.substring(4);

                fw.write(escribir + "\n");
            }

            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
