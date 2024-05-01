package poo2.lab3atividade2;

public class Chocolate extends CafeDecorator{
    public Chocolate(Cafe cafe){
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 5.0;
    }

    @Override
    public String getDescricao() {
        return cafe.toString() + " com chocolate";
    }

    
}
