package poo2.lab5atividade2;

public class CarroFachada {
    Cinto c;
    Farol f;
    Motor m;
    Porta p;
    Radio r;

    public CarroFachada(Cinto c, Farol f, Motor m, Porta p, Radio r) {
        this.c = c;
        this.f = f;
        this.m = m;
        this.p = p;
        this.r = r;
    }

    public void dirigirCarro(){
        m.ligar();
        p.trancar();
        c.travarCinto();
        f.ligar();
        r.ligar();
        r.sintonizar(98.7);

    }

    public void finalizarCarro(){
        m.desligar();
        p.destrancar();
        c.destravarCinto();
        f.desligar();
        r.desligar();
    }
    
}
