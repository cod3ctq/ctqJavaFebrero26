import java.time.LocalDate;
import java.time.LocalDateTime;

public class CajeroBasico extends Atm implements IOperacionesBasicas{
    @Override
    public void retiroSinTarjeta() {

    }

    @Override
    public Object[] retirar(String numTarjeta, double monto, String nip) {
        //Buscar la cuenta
        Cuenta cuenta = this.buscarCuenta(numTarjeta);
        Object[] data = new Object[2]; //Objeto salida
//        if (cuenta != null) { //Si existe
//            if (cuenta.getNip().equals(nip)) {//Validar el nip
//
//            }
//        }
        //Validar que el monto sea un multiplo de 100
        //
        //si no existe
        //Validar NIP
        //Validar que el monto sea menor que el saldo disponible
        //Validar que el (saldo - monto) > saldo minimo permitido
        //Retirar

        if (cuenta==null) { //si no existe
            System.out.println("La cuenta no existe!");
        } else if(!cuenta.getNip().equals(nip)) { //Validar NIP
            System.out.println("NIP es incorrecto");
        } else if (cuenta.getSaldo()<=monto) { //Validar que el monto sea menor que el saldo disponible
            System.out.println("Saldo insuficiente");
        } else if ((cuenta.getSaldo() - monto) < 2000) { //Validar que el (saldo - monto) > saldo minimo permitido
            System.out.println("Retiro no disponible, excede el minimo de la cuenta");
        } else { //retirar
            this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo() - monto);
        }

        data[0] = monto;
        //Ticket(String direccion, LocalDateTime fecha, String monto, String tipoOperacion, int folioOperacion)
        data[1] = new Ticket(this.getDireccion(), LocalDate.now(), monto, "RETIRO", this.folio++);
        //Validar que el monto sea un multiplo de 100
        return data;
    }

    @Override
    public Ticket pagarServicio(String numConvenio, double monto, String referencia) {
        return null;
    }
}
