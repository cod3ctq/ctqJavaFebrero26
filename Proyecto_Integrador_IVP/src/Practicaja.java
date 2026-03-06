import java.time.LocalDate;

public class Practicaja extends Atm implements IOperacionesBasicas, IOperacionesAvanzadas{




	@Override
	public void retiroSinTarjeta() {

	}

	@Override
	public Object[] retirar(String numTarjeta, double monto, String nip) {
		return new Object[0];
	}

	@Override
	public Ticket pagarServicio(String numConvenio, double monto, String referencia) {
		return null;
	}

	@Override
	public Object[] depositar(String numTarjeta, double monto) {

		Object [] data= new Object[2];
		Cuenta cuenta= this.buscarCuenta(numTarjeta);
		if (cuenta==null){
			System.out.println("La cuenta no existe");
		} else if (monto%100!=0||monto<0) {
			System.out.println("El monto tiene que ser positivo y multiplo de 100");
		} else if ((monto+cuenta.getSaldo())>500000) {
			System.out.println("El monto excede el maximo permitido en la cuenta");
		}else {
			data [0]= monto;
			data [1]= new Ticket(this.getDireccion(), LocalDate.now(),monto,"Depósito",this.folio=this.folio+1);
		}

		return data;
	}
}
