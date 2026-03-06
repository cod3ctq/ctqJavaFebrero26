import java.time.LocalDate;

public class Cajerobasico extends Atm implements IOperacionesBasicas{

    private int getFolio;

    @Override
    public void retiroSinTarjeta() {

    }

    @Override
    public Object[] retirar(String numTarjeta, double monto, String nip) {
            //Buscar cuenta
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
            } else if ( ! cuenta.getNip().equals(nip)){
                System.out.println("Nip es incorrecto ");
            } else if (cuenta.getSaldo()<monto) {
                System.out.println("saldo insuficiente");
            } else if ( (cuenta.getSaldo()-monto) <  2000){
                System.out.println("Retiro no disponible,exede el minimo de la cuenta");
            }else {//retirar
                //
                this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo()-monto);
                //[500, []]
                data[0] = monto;
                data[1] = new Ticket(this.getDireccion(), LocalDate.now(),monto,"Retiro",this.folio = this.folio+1);

            }

        return data;
    }

    @Override
    public Ticket pagarServicio(String numConvenio, double monto, String referencia) {
        return null;
    }
}
