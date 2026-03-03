package paquete1;

public class NokiaN95 extends Celular {

    String transmisorFM;

    //Esta clase es nivel 2 del encapsulamiento respecto a la clase padre Celular
    //Clase del mismo paquete
    public NokiaN95(String marca, String modelo, String transmisor){
        this.marca = marca;  //Accesible dado que es publico
        this.modelo = modelo; //Accesible dado que es protegido
        this.transmisorFM = transmisor; //Accesible dado que es un miembro propio de una clase hija
        //this.material = material; No es accesible en este 2do nivel, dado que es privado
        //this.metodoInalcanzable; Miembro privado no alcanzable fuera de la clase


    }


}
