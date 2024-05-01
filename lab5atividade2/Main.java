package poo2.lab5atividade2;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        Porta porta = new Porta();
        Farol farol = new Farol();
        Radio radio = new Radio();
        Cinto cinto = new Cinto();

        CarroFachada carroFachada = new CarroFachada(cinto, farol, motor, porta, radio);
        carroFachada.dirigirCarro();
        carroFachada.finalizarCarro();
    }
}
