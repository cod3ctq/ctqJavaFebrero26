import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class EjercicioFiles1 {
    public static void main(String[] args){
        /*
        TRANSFORMAR LOS DATOS DEL ARCHIVO A NOMBRE DE FECHAS
        PRIMERO DE MARZO DE 1985\
        SE GUARDARAN LOS DATOS DENTRO DE OTRO ARCHIVO
         */
        String linea ;

        File origen = new File("C:\\Users\\Eric Morales\\Desktop\\fechas.txt");
        File escritura = new File("C:\\Users\\Eric Morales\\Desktop\\resultado.txt");

        String[] diasNombres = {
                "Primero", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez",
                "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve", "Veinte",
                "Veintiuno", "Veintidós", "Veintitrés", "Veinticuatro", "Veinticinco", "Veintiséis", "Veintisiete", "Veintiocho", "Veintinueve", "Treinta",
                "Treinta y uno"
        };

        // Arreglo con los nombres de los meses del año
        String[] mesesNombres = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        try{
            FileReader fr = new FileReader(origen); //CREARA UN CACHE DEL CONTENIDO DEL ARCHIVO

            //CREAMOS EL OBJETO PARA ESCRIBIR DENTRO DEL ARCHIVO
            FileWriter fw = new FileWriter(escritura);

            BufferedReader br = new BufferedReader(fr); //LEERA EL CONTENIDO DEL OBJETO FR

            String fechaLetra;
            while ( ( linea = br.readLine() ) != null ){

                fechaLetra = diasNombres[(Integer.parseInt(linea.substring(0,2))-1)]+" de "+
                            mesesNombres[(Integer.parseInt(linea.substring(2,4))-1)]+ " de " +
                            linea.substring(4) ;

                fw.write(fechaLetra+"\n");
            }

            fw.close();

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
