package poo2.lab4atividade1;

public class PatoWrapper implements Pato {
    private Pato pato;
    PatoWrapper(Pato pato){
        this.pato = pato;
    }
    public void voar(){
        pato.voar();
    }
    public void emitirSom(){
        pato.grasnar();
    }
}
