import java.time.LocalDate;

public class Practicaja extends Atm implements IOperacionesBasicas, IOperacionesAvanzadas {

    @Override
    public void retiroSinTarjeta() {

    }

    @Override
    public Object[] depositar(String numTarjeta, double monto) {
        //Buscar la cuenta
        Cuenta cuenta = this.buscarCuenta(numTarjeta);

        Object[] data = new Object[2]; //Objeto de salida
        if (cuenta == null) {
            System.out.println("La cuenta no existe!");
        } else if (monto < 0) {
            System.out.println("Cantidad negativa invalida");
        } else if (!(monto % 100 == 0)) {
            System.out.println("Monto invalido. Debe ser multiplo de 100 ");
        } else if (monto > 45000) {
            System.out.println("Cantidad excede el maximo permitido");
        } else if ((monto + cuenta.getSaldo()) > 45000) {
            System.out.println("Deposito no permitido. Execede el maximo");
        } else {
            this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo() + monto);
            //Sin cambio
            data[1] = new Ticket(this.getDirrecion(), LocalDate.now(), monto, "DEPOSITO", ++this.folio);
        }

        return data;
    }

    @Override
    public Object[] retirar(String numTarjeta, double monto, String nip) {
        return new Object[0];
    }

    @Override
    public Ticket pagarServicio(String numConvenio, double monto, String referencia) {
        return null;
    }
}
