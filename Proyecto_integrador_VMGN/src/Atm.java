import java.util.List;

public abstract class Atm {

    String dirrecion;
    int id;
     static int folio=0;


    //base de datos
    List<Cuenta> database;


    public Atm() {
    }


    public Atm(String dirrecion, int id, int folio) {
        this.dirrecion = dirrecion;
        this.id = id;
        this.folio = folio;
    }

    public List<Cuenta> getDatabase() {
        return database;
    }

    public void setDatabase(List<Cuenta> database) {
        this.database = database;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  static int getFolio() {
        return folio;
    }

    //Metodos nativos, forma1
    public Cuenta buscarCuenta(String numTarjeta) {

        //Busqueda de la ecuenta por numero de trajeta
        Cuenta aux = null;
        for (Cuenta cuenta : this.getDatabase()) {
            if (cuenta.getNumTarjeta().equals(numTarjeta)) {
                aux = cuenta;
                break;
            }
        }


        return aux;

    }

    public void consultarSaldo(String numTarjeta) {
       Cuenta c=this.buscarCuenta(numTarjeta);
        if (c!=null){
            System.out.println("Tu saldo es: "+ c.getSaldo());
        }else{
            System.out.println("La cuenta no existe");
        }


    }

    public abstract void retiroSinTarjeta(); //Se resolvera de manera distinta en las clases hijas


}
