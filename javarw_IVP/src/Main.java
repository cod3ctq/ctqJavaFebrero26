import java.io.*;

public class Main {
	public static void main(String[] args) {

		String ruta = "fechas.txt",linea = "";
		String rutaEscritura="datosSalida.txt";
		File file = new File(ruta);
		System.out.println(file.getPath());
		String [] datos;
		String curp;
		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			FileWriter writer = new FileWriter(rutaEscritura,true);
			while ((linea=br.readLine())!=null) {
				linea = linea.replace(",", "");
				System.out.println(linea);
				datos=linea.split(" ");
				curp =  datos[1].substring(0,2)+    //Primer apellido
						datos[2].charAt(0)+         //Segundo apellido
						datos[0].charAt(0)+         //Nombre
						datos[3].substring(8,10)+   //Año
						datos[3].substring(3,5)+    //Mes
						datos[3].substring(0,2)+    //Día
						datos[4]+                   //Sexo
						datos[5].substring(0,2)+    //Estado
						datos[6];                   //
				System.out.println(curp);
				writer.write( linea + "\n" + curp + "\n\n");
			}
			writer.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

		System.out.print("Hello and welcome!");

	}
}