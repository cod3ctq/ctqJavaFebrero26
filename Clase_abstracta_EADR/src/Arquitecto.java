public class Arquitecto extends Profesionista implements IMecanica{
    //Sobreescritura
    @Override// Metodo form 2: heredado u sobreescrito no usages
    public void trabajar(int horas){
        System.out.println("Disenar, creear maquetas, renders, supervisaer obra");
    }

}
