import paquete1.Celular;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Celular c1 = new Celular();

    //Acceso directo a los atributos de un objeto
        // Aunque no marque error, es INCORRECTO manipular directamente los atributos del objeto.
    c1.marca = "Nokia";
    //c1.modelo = "E7"; Error porque es protegido
    //c1.material = "Aluminio"; Error porque es privado.

        //Forma correcta de manipular los atributos de un objeto: getter y setter
        //No importando si los atributos en cuestion son publicos, privados o protegidos.
        c1.setMarca("Sony");
        c1.setModelo("W995");
        c1.setMaterial("Policarbonato");


    }
}