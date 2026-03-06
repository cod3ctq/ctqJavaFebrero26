
import java.util.List;
public abstract class Atm {

    String direccion;
    int id;
    static int folio = 0;

    //Base de datos

    List<Cuenta> database;

    public Atm(){
    }

    public Atm(String direccion, int id, int folio) {
        this.direccion = direccion;
        this.id = id;
        this.folio = folio;
    }

    public List<Cuenta> getDatabase() {
        return database;
    }

    public void setDatabase(List<Cuenta> database) {

        this.database = database;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getFolio() {
        return folio;
    }


    //metodos nativos
    public Cuenta buscarCuenta(String numTarjeta) {
        //Busqueda de la cuenta por numero de tarjeta
        Cuenta aux =null;
        for (Cuenta cuenta : this.database){

            if (cuenta.getNumTarjeta().equals(numTarjeta)) {
                aux = cuenta;
                break;

            }
    }
    return aux;
    }

    public void consultarSaldo(String numTarjeta){

        Cuenta c = this.buscarCuenta (numTarjeta);

            if (c!=null){

                System.out.println("Tu saldo es :" + c.getSaldo());
            }else {
                System.out.println("La cuenta no existe!!");

            }
    }

    public abstract void retiroSinTarjeta ();//se resolvera de manera distinta en las clases hijas




}
