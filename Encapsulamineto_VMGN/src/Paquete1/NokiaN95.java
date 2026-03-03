package Paquete1;

public class NokiaN95 extends Celular{
    String transmisorFM;


    //ESTA CLASE ES EL NIVEL 2 DEL ENCAPSULAMIENTO RESPECTO A LA CLASE PADRE CELULAR
    //CLASE DEL MISMO PAQUETE
    public NokiaN95(String marca,String modelo,String transmisorFM){
        this.marca=marca;  //ACCESIBLE DADO QUE ES PUBLICO
        this.modelo=modelo; //ACCESIBLE DADO QUE ES PROTEGIDO
        this.transmisorFM=transmisorFM; //ACCESIBLE DADO QUE ES UN MIEMBRO PROPIO DE LA MISMA CLASE HIJA
        //this.material=material; //NO ES CCESIBLE DADO QUE ES PRIVADO
    }



















}
