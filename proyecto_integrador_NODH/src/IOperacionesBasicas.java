public interface IOperacionesBasicas {
    Object[] retirar(String numTarjeta, double monto,String nip);

    Ticket pagarServicio(String numConvenio, double monto, String referencia);
}
