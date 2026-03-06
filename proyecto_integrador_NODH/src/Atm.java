import java.util.List;

public abstract class Atm {
    private String direccion;
    private int id;
    protected static int folio = 1;
    protected List<Cuenta> database;

    public Atm() {

    }

    public Atm(String direccion, int id, int folio) {
        this.direccion = direccion;
        this.id = id;
        this.folio = folio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cuenta> getDatabase() {
        return database;
    }

    public void setDatabase(List<Cuenta> database) {
        this.database = database;
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

    //Metodos  Nativos
    public Cuenta buscarCuenta(String numeroTarjeta) {

        //Busqueda de  la cuenta por numero de tarjeta
        for (Cuenta cuenta : database) {
            if (cuenta.getNumeroTarjeta().equals(numeroTarjeta)) {
                return cuenta;
            }
        }
        return null;
    }

    //Metodos  Nativos
    public void consultarSaldo(String numeroTarjeta) {
        Cuenta cuenta = this.buscarCuenta(numeroTarjeta);

        System.out.println((cuenta != null) ? "Tu saldo es: " + cuenta.getSaldo() : "La cuenta no existe");
    }

    public abstract void retiroSinTarjeta(); //Se resolvera de manera distinta en la clase hijas
}
