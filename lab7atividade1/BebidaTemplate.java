package poo2.lab7atividade1;

public abstract class BebidaTemplate {
    public void aqueceAgua(){
        System.out.println("Aquecendo água");
    }

    public void colocaXicara(){
        System.out.println("Colocando Xícara");
    }

    abstract void preparaBebida();

    abstract void adicionaCondimentos();

    public void preparaPedido(){
        aqueceAgua();
        preparaBebida();
        colocaXicara();
        adicionaCondimentos();
    }
}
