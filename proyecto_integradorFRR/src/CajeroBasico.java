import java.time.LocalDate;
import java.util.List;
import java.util.Queue;

public class CajeroBasico extends Atm implements IOperacionesBasicas{


    @Override
    public void retioSinTarjeta() {

    }


    @Override
    public Object[] retirar(String numTarjeta, double monto, String nip) {

        //Buscar la cuenta
        Cuenta cuenta = this.buscarCuenta(numTarjeta);
        Object[] data = new Object[2]; //objeto de salida

        /*if(cuenta != null){ //Si existe cuenta
            if(cuenta.getNip().equals(nip)){
                if(){
                    if(){

                    }

                }
            }
        }*/

        if (cuenta==null){
            System.out.println("La cuenta no existe");
        } else if (!cuenta.getNip().equals(nip)) {
            System.out.println("Nip es incorrecto");
        } else if (cuenta.getSaldo() <= monto) {
            System.out.println("Saldo insuficiente");
        } else if ((cuenta.getSaldo()-monto) <20000) {
            System.out.println("Retiro no disponible, excede el minimo de la cuenta");
        }
        else{//retirar
            //No se modifica cuenta directamente porque es una copia
            //cuenta.setSaldo(cuenta.getSaldo() - monto);

            //Se accede directamente a la cuenta en el array o BD y se modifica el saldo
            this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo()-monto);

            data[0]=monto;
            data[1] = new TIcket(this.getDireccion(), LocalDate.now(),monto,"Retiro",this.folio = this.folio+1);
        }

        return data;
    }

    @Override
    public TIcket pagarServicio(String numConvenio, double monto, String referencia) {
        return null;
    }
}
