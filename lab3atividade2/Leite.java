package poo2.lab3atividade2;

public class Leite extends CafeDecorator{
    public Leite(Cafe cafe){
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 2.0;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + "com leite";
    }
    
}
