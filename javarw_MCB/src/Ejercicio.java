import java.io.*;

public class Ejercicio {
    public static void main(String[] args) {

        String[] arrayDias = {"", "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince",
                "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
                "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco",
                "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta",
                "treinta y uno"};

        String[] arrayMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio","julio",
                "agosto","septiembre","octubre","noviembre","diciembre"};

        String rutaNumeros="C:\\Users\\maria\\Desktop\\fechas.txt"; //Almacena donde está guardado el archivo
        String rutaTexto="C:\\Users\\maria\\Desktop\\fechastexto.txt";
        String linea=""; //Guardar temporalmente el contenido de la línea actual que se esté leyendo

        File fileNumeros = new File(rutaNumeros);
        File fileTexto = new File(rutaTexto);

        String texos;

        try { //Intenta....
            FileReader fr = new FileReader(fileNumeros); //Crear un cache del contenido del archivo
            BufferedReader br = new BufferedReader(fr); //Leer el contenido
            FileWriter fw = new FileWriter(fileTexto); //Objeto para escribir dentro del archivo


            String[] datos;
            while((linea = br.readLine()) !=null){

                if (linea.length() == 8) {
                    // Obtener día, mes y año
                    String dia = linea.substring(0, 2);
                    String mes = linea.substring(2, 4);
                    String año = linea.substring(4, 8);

                    int diaNum = Integer.parseInt(dia);
                    int mesNum = Integer.parseInt(mes);

                    String diaTexto = arrayDias[diaNum];
                    String mesTexto = arrayMeses[mesNum];

                    System.out.println(diaTexto+ " de "+ mesTexto+ " del " + año);

                //Escribir la fecha en texto en el nuevo archivo
                fw.write(diaTexto+ " de "+ mesTexto+ " del " + año);
                }

            }

            //Cerrar el flujo hacia el archivo de escritura
            fw.close();
        } catch(Exception ex) { //Atrapa/maneja la excepción
            ex.printStackTrace();
        }
    }
}
