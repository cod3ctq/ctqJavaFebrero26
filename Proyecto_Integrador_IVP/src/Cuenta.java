public class Cuenta {
	private int cuentaID;
	private String numTajeta;
	private String titular;
	private String NumCuenta;
	private int tipoCuentaID;
	private double saldo;
	private String nip;

	public Cuenta() {
	}

	public Cuenta(int cuentaID, String numTajeta, String titular, String numCuenta, int tipoCuentaID, double saldo, String nip) {
		this.cuentaID = cuentaID;
		this.numTajeta = numTajeta;
		this.titular = titular;
		NumCuenta = numCuenta;
		this.tipoCuentaID = tipoCuentaID;
		this.saldo = saldo;
		this.nip = nip;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public int getCuentaID() {
		return cuentaID;
	}

	public void setCuentaID(int cuentaID) {
		this.cuentaID = cuentaID;
	}

	public String getNumTajeta() {
		return numTajeta;
	}

	public void setNumTajeta(String numTajeta) {
		this.numTajeta = numTajeta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumCuenta() {
		return NumCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		NumCuenta = numCuenta;
	}

	public int getTipoCuentaID() {
		return tipoCuentaID;
	}

	public void setTipoCuentaID(int tipoCuentaID) {
		this.tipoCuentaID = tipoCuentaID;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta{" +
				"cuentaID=" + cuentaID +
				", numTajeta='" + numTajeta + '\'' +
				", titular='" + titular + '\'' +
				", NumCuenta='" + NumCuenta + '\'' +
				", tipoCuentaID=" + tipoCuentaID +
				", saldo=" + saldo +
				", nip='" + nip + '\'' +
				'}';
	}
}
