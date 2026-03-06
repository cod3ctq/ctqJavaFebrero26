public interface OperacionesBasicas {

    //Este metodo devuelve un array de objeto
    Object [] retirar(String numTarjeta, double monto, String nip);

    Ticket pagarServicio(String numConvenio, double monto, String referencia);

}
