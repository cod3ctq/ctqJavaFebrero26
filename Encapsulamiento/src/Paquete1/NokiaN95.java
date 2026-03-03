package Paquete1;

public class NokiaN95 extends Celular{

    String trasnmisorFM;

    public NokiaN95 (){

    }


    //ESTA CLASE ES EL NIVEL 21 DEL ENCAPSULAMIENTO, RESPECTO A LA CLASE PADRE
    //CLASE DEL MISMO PAQUETE
    public NokiaN95(String trasnmisorFM, String modelo, String marca){
        this.trasnmisorFM = trasnmisorFM; // ACCESIBLE DADO QUE ES UN ATRIBUTO PROPIO DE LA CLASE ACTUAL
        this.modelo = modelo; // ACCESIBLE DADO QUE ES PROTEGIDO
        this.marca = marca;   //ACCESIBLE DADO QUE ES PUBLICO
    }

}
