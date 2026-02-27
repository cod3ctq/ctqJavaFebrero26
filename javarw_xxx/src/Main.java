import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {

        String ruta="C:\\Users\\Cesar\\Desktop\\datos.txt"; //almacena donde esta guardado el archivo
        String rutaEscritura="C:\\Users\\Cesar\\Desktop\\escritura.txt";
        String linea=""; //guardar temporalmente el contenido de la linea actual que se este leyendo
        File file = new File(ruta); //Representa al archivo, cargandolo en memoria
        File escritura = new File(rutaEscritura);
        String curp;

        try{ //intenta ...
            FileReader fr = new FileReader(file); //crear un cache del contenido del archivo
            BufferedReader br = new BufferedReader(fr); //leer el contenido
            FileWriter fw = new FileWriter(escritura); //Objeto para escribir dentro del archivo

            String[] datos;
            while( (linea = br.readLine()) !=null){
                linea = linea.replace(",", "");
                System.out.println(linea);
                //System.out.println("AP_P:"+linea.substring(7)); //substring sirve para cortar cadenas de texto
                //System.out.println("AP_P2:"+linea.substring(7,9));
                datos = linea.split(" ");//[CARLOS,HERNANDEZ,LOPEZ,12/03/1994,M,PUEBLA,A7K]
                //Armando el curp
                curp = datos[1].substring(0,2)+
                        datos[2].substring(0,1)+
                        datos[0].substring(0,1)+
                datos[3].substring(8)+
                        datos[3].substring(3,5)+
                        datos[3].substring(0,2)+
                        datos[4] + datos[5].substring(0,2) + datos[6];
                System.out.println(curp);
                //Escribir el curp en el nuevo archivo
                fw.write(curp+"\n");
            }
            //cerrar el flujo hacia el archivo escritura
            fw.close();
        }catch(Exception ex){ //atrapando/manejando la excepcion
            ex.printStackTrace();
        }
    }
}