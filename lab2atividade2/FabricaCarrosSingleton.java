package poo2.lab2atividade2;

public class FabricaCarrosSingleton {
    private static FabricaCarrosSingleton instance;

    private FabricaCarrosSingleton(){}

    public static FabricaCarrosSingleton getInstance(){
        if(instance == null){
            instance = new FabricaCarrosSingleton();
        }
        return instance;
    }

    public IVehicleMaker getIVehicleMaker(String fabricante){
        if(fabricante.equals("Toyota")){
            return new Toyota();
        }else if(fabricante.equals("Honda")){
            return new Honda();
        }else{
            return null;
        }
    }
}
