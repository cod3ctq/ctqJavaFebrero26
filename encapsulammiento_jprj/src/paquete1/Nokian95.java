package paquete1;

public class Nokian95 extends Celular {

    String trasmisorFM;

    // Es clase  de nivel 2 del encapasulamiento respectoa la clase padre celular
    public Nokian95(String marca,String modelo,String transmisor){
        this.marca =marca;//Accesible dado que es publico
        this.modelo=modelo;//Accesible dado que es protegido
        this.trasmisorFM=transmisor;//Accesible dado que es miembro propio de esta clase hija
        //this.meotodoInalcansable(); No es accesible en este 2do nivel
        //this.material=material; no es accesisble en este 2do nivel. dado que es privado
    }


}
