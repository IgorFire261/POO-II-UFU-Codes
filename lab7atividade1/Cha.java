package poo2.lab7atividade1;

public class Cha extends BebidaTemplate{

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando saquinho de chá");
        
    }

    @Override
    void preparaBebida() {
        System.out.println("Esquentando chá");
        
    }
    
}
