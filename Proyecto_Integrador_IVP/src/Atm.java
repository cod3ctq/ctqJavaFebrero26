import java.util.ArrayList;
import java.util.List;

public abstract class Atm {
	String direccion;
	int id;
	int folio=0;
	public List<Cuenta> database;

	public abstract void retiroSinTarjeta();

	public Atm() {
	}

	public Cuenta buscarCuenta(String numTarjeta){
		Cuenta aux = null;
		for (Cuenta cuenta : database){
			if (cuenta.getNumTajeta().equals(numTarjeta)) {
				aux = cuenta;
				break;
			}
		}
		return aux;
	}

	public double consultarSaldo(String numTarjeta){
		Cuenta cuenta = buscarCuenta(numTarjeta);
		double saldo =0;
		if (cuenta == null){
			System.out.println("La cuenta no existe");
		}else {
			saldo = cuenta.getSaldo();
		}
		return saldo;
	}

	public Atm(String direccion, int id, int folio, ArrayList<Cuenta> database) {
		this.direccion = direccion;
		this.id = id;
		this.folio = folio;
		this.database = database;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFolio() {
		return folio;
	}


	public List<Cuenta> getDatabase() {
		return database;
	}

	public void setDatabase(List<Cuenta> database) {
		this.database = database;
	}
}
