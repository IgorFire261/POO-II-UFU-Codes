package poo2.lab5atividade1;

public class HomeTheaterFachada {
    Amplificador amp;
    Luzes l;
    Pipoca pipoca;
    Projetor proj;
    Telao t;
    Player player;
    public HomeTheaterFachada(Amplificador amp, Luzes l, Pipoca pipoca, Projetor proj, Telao t, Player player) {
        this.amp = amp;
        this.l = l;
        this.pipoca = pipoca;
        this.proj = proj;
        this.t = t;
        this.player = player;
    }
    public void assistirfilme(String filme){
        System.out.println("Preparando para um filme: ");
        pipoca.liga();
        pipoca.arrebentaPipoca();
        pipoca.desliga();
        l.desligar();
        t.abaixa();
        proj.liga();
        amp.liga();
        amp.ajustavolume(12);
        player.liga();
        player.play(filme);
    }
    public void fimfilme(){
        System.out.println("Desligando meu kit hometheater!");
    }
}
