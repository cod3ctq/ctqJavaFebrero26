import java.util.ArrayList;
import java.util.List;

public abstract class Atm {
    String direccion;
    int id;
    static int folio=0;


    //Simulacion de BD
    List<Cuenta> database;




    public Atm(){}

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getFolio() {
        return folio;
    }


    //Metodos definidos aqui porque cualquier clase hija puede hacer estas acciones
    public Cuenta buscarCuenta(String numTarjeta){
        Cuenta cuenta =null;

        for (Cuenta c: database){
            if(c.getNumTarjeta().equals(numTarjeta)){
                System.out.println(c);
                cuenta = c;
            }
        }

        return cuenta;
    }

    public void consultarSaldo(String numTarjeta){
        Cuenta c = buscarCuenta(numTarjeta);

        if(c != null){
            System.out.println("Tu saldo es: "+c.getSaldo());

        }else {
            System.out.println("La cuenta no existe!!!");
        }
    }

    //Se resolvera de maneras distita en las clases hijas
    public abstract void retioSinTarjeta();

    public void setDatabase(List<Cuenta> cuentas) {
        this.database = cuentas;
    }
}
