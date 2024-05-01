package poo2.lab2atividade2;

public class Honda implements IVehicleMaker{

    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals("Civic")){
            return new HondaCivic();
        }else{
            return null;
        }
    }
    
}
