import java.time.LocalDate;

public class PractiCaja extends  Atm implements IOperacionesBasicas, IOperacionesAvanzadas{

    @Override
    public void retioSinTarjeta() {

    }

    @Override
    public Object[] depositar(String numTarjeta, double monto) {

        //Buscar cuenta
        Cuenta cuenta = this.buscarCuenta(numTarjeta);
        Object[] data = new Object[2];

        if(cuenta == null){
            System.out.println("La cuenta no existe");
        }
        else if (monto<0){
            System.out.println("Cantidad negativa invalida");
        } else if(!(monto%100 ==0)) {
            System.out.println("Monto invalido, debe ser multiplo de 100");

        } else if (monto>45000) {
            System.out.println("Cantidad exede el monto maximo permitido de la cuenta");
        } else if ((monto + cuenta.getSaldo()) > 45000) {
            System.out.println("Deposito no permitido. Excede el maximo");
        }else {
            this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo()+monto);
            //sin cambio
            data[1] = new TIcket(this.getDireccion(), LocalDate.now(),monto,"Deposito",this.folio = this.folio+1);
        }

        return data;
    }

    @Override
    public Object[] retirar(String numTarjeta, double monto, String nip) {
        return new Object[0];
    }

    @Override
    public TIcket pagarServicio(String numConvenio, double monto, String referencia) {
        return null;
    }
}
