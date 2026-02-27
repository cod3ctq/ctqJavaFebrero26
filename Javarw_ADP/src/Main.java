import javax.sound.sampled.spi.AudioFileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String ruta= "C:\\Users\\admin\\Desktop\\Nuevo Documento de texto.txt\\"; //almacena donde esta guardado el archivo
        String rutaEstructura= "\\C:\\Users\\admin\\Desktop\\rutaEstrucuta.txt\\";
        String linea= ""; //guardar temporalmente el contenido de la line aactual que es etste leyendo
        File file = new File(ruta);//Representa al archivo, cargandolo en memoria
        File file1 = new File(rutaEstructura);
        String curp;

        try{//intenta
            FileReader fr = new FileReader(file);//crear un cache del contenido del archivo
            BufferedReader br = new BufferedReader(fr); // leer el contenido
            FileWriter fw= new FileWriter(rutaEstructura);

            String[] datos;

            while ((linea = br.readLine()) !=null){
                System.out.println(linea);
                linea = linea.replace(",", "");
                //System.out.println(linea);



                /*System.out.println("AP_P:"+linea.substring(7)); // substring sirve pera cortar cadena de textos
                System.out.println("AP-P2"+linea.substring(7,9));*/
                datos = linea.split(" ");//CARLOS,HERNANDEZ,LOPEZ,

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
                 fw.close();


            }catch (Exception ex) {//atrapando manejando la excepcion
                ex.printStackTrace();


            }
        }
    }

