package poo2.lab4atividade1;

public interface Ave {
    public default void voar(){
        System.out.println("Ave está voando");
    }
    public default void emitirSom(){
        System.out.println("Ave está emitindo Som");
    }
}
