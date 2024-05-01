package poo2.lab5atividade1;

public class Main {
    public static void main(String[] args) {
        Amplificador amp = new Amplificador();
        Luzes luzes = new Luzes();
        Pipoca pipoca = new Pipoca();
        Projetor proj = new Projetor();
        Player player = new Player();
        Telao telao = new Telao();

        HomeTheaterFachada hometheater = new HomeTheaterFachada(amp, luzes, pipoca, proj, telao, player);
        hometheater.assistirfilme("Inception");
    }
}
