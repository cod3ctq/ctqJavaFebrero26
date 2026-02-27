import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class Ejercicio2claserutas {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\jopra\\OneDrive\\Desktop\\ejercicio2calserutas.txt"; //almacena donde esta guardado el archivo
        String rutaEscritura = "C:\\Users\\jopra\\OneDrive\\Desktop\\eje2sobres.txt";
        String linea = "";//guardar temporalmente el contenido de la line aactual que es etste leyendo

        String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        String[] dias = {
                "Uno", "Dos", "Tres", "Cuatro", "Cinco",
                "Seis", "Siete", "Ocho", "Nueve", "Diez",
                "Once", "Doce", "Trece", "Catorce", "Quince",
                "Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve",
                "Veinte", "Veintiuno", "Veintidos", "Veintitres",
                "Veinticuatro", "Veinticinco", "Veintiseis",
                "Veintisiete", "Veintiocho", "Veintinueve",
                "Treinta", "Treinta y Uno"
        };


        File file = new File(ruta);//Representa al archivo, cargandolo en memoria
        File escritura = new File(rutaEscritura);

        try {//intenta
            //hacer copia para leer el contenido
            FileReader fr = new FileReader(file);//crear un cache del contenido del archivo
            BufferedReader br = new BufferedReader(fr);//leer el contenido
            FileWriter fw = new FileWriter(escritura);


            while ((linea = br.readLine()) != null) {
                int dia = Integer.parseInt(linea.substring(0, 2));
                int mes = Integer.parseInt(linea.substring(2, 4));
                int anio = Integer.parseInt(linea.substring(4, 8));  // ← extraer año

                System.out.println(linea);
                String fechas = dias[dia - 1] +
                        " de " +
                        meses[mes]  + " de " +
                        anio; ;

                System.out.println(fechas);
                //Escribir el curp en el nuevo archivo
                fw.write(fechas + "\n");
            }
            fw.close();
        }

        //atrapando manejando la excepcion
         catch(Exception ex){
        ex.printStackTrace();
    }

    }
}


