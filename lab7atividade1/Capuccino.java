package poo2.lab7atividade1;

public class Capuccino extends BebidaTemplate{

    @Override
    void adicionaCondimentos() {
        System.out.println("Colocando Leite");
        
    }

    @Override
    void preparaBebida() {
        System.out.println("Esquentando o capuccino");
        
    }
    
}
