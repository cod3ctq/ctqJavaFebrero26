import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String ruta = "C:\\Users\\200423981272\\Desktop\\javafr.txt"; // Almacen donde esta guardado el archivo
        String rutaescritura = "C:\\Users\\200423981272\\Desktop\\escritura.txt";
        String linea = ""; //Guardar temporalmente el contenido de la linea actual que se esta leyendo
        File file = new File(ruta); //Representa al archivo, cargandolo en memoria
        File escritura = new File(rutaescritura);
        String curp;

        try { //intenta
            FileReader fr = new FileReader(file);  //Crear un cache del contenido del archivo
            BufferedReader br = new BufferedReader(fr);  // leer el contenido
            FileWriter fw = new FileWriter(escritura) {
            };


            String[] datos;
            while ((linea = br.readLine()) != null) {
                linea = linea.replace(",", "");
                System.out.println(linea);


                //System.out.println("AP_P:" + linea.substring(7)); //El metodo substring sirve para cortar cadenas de texto
                datos = linea.split(" ");

                curp = datos[1].substring(0, 2) +
                        datos[2].substring(0, 1) +
                        datos[0].substring(0, 1) +
                        datos[3].substring(8) +
                        datos[3].substring(3, 5) +
                        datos[3].substring(0, 2) +
                        datos[4] + datos[5].substring(0, 2) + datos[6];


                System.out.println(curp);


                //Escribir el curp en el nuevo archivo

                fw.write(curp + "\n"); // la \n es un salto de linea


            }
            //cerar el flujo hacia el archivo de escritura
            fw.close();
        } catch (Exception ex) {  // atrapa o maneja la excepcion
            ex.printStackTrace();
        }

    }
}
