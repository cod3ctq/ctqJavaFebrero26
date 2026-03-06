import java.time.LocalDate;

public class Practicaja extends Atm implements IOperacionesBasicas, IOperacionesAvanzadas{
    @Override
    public void retiroSinTarjeta() {

    }

    @Override
    public Object[] depositar(String numTarjeta, double monto) {
        //Buscar la cuenta
        //validar que el monto no sea negativo
        //Monto < maximo de la cuenta
        //saldo + monto > maximo permitido
        //Validar que el monto sea una cantidad multiplo de 100

        //Buscar la cuenta
        Cuenta cuenta = this.buscarCuenta(numTarjeta);
        Object[] data = new Object[2]; //Objeto salida

        if (cuenta==null) { //si no existe
            System.out.println("La cuenta no existe!");
        } else if (monto < 0) {
            System.out.println("Cantidad negativa valida");
        } else if (!(monto % 100 == 0)) {
            System.out.println("Monto invalido. Debe ser multiplo de 100");
        } else if (monto >45500) {
            System.out.println("Cantidad excede el maximo permitido de la cuenta");
        } else if ((monto + cuenta.getSaldo()) > 45000) {
            System.out.println("Deposito no permitido, excede el maximo");
        } else {
            this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo() + monto);

            //Sin monto
            data[1] = new Ticket(this.getDireccion(), LocalDate.now(), monto, "DEPOSITO", this.folio++);
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
