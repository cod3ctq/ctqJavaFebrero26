import java.io.*;

public class Ejerciciolecturayescritura {
	public static void main(String[] args) {

		String[] textoAñoDecenas = {
				"","uno", "dos", "tres", "cuatro", "cinco",
				"seis", "siete", "ocho", "nueve", "diez",
				"once", "doce", "trece", "catorce", "quince",
				"dieciséis", "diecisiete", "dieciocho", "diecinueve",
				"veinte", "veintiuno", "veintidos", "veintitres", "veinticuatro",
				"veinticinco", "veintiseis", "veintisiete", "veintiocho", "veintinueve",
				"treinta", "treinta y uno", "treinta y dos", "treinta y tres", "treinta y cuatro",
				"treinta y cinco", "treinta y seis", "treinta y siete", "treinta y ocho", "treinta y nueve",
				"cuarenta", "cuarenta y uno", "cuarenta y dos", "cuarenta y tres", "cuarenta y cuatro",
				"cuarenta y cinco", "cuarenta y seis", "cuarenta y siete", "cuarenta y ocho", "cuarenta y nueve",
				"cincuenta", "cincuenta y uno", "cincuenta y dos", "cincuenta y tres", "cincuenta y cuatro",
				"cincuenta y cinco", "cincuenta y seis", "cincuenta y siete", "cincuenta y ocho", "cincuenta y nueve",
				"sesenta", "sesenta y uno", "sesenta y dos", "sesenta y tres", "sesenta y cuatro",
				"sesenta y cinco", "sesenta y seis", "sesenta y siete", "sesenta y ocho", "sesenta y nueve",
				"setenta", "setenta y uno", "setenta y dos", "setenta y tres", "setenta y cuatro",
				"setenta y cinco", "setenta y seis", "setenta y siete", "setenta y ocho", "setenta y nueve",
				"ochenta", "ochenta y uno", "ochenta y dos", "ochenta y tres", "ochenta y cuatro",
				"ochenta y cinco", "ochenta y seis", "ochenta y siete", "ochenta y ocho", "ochenta y nueve",
				"noventa", "noventa y uno", "noventa y dos", "noventa y tres", "noventa y cuatro",
				"noventa y cinco", "noventa y seis", "noventa y siete", "noventa y ocho", "noventa y nueve"
		};
		String[] textoAñoCentenas = {"","ciento","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","setecientos","ochocientos","novecientos"};
		String[] textoAñoMiles = {"", "mil" ,"dos mil"};
		String[] textoMes= {
				"","enero", "febrero", "marzo", "abril", "mayo",
				"junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre"
		};
		String[] textoDias={
				"","Primero", "dos", "tres", "cuatro", "cinco",
				"seis", "siete", "ocho", "nueve", "diez",
				"once", "doce", "trece", "catorce", "quince",
				"dieciséis", "diecisiete", "dieciocho", "diecinueve",
				"veinte", "veintiuno", "veintidos", "veintitres", "veinticuatro",
				"veinticinco", "veintiseis", "veintisiete", "veintiocho", "veintinueve",
				"treinta", "treinta y uno"};
		String fecha;
		int dias, meses, añoDecenas, añoCentenas, añoMiles;
		String ruta = "fechas.txt",linea = "";
		String rutaEscritura="fechassalida.txt";
		File file = new File(ruta);
		System.out.println(file.getPath());
		String [] datos;

		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			FileWriter writer = new FileWriter(rutaEscritura,true);
			while ((linea=br.readLine())!=null) {

				dias=Integer.parseInt(linea.substring(0,2));
				meses=Integer.parseInt(linea.substring(2,4));
				añoDecenas=Integer.parseInt(linea.substring(6,8));
				añoCentenas=Integer.parseInt(linea.substring(5,6));
				añoMiles=Integer.parseInt(linea.substring(4,5));
				System.out.println(dias+" "+meses+" "+añoMiles+" "+añoCentenas+" "+añoDecenas);

				fecha = textoDias[dias] + " de " + textoMes[meses] + " de " +
						textoAñoMiles[añoMiles]+ " " + textoAñoCentenas[añoCentenas]+
						" " + textoAñoDecenas[añoDecenas];
				System.out.println(fecha);
				writer.write( linea + "\n" + fecha + "\n\n");
			}
			writer.close();
		}catch (Exception e) {
			System.out.println(e);
		}

		System.out.print("Hello and welcome!");

	}
}
