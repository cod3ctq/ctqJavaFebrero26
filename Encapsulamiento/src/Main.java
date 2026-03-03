import Paquete1.Celular;

public class Main {
    public static void main(String[] args){

        Celular cel = new Celular();
        //ACCESO DIRECTO A LOS ATRIBUTOS DE UN OBJETO

        //AUNQUE NO AMRQUE ERROR, ES INCORRECTO MANIPULAR MANERA DIRECTA
        //LOS ATRIBUTOS DEL OBJETO

        cel.marca = "Nokia";
        //cel.modelo = "E7";   -> ERROR POQUE ES PROTEGIDO
        //el.material = "Aluminio";  -> ERROR PORQUE ES PROVADO


        //FORMA CORRECTA DE MANIPULAR LOS ATRIBUTOS DE UN OBJETO
        //A TRAVEZ DE GETTERS Y SETTERS
        cel.setMarca("Nokia");
        cel.setModelo("W995");
        cel.setMaterial("Policarbonato");

        //CON EL USO DE LOS SETTER Y GETTER NO IMPORTA QUE TIPO DE MODIFICADOR DE ACCESO TENGA
        //EL ATRIBUTO, LOS SETEER Y GETTER SON PUBLICOS
    }
}
