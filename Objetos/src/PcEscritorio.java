public class PcEscritorio {
    String mouse;
    public PcEscritorio(){}
    public PcEscritorio(String marca, int ram, int almacenamiento, String sistemaOperativo, String mouse){
        super(marca, ram, almacenamiento,);
        //metodo le pretenece a la clase hija y solo a ella
        //lase padre no tiene acceso a este metodo
        public void accionUno(){

        }
        //rescritura manual: Reemplazar la logica de un metodo heredado
          // Indica la sobrecritura
        public void reproducirMusica(){

        }
        System.out.orintln('Abrir spotify, reanudar reproduccion');
    }
}
