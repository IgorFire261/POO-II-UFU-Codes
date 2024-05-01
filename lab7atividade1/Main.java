package poo2.lab7atividade1;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        Capuccino capuccino = new Capuccino();
        Cha cha = new Cha();
        
        cafe.preparaPedido();
        capuccino.preparaPedido();
        cha.preparaPedido();
    }
}
