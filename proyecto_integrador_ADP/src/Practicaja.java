import java.time.LocalDate;

public class Practicaja extends Atm implements ioperacionesBasicas, ioperacionesAvanzadas {
    @Override
    public void retirosintarjeta() {

    }

    @Override
    public Object[] depositar(String numTarjeta, double monto) {
        //Buscar la cuenta
        Cuenta cuenta = this.buscarCuenta(numTarjeta);
        Object[] data = new Object[2];
        if (cuenta == null) { // si no existe...
            System.out.println("La cuenta no existEEE");
        } else if (monto < 0) { //Validar que el monto sea una cantidad multiplo de 100**
            System.out.println("Cantidad negativa invalida");
        } else if (!(monto % 100 == 0)) {
            System.out.println("Monto invalido, Debe ser multiplo de 100");
        } else if (monto > 45000) { //45K mientras I
            System.out.println("Cantidad excede el maximo permitido de la cuenta");

        } else if ((monto + cuenta.getSaldo()) > 45000) {

            System.out.println("Deposito no permitido. Excede el maximo");
        } else {

            this.datebase.get(this.datebase.indexOf(cuenta)).setSaldo((cuenta.getSaldo()+monto));
            //[500, []]

            data[1]= new Ticket(this.getDireccion(), LocalDate.now(),monto,"Deposito",this.folio=this.folio+1);

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