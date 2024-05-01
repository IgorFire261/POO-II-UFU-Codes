package poo2.lab4atividade1;

public class PavaoWrapper implements Pavao {
    private Pavao pavao;
    PavaoWrapper(Pavao pavao){
        this.pavao = pavao;
    }
    public void emitirSom(){
        pavao.cantar();
    }
    public void voar(){
        System.out.println("Pavão não voa");
    }
}
