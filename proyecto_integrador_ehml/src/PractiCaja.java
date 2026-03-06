import javax.swing.text.DefaultEditorKit;
import java.time.LocalDate;

public class PractiCaja extends Atm implements IOperacionesBasicas, IOperacionesAvanzadas {
    @Override
    public void retiroSinTarjeta() {

    }

    @Override
    public Object[] deposito(String numTarjeta, double monto) {

        Cuenta cuenta = this.buscarCuenta(numTarjeta);
        Object[] data = new Object[2];

        if ( cuenta == null ){
            System.out.println("La cuenta no existe");
        }else if ( monto < 0){
            System.out.println("Cantidad negativa -- invalido");
        }else if ( ! (monto %100==0) ){
            System.out.println("Monto invalido. Debe ser multiplo de 100");
        }else if ( monto > 45000){
            System.out.println("Cantidad Exzcede Maximo Permitido");
        }else if ( monto + cuenta.getSaldo() > 45000){
            System.out.println("Deposito no permitido. excede el maximo");
        }else{

            this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo() + monto);

            data[1] = new Ticket(this.getDireccion(), LocalDate.now(), monto, " Deposito ",this.folio++);
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
