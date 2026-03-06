public interface IOperacionesBasicas {

    //METODOS INCIAL, PERO SOLO DEVUELVE COSA
    //double retirar(String numTarjeta, double monto, String nip);

    //metodo mejorado, PARA DEVOLVER 2 COSAS
    Object [] retirar (String numTarjeta, double monto, String nip);



    Ticket pagarServicio(String numConvenio, double monto, String referencia);
}
