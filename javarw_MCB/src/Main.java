import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String ruta="C:\\Users\\maria\\Desktop\\Nuevo Documento de texto.txt"; //Almacena donde está guardado el archivo
        String rutaEscritura="C:\\Users\\maria\\Desktop\\escritura.txt";
        String linea=""; //Guardar temporalmente el contenido de la línea actual que se esté leyendo
        File file = new File(ruta); //Representa al archivo cargandolo en memoria
        File escritura = new File(rutaEscritura);
        String curp;

        try{ //Intenta....
            FileReader fr = new FileReader(file); //Crear un cache del contenido del archivo
            BufferedReader br = new BufferedReader(fr); //Leer el contenido
            FileWriter fw = new FileWriter(escritura); //Objeto para escribir dentro del archivo

            String[] datos;
            while((linea = br.readLine()) !=null){
                linea = linea.replace(",", "");
                System.out.println(linea);

//                System.out.println("AP_P:"+ linea.substring(7));//Substring sirve para cortar cadenas de texto
//                System.out.println("AP_P2:"+linea.substring(7,9));

                datos = linea.split(" "); //[CARLOS, HERNANDEZ, LOPEZ, 12/03/1994,M,PEUBLA,A7K]
                curp= datos[1].substring(0,2)+
                        datos[2].substring(0,1)+
                        datos[0].substring(0,1)+
                        datos[3].substring(8)+
                        datos[3].substring(3,5)+
                        datos[3].substring(0,2)+
                        datos[4]+datos[5].substring(0,2)+datos[6];
                System.out.println(curp);

                //Escribir el curp en el nuevo archivo
                fw.write(curp+"\n");

            }

            //Cerrar el flujo hacia el archivo de escritura
            fw.close();
        }catch(Exception ex){ //Atrapa/maneja la excepción
            ex.printStackTrace();
        }
    }
}