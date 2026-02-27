import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String rutaEscritura ="C:\\Users\\pacor\\OneDrive\\Escritorio\\ArchivoEscritura.txt"; //Almacena donde esta guardado el archivo
        String ruta ="C:\\Users\\pacor\\OneDrive\\Escritorio\\ArchivoTexto.txt"; //Almacena donde esta guardado el archivo

        String linea =""; //Guarda teporalmente el contenido de la linea actual que se este leyendo
        File file = new File(ruta); //Representa al archivo cargandolo en memoria
        File fileEscritura = new File(rutaEscritura);
        String[] datos;
        String curp="";


        try {
            FileReader fr = new FileReader(file); // Crea el un cache del conteido del archivo
            BufferedReader br = new BufferedReader(fr); //leer el contenido

            FileWriter fw = new FileWriter(fileEscritura);



            while ((linea = br.readLine()) != null){
                linea= linea.replace(",","");
                System.out.println(linea);

                /*System.out.println("AP_P: "+linea.substring(7)); //substring corta cadenas de texto
                System.out.println("AP_P2: "+linea.substring(7,9)); //substring corta cadenas de texto*/

                //Creando CURP
                datos = linea.split(" ");//Recorta na caena en base a un caracter
                curp = datos[1].substring(0,2)+
                        datos[2].substring(0,1)+
                        datos[0].substring(0,1)+
                        datos[3].substring(8)+
                        datos[3].substring(3,5)+
                        datos[3].substring(0,2)+
                        datos[4]+
                        datos[5].substring(0,2)+
                        datos[6];

                System.out.println("CURP: "+curp);

                //Escribir el curp en nuevo archivo
                fw.write(curp+"\n");
            }
            //Cerrar el flujo hacia el archivo escritura
            fw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}