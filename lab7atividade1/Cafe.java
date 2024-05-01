package poo2.lab7atividade1;

public class Cafe extends BebidaTemplate{

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando açúcar");
        
    }

    @Override
    void preparaBebida() {
        System.out.println("Adicionando o pó do café");
        
    }
    
}
