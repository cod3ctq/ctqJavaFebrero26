//POJO: Plain Old Java Object - Clase simple de Java
public class Cuenta {

    private int cuentaId;
    private String numTarjeta;
    private String titular;
    private String numCuenta;
    private int tipoCuentaId;
    private double saldo;
    private String nip; //temporal

    private Cuenta(){}

    public Cuenta(int cuentaId, String numTarjeta, String titular, String numCuenta, int tipoCuentaId, double saldo, String nip) {
        this.cuentaId = cuentaId;
        this.numTarjeta = numTarjeta;
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.tipoCuentaId = tipoCuentaId;
        this.saldo = saldo;
        this.nip = nip;
    }


    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getTipoCuentaId() {
        return tipoCuentaId;
    }

    public void setTipoCuentaId(int tipoCuentaId) {
        this.tipoCuentaId = tipoCuentaId;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "cuentaId=" + cuentaId +
                ", numTarjeta='" + numTarjeta + '\'' +
                ", titular='" + titular + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", tipoCuentaId=" + tipoCuentaId +
                ", saldo=" + saldo +
                ", nip='" + nip + '\'' +
                '}';
    }
}


