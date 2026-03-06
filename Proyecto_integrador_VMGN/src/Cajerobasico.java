import java.time.LocalDate;
import java.util.List;

public class Cajerobasico extends Atm implements IOperacionesBasicas {


    @Override
    public void retiroSinTarjeta() {
    }

    @Override
    public Object[] retirar(String numTarjeta, double monto, String nip) {
        Cuenta cuenta = this.buscarCuenta(numTarjeta);

        Object[] data = new Object[2]; //Objeto de salida

        //Validar nip
        //validar que el monto sea menor que el saldo disponoble
        //Validar que (saldo-monto)>saldo minimo permitido
        //retirar
        if (cuenta == null) {
            System.out.println("La cuenta no existe!");
        } else if (!cuenta.getNip().equals(nip)) {
            System.out.println("Nip es incorrecto");
        } else if (cuenta.getSaldo() <= monto) {
            System.out.println("Saldo insuficiente");
        } else if ((cuenta.getSaldo() - monto) < 2000) {
            System.out.println("Retiro no disponible, excede el minimo");
        } else { //retirar
            this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo() - monto);
            //[500,[] ]
            data[0] = monto;
            data[1] = new Ticket(this.getDirrecion(), LocalDate.now(), monto, "RETIRO", ++this.folio);

        }
        return data;
    }

    @Override
    public Ticket pagarServicio(String numConvenio, double monto, String referencia) {
        return null;
    }


    //




}
