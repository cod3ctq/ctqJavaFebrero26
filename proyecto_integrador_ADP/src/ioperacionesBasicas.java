public interface ioperacionesBasicas {
    // Este metodo devuelve un array de object: varios elementpos de diferente tipo de dato
     Object[] retirar(String numTarjeta, double monto, String nip);

     Ticket pagarServicio(String numConvenio, double monto, String referencia);


}
