import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args){

        String ruta = "C:\\Users\\Eric Morales\\Desktop\\ehml.txt"; //ALMACENA DONDE ESTA UBICADO EL ARCHIVO A CONSULTAR
        String linea = ""; // ALMACENARA EL CONTENIDO DE LA LINEA ACTUAL DEL ARCHIVO QUE SE ESTE LEYENDO
        String[] datos;
        String curp;

        //EL OBJETO FILE REPRESENTA LA ARCHIVO ... PERO CARGADO EN MEMORIA
        File file = new File(ruta);
        String rutaEscritura="C:\\Users\\Eric Morales\\Desktop\\escritura.txt";

        //INTENTA REALIZAR . . .
        try{
            FileReader fr = new FileReader(file); //CREARA UN CACHE DEL CONTENIDO DEL ARCHIVO

            //CREAR UN ARCHIVO
            File escritura = new File(rutaEscritura);

            //CREAMOS EL OBJETO PARA ESCRIBIR DENTRO DEL ARCHIVO
            FileWriter fw = new FileWriter(escritura);

            BufferedReader br = new BufferedReader(fr); //LEERA EL CONTENIDO DEL OBJETO FR

            while ( ( linea = br.readLine() ) != null ){
                System.out.println(linea);
                //[PRIMERO ELIMINAMOS LA , "COMA"
                linea = linea.replace(",","");
                datos = linea.split(" ");
                //EL METODO SUBSTRING -> SIRVE PARA CORTAR CADENAS DE TEXTO

                //EL EJERCICIO ES PARA CREAR EL CURP
                curp = datos[1].substring(0,2)+
                        datos[2].substring(0,1)+
                        datos[0].substring(0,1)+
                        datos[3].substring(8)+
                        datos[3].substring(3,5)+
                        datos[3].substring(0,2)+
                        datos[4] + datos[5].substring(0,2) + datos[6];


                System.out.println(curp);

                //ESCRIBIREMOS EL CURP EN EL NUEVO ARCHIVO
                fw.write(curp+"\n");
            }
            //CERRAMOS EL ARCHIVO DONDE ESCRIBIRMOS DESUES DE CONOCER QUE YA NO SE USARA
            fw.close();

        // SI FALLA EL INTENTO . . . MANEJA LA EXCEPCION
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
