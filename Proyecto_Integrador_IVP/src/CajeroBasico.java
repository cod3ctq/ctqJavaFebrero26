import java.time.LocalDate;
import java.util.ArrayList;

public class CajeroBasico extends  Atm implements IOperacionesBasicas {


	public CajeroBasico(String direccion, int id, int folio, ArrayList<Cuenta> database) {
		super(direccion, id, folio, database);
	}

	public CajeroBasico() {
	}

	@Override
	public Object[] retirar(String numTarjeta, double monto, String nip) {

		Object [] data= new Object[2];
		Cuenta cuenta= this.buscarCuenta(numTarjeta);

		if (cuenta== null){
			System.out.println("LA cuenta no existe");
		} else if (!cuenta.getNip().equals(nip)) {
			System.out.println("El nip no es válido");
		} else if (cuenta.getSaldo()<monto) {
			System.out.println("Saldo insuficiente");
		}else if ((cuenta.getSaldo()-monto)<2000){
			System.out.println("Saldo minimo insuficiente");
		}
		else {
			this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo()-monto);
			data [0]= monto;
			data [1]= new Ticket(this.getDireccion(), LocalDate.now(),monto,"Retiro",this.folio=this.folio+1);
		}
		return data;
	}

	@Override
	public Ticket pagarServicio(String numConvenio, double monto, String referencia) {
		return null;
	}

	@Override
	public void retiroSinTarjeta() {

	}

}
