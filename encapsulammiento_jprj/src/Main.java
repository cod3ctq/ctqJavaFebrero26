
//ENCAPSULAMIENTO
//Es el mecanismo para controlar la visibilidad y el acceso de los miembros de una clase
//ademas que expone la funcionalidad ocultando los detalles.
//Se aplica a traves de 3 modificadores de acceso
//Public-----------Protected---------------Private

import paquete1.Celular;

public class Main {
    public static void main(String[] args) {

        Celular c1= new Celular();

        //Acceso directo a los atributos de un objeto
        //Aunque no marque error es incorrecto acceder manipular idrectamnet e los atributos del objeto
        c1.marca ="nokia";
        //c1.modelo ="e7" Error porque es protegido
        //c1.material="alumnio" Error porque es privado

        //Forma correcta de manipular los atributos de un objeto:
        //siempre a traves de getter y setters
        //NO importando si los atributos en cuestion son publicos, privados, o protegidos
        c1.setMarca("sony");
        c1.setModelo("2ae");
        c1.setMaterial("plastico");


    }
}