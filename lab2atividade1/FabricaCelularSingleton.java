package poo2.lab2atividade1;

public class FabricaCelularSingleton implements FabricanteCelular {
    private static FabricaCelularSingleton instance;
    private FabricaCelularSingleton(){

    }
    public static FabricaCelularSingleton getInstance(){
        if(instance == null){
            instance = new FabricaCelularSingleton();
        }
        return instance;
    }

    @Override 
    public Celular constroiCelular(String modelo){
        if("Galaxy".equalsIgnoreCase(modelo)){
            return new Galaxy();
        }else if("Iphone".equalsIgnoreCase(modelo)){
            return new Iphone();
        }else{
            System.out.println("Modelo desconhecido "+ modelo );
            return null;
        }
    }
    
}
