package lab8atividade3;

public interface Visitor {
    void visit(Carro carro);
    void visit(Onibus onibus);
    void visit(Bicicleta bicicleta);
}
