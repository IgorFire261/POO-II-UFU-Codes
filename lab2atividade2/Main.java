package poo2.lab2atividade2;

public class Main {
    public static void main(String[] args) {
        FabricaCarrosSingleton fabrica = FabricaCarrosSingleton.getInstance();

        IVehicleMaker Toyota = fabrica.getIVehicleMaker("Toyota");
        IVehicle ToyotaCorolla = Toyota.makeVehicle("Corolla");
        ToyotaCorolla.start();
        ToyotaCorolla.drive();
        ToyotaCorolla.stop();
        
        IVehicleMaker Honda = fabrica.getIVehicleMaker("Honda");
        IVehicle hondaCivic = Honda.makeVehicle("Civic");
        hondaCivic.start();
        hondaCivic.drive();
        hondaCivic.stop();
    }
}
