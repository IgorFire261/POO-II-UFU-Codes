package poo2.lab3atividade2;

public class Decaf implements Cafe{

    @Override
    public double calculaCusto() {
        return 12.0;
    }

    @Override
    public String getDescricao() {
        return "Café descafeínado ";
    }
    
}
