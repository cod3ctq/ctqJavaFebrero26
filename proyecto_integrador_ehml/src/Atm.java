import java.util.List;

public abstract class Atm {

    //ATRIBUTOS
    String direccion;
    int id;
    static int folio = 0;
    List<Cuenta> database;


    //CONSTRUCTORES
    public Atm(){    }

    public Atm(String direccion, int id, int folio) {
        this.direccion = direccion;
        this.id = id;
        this.folio = folio;
    }

    //METODOS
    public List<Cuenta> getDataBase(){
        return database;
    }

    public void setDataBase(List<Cuenta> database){
        this.database = database;
    }

    //GETTER Y SETTER

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

    /*public void setFolio(int folio) {
        this.folio = folio;
    }*/


    //to string

    @Override
    public String toString() {
        return "Atm{" +
                "direccion='" + direccion + '\'' +
                ", id=" + id +
                ", folio=" + folio +
                '}';
    }


    //METODOS
    public Cuenta buscarCuenta (String numeroTarjeta){
        //BUSQUEDA DE LA CUETA POR EL NUMERO DE TARJETA
        Cuenta aux = null;
        for (Cuenta cuenta : this.database){
            if (cuenta.getNumTarjeta().equals(numeroTarjeta)){
                aux = cuenta;
                break;
            }
        }
        return aux;

    }

    public void consultarSaldo(String numTarjeta){
        Cuenta c = this.buscarCuenta(numTarjeta);
        if (c != null){
            System.out.println("Tu saldo es :" + c.getSaldo());
        }else{
           System.out.println("La cuenta no existe");
        }

    }

    public abstract void retiroSinTarjeta();

}
