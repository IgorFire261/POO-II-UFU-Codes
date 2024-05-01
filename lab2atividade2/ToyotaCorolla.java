package poo2.lab2atividade2;

public class ToyotaCorolla implements IVehicle{

    @Override
    public void drive() {
        System.out.println("Corolla está sendo dirigido.");
        
    }

    @Override
    public void start() {
        System.out.println("Corolla foi ligado.");
        
    }

    @Override
    public void stop() {
        System.out.println("Corolla parou.");
        
    }
    
}
