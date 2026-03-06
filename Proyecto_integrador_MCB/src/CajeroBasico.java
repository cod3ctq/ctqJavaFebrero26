import java.time.LocalDate;

public class CajeroBasico extends Atm implements OperacionesBasicas {


    @Override
    public void retiroSinTarjeta() {

    }


    @Override
    public Object[] retirar(String numTarjeta, double monto, String nip) {
        //Buscar la cuenta
        Cuenta cuenta = this.buscarCuenta(numTarjeta);

        Object [] data = new Object[2]; //objeto salida

        //Falta:
            //Validar que el monto sea una cantidad multiplo de 100 * *
            //Calidar cuanto he retirado en la fecha actual

        if(cuenta==null) { //si no existe....
            System.out.println("La cuenta NO existe!");
        }else if(! cuenta.getNip().equals(nip) ){
            System.out.println("Nip es incorrcto");
        } else if (cuenta.getSaldo()<=monto){
            System.out.println("Saldo insuficiente");
        }else if((cuenta.getSaldo()-monto)< 2000){ //2000 mientras
            System.out.println("Retiro no disponible, excede el mínimo de la cuenta");
        }else{ //Retiro

            this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo()-monto);

            //[500, []  ]
            data [0] = monto;
            data [1] = new Ticket(this.getDireccion(), LocalDate.now(), monto, "Retiro", this.folio = this.folio+ 1);
        }

        return data;
    }

    @Override
    public Ticket pagarServicio(String numConvenio, double monto, String referencia) {
        return null;
    }
}
