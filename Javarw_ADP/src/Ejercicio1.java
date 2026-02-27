import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        String[] diasEnLetra = {
                "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete",
                "ocho", "nueve", "diez", "once", "doce", "trece", "catorce",
                "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve",
                "veinte", "veintiuno", "veintidos", "veintitres", "veinticuatro",
                "veinticinco", "veintiseis", "veintisiete", "veintiocho",
                "veintinueve", "treinta", "treinta y uno"
        };
        String[] mesesEnLetra = {
                "", "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };


        String ruta= "C:\\Users\\admin\\Desktop\\FECHAS.txt"; //almacena donde esta guardado el archivo
        String rutalectura= "C:\\Users\\admin\\Desktop\\Fechas en escritura.txt";
        String linea= ""; //guardar temporalmente el contenido de la line aactual que es etste leyendo
        File file = new File(ruta);//Representa al archivo, cargandolo en memoria
        File file1 = new File(rutalectura);

        String leer= "";
        String escribir= "";


        try{//intenta
            FileReader fr = new FileReader(file);//crear un cache del contenido del archivo
            BufferedReader br = new BufferedReader(fr); // leer el contenido
            FileWriter fw= new FileWriter(rutalectura);



            while ((linea = br.readLine()) !=null){
                int dia = Integer.parseInt(linea.substring(0,2));
                int mes = Integer.parseInt(linea.substring(2,4));
                int anio = Integer.parseInt(linea.substring(4,8));
                System.out.println(linea);
                String fechas= diasEnLetra[dia-1] + " de " + mesesEnLetra[mes] + " de " + anio ;


                System.out.println(fechas);
                //Escribir el curp en el nuevo archivo
                fw.write(fechas+"\n");


            }
            fw.close();


        }catch (Exception ex) {//atrapando manejando la excepcion
            ex.printStackTrace();


        }























    }
}
