import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {


		Cuenta cuenta1 = new Cuenta(1, "4532123456789012", "Carlos Ramirez", "00123456789", 1, 15000.50,"1234");
		Cuenta cuenta2 = new Cuenta(2, "4532123456789013", "Ana Lopez", "00123456790", 2, 8200.75,"1234");
		Cuenta cuenta3 = new Cuenta(3, "4532123456789014", "Luis Hernandez", "00123456791", 1, 12500.00,"1234");
		Cuenta cuenta4 = new Cuenta(4, "4532123456789015", "Maria Torres", "00123456792", 3, 5600.20,"1234");
		Cuenta cuenta5 = new Cuenta(5, "4532123456789016", "Pedro Sanchez", "00123456793", 2, 34000.90,"1234");
		Cuenta cuenta6 = new Cuenta(6, "4532123456789017", "Sofia Morales", "00123456794", 1, 4500.00,"1234");
		Cuenta cuenta7 = new Cuenta(7, "4532123456789018", "Jorge Castillo", "00123456795", 3, 27800.40,"1234");
		Cuenta cuenta8 = new Cuenta(8, "4532123456789019", "Lucia Ortega", "00123456796", 2, 1990.99,"1234");
		Cuenta cuenta9 = new Cuenta(9, "4532123456789020", "Ricardo Vargas", "00123456797", 1, 89000.00,"1234");
		Cuenta cuenta10 = new Cuenta(10, "4532123456789021", "Daniela Cruz", "00123456798", 2, 7650.35,"1234");

		List<Cuenta> cuentas = new ArrayList<>();

		cuentas.add(cuenta1);
		cuentas.add(cuenta2);
		cuentas.add(cuenta3);
		cuentas.add(cuenta4);
		cuentas.add(cuenta5);
		cuentas.add(cuenta6);
		cuentas.add(cuenta7);
		cuentas.add(cuenta8);
		cuentas.add(cuenta9);
		cuentas.add(cuenta10);

		CajeroBasico cb = new CajeroBasico();
		cb.setDireccion("Avenida Juarez #1");
		cb.setId(1040);
		cb.setDatabase(cuentas);

		Object[]x=cb.retirar("4532123456789020",100,"1234");
		System.out.println(x[0]);
		System.out.println(x[1]);
		Object[]x2=cb.retirar("4532123456789020",100,"1234");
		System.out.println(x2[0]);
		System.out.println(x2[1]);

		System.out.println(cb.consultarSaldo("4532123456789016"));

	}
}