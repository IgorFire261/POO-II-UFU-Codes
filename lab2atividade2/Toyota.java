package poo2.lab2atividade2;

public class Toyota implements IVehicleMaker{

    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals("Corolla")){
            return new ToyotaCorolla();        
        }else{
            return null;
        }
    }
    
}
