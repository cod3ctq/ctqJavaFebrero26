import paquete1.Celular;

public class Main {
    public static void main(String[] args) {
        Celular c1 = new Celular();

        //Acceso directo a los atributos de un objeto
        c1.marca = "Nokia"; //Aunque no marque error es INCORRECTO manipular directamente los atributos del objeto
        //c1.modelo = "E7"; //Error por que es protegido
        //c1.material = "Aluminio"; //Error pórque es privado

        //Forma correcta de manipular los atributos de un objeto; Getters y setters
        //No importando si los atrivutos en cuestion son publicos, privados o protegidos
        c1.setMarca("Sony");
        c1.setModelo("W995");
        c1.setMaterial("Policarbonato");
    }
}