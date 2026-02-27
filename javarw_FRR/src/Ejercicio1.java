import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejercicio1 {
    public static void main(String[] args) {
        String ruta ="C:\\Users\\pacor\\OneDrive\\Escritorio\\FechasNumericas.txt";
        File file = new File(ruta);
        String linea ="";
        String fecheEnCadena="";

        String[] unidades = {
                "UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ",
                "ONCE","DOCE","TRECE","CATORCE","QUINCE","DIECISEIS","DIECISIETE","DIECIOCHO","DIECINUEVE","VEINTE",
                "VEINTIUNO","VEINTIDOS","VEINTITRES","VEINTICUATRO","VEINTICINCO","VEINTISEIS","VEINTISIETE","VEINTIOCHO","VEINTINUEVE","TREINTA",
                "TREINTA Y UNO","TREINTA Y DOS","TREINTA Y TRES","TREINTA Y CUATRO","TREINTA Y CINCO","TREINTA Y SEIS","TREINTA Y SIETE","TREINTA Y OCHO","TREINTA Y NUEVE","CUARENTA",
                "CUARENTA Y UNO","CUARENTA Y DOS","CUARENTA Y TRES","CUARENTA Y CUATRO","CUARENTA Y CINCO","CUARENTA Y SEIS","CUARENTA Y SIETE","CUARENTA Y OCHO","CUARENTA Y NUEVE","CINCUENTA",
                "CINCUENTA Y UNO","CINCUENTA Y DOS","CINCUENTA Y TRES","CINCUENTA Y CUATRO","CINCUENTA Y CINCO","CINCUENTA Y SEIS","CINCUENTA Y SIETE","CINCUENTA Y OCHO","CINCUENTA Y NUEVE","SESENTA",
                "SESENTA Y UNO","SESENTA Y DOS","SESENTA Y TRES","SESENTA Y CUATRO","SESENTA Y CINCO","SESENTA Y SEIS","SESENTA Y SIETE","SESENTA Y OCHO","SESENTA Y NUEVE","SETENTA",
                "SETENTA Y UNO","SETENTA Y DOS","SETENTA Y TRES","SETENTA Y CUATRO","SETENTA Y CINCO","SETENTA Y SEIS","SETENTA Y SIETE","SETENTA Y OCHO","SETENTA Y NUEVE","OCHENTA",
                "OCHENTA Y UNO","OCHENTA Y DOS","OCHENTA Y TRES","OCHENTA Y CUATRO","OCHENTA Y CINCO","OCHENTA Y SEIS","OCHENTA Y SIETE","OCHENTA Y OCHO","OCHENTA Y NUEVE","NOVENTA",
                "NOVENTA Y UNO","NOVENTA Y DOS","NOVENTA Y TRES","NOVENTA Y CUATRO","NOVENTA Y CINCO","NOVENTA Y SEIS","NOVENTA Y SIETE","NOVENTA Y OCHO","NOVENTA Y NUEVE"};

        String[] meses = {
                "ENERO",
                "FEBRERO",
                "MARZO",
                "ABRIL",
                "MAYO",
                "JUNIO",
                "JULIO",
                "AGOSTO",
                "SEPTIEMBRE",
                "OCTUBRE",
                "NOVIEMBRE",
                "DICIEMBRE"
        };

        String[] centenas = {
                "CIEN",
                "DOSCIENTOS",
                "TRESCIENTOS",
                "CUATROCIENTOS",
                "QUINIENTOS",
                "SEISCIENTOS",
                "SETECIENTOS",
                "OCHOCIENTOS",
                "NOVECIENTOS"
        };

        String[] millares = {"MIL", "DOS MIL","TRES MIL"};


        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null){
                System.out.println(linea);
                String dia = linea.substring(0,2);
                String mes = linea.substring(2,4);
                String year = linea.substring(4);

                //Se obtiene DIA en cadena
                fecheEnCadena = fecheEnCadena+unidades[Integer.parseInt(dia)-1];
                //Se obtiene MES en cadena
                fecheEnCadena = fecheEnCadena+meses[Integer.parseInt(mes)-1];


                String yearMillar = millares[Integer.parseInt(year.substring(0,1))-1];
                String yearCentena = centenas[Integer.parseInt(year.substring(1,2))-1];
                String yearUnidades = unidades[Integer.parseInt(year.substring(2))-1];

                Str

                System.out.println(dia+"/ "+mes+"/"+year);
            }
        }
        catch (Exception e){

        }
    }
}
