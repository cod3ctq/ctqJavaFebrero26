import java.time.LocalDate;

public class Practicaja extends Atm implements iOperacionesAvanzadas, OperacionesBasicas {
    @Override
    public void retiroSinTarjeta() {

    }

    @Override
    public Object[] depositar(String numTarjeta, double monto) {
        //Pasos para depositar
            //Paso 1: Buscar la cuenta
            //Paso 2: Validar que el monto sea negativo
            //Paso 3: Monto > máximo de la cuenta
            //Paso 4: Saldo + monto > maximo  permitido
            //Paso 5: Deposito

        Cuenta cuenta = this.buscarCuenta(numTarjeta);
        Object [] data = new Object[2]; //objeto salida
        if(cuenta==null) { //si no existe....
            System.out.println("La cuenta NO existe!");
        }else if (monto<0){
            System.out.println("Cantidad negativa inválida");
        }else if (! (monto%100==0)) {
            System.out.println("Monto inválido. Debe ser múltiplo de 100");
        } else if (monto > 450000) { //500k mientras
            System.out.println("Cantidad excede el maximo permitido de la cuenta");
        } else if ( (monto + cuenta.getSaldo()) > 450000) {
            System.out.println("Deposito no permitido. Excede el maximo");
        }else{
            //
            this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo()+monto);
            //Sin monto(cambio)
            data [1] = new Ticket(this.getDireccion(), LocalDate.now(), monto, "DEPOSITO", this.folio = this.folio+ 1);
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
