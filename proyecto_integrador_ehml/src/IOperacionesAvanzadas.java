public interface IOperacionesAvanzadas {

    //ASI SOLO DEVOLVERIA EL TICKET, PERO
    //TIcket deposito(String numTarjeta, double monto);


    //PUEDE DEVOVLER CAMBIO, POR LO QUE ESTA OPCION DEVUELVE MAS DE UNA COSA
    Object[] deposito(String numTarjeta, double monto);

}
