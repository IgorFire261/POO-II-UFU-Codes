package poo2.lab6atividade2;

public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao("Magazine Guanabara", 44.90);

        Investidor invest1 = new Investidor("Nicolly Ribeiro", 90.5, 120.0);
        Investidor invest2 = new Investidor("Enzo Web", 95.6, 110.0);

        acao.addObserver(invest1);
        acao.addObserver(invest2);

        acao.setPreco(30);
        acao.setPreco(130.0);

    }
}
