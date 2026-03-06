//POJO: Plain Old Java Object - Clase simple de java
public class Cuenta {
    private int cuentaId;
    private String titular;
    private String numeroCuenta;
    private int tipoCuentaId;
    private String numeroTarjeta;
    private double saldo;
    private String nip; //Esto es temporal

    public Cuenta() {

    }

    public Cuenta(int cuentaId, String numeroTarjeta, String titular, String numeroCuenta, int tipoCuentaId, double saldo, String nip) {
        this.cuentaId = cuentaId;
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuentaId = tipoCuentaId;
        this.saldo = saldo;
        this.nip = nip;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
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
                ", titular='" + titular + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", tipoCuentaId=" + tipoCuentaId +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                ", saldo=" + saldo +
                ", nip='" + nip + '\'' +
                '}';
    }
}
