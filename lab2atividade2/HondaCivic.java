package poo2.lab2atividade2;

public class HondaCivic implements IVehicle{

    @Override
    public void drive() {
        System.out.println("Civic está sendo dirigido.");
        
    }

    @Override
    public void start() {
        System.out.println("Civic ligou.");
        
    }

    @Override
    public void stop() {
        System.out.println("Civic parou.");
        
    }
    
}
