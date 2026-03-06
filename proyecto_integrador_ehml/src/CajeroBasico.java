import java.time.LocalDate;

public class CajeroBasico extends Atm implements IOperacionesBasicas {

    public void retirarSinTarjeta(){}

    @Override
    public Object[] retirar(String numTarjeta, double monto, String nip) {
        //BUSCAR LA CUENTA
        Cuenta cuenta = this.buscarCuenta(numTarjeta);

        Object[] data = new Object[2]; // OBEJTO SERA LA SALIDA DE ESTE METODO

        if(cuenta==null){
            System.out.println("La cuenta no existe");
        }else if (! cuenta.getNip().equals(nip) ){
            System.out.println("Nip invalido");
        }else if (cuenta.getSaldo()< monto ){
            System.out.println("Saldo insuficiente");
        }else if ( (cuenta.getSaldo()-monto) < 2000 ){
            System.out.println("Excede el limite");
        }else{   //YA ES POSIBLE RETIRAR
            this.database.get(this.database.indexOf(cuenta)).setSaldo(cuenta.getSaldo() - monto);
            data[0] = monto;

            data[1] = new Ticket(this.getDireccion(), LocalDate.now(), monto, "RETIRO",this.folio++);
        }

        //VALIDAR QUE EL MONTO SEA UNA CANTIDAD MULTIPLO DE 100
        return data;
    }

    @Override
    public Ticket pagarServicio(String numConvenio, double monto, String referencia) {
        return null;
    }

    @Override
    public void retiroSinTarjeta() {

    }
}
