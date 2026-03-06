import java.time.LocalDate;

public class Practicaja extends Atm implements IOperacionesBasicas,IOperacionesAvanzadas{


    @Override
    public void retiroSinTarjeta() {

    }

    @Override
    public Object[] depositar(String numTarjeta, double monto) {
        //Buscar la cuenta

        Cuenta cuenta = this.buscarCuenta(numTarjeta);
        Object[] data = new Object[2];//Objeto de salida

        //Validar que el monto sea una cantidad multiplo de 100**
        //Validar cuanto he retirado en la cuenta actual


        //Validar el nip
        //Validar que le monto sea menor que el saldo disponible
        //Validar que el (saldo - monto)  saldo minimo permitido
        //Retirar

        if (cuenta==null){//si no existe
            System.out.println("la cuenta no existe");
        } else if (monto<0) {
            System.out.println("cantidad negativa invalida ");
        } else if (!(monto%100==0)) {//validar que sea una cantidad multiplo de 100**
            System.out.println("monto invalido, debe ser multiplo de 100");
        } else if (monto>45000) {
            System.out.println("cantidad excede el maximo permitido de la cuenta");
        } else if ((monto + cuenta.getSaldo())>45000) {
            System.out.println("deposito no permitido. Excede el maximo");
        }else {

            this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo()+monto);

            //Sin monto(cuanto)
            data[1] = new Ticket(this.getDireccion(), LocalDate.now(),monto,"Deposito",this.folio = this.folio+1);

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
