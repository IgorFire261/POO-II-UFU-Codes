package poo2.lab4atividade1;

public interface Pato  {
    public default void voar(){
        System.out.println("Pato está voando");
    }
    public default void grasnar(){
        System.out.println("Pato está grasnando.");
    }
}
