package poo2.lab3atividade2;

public class Canela extends CafeDecorator{
    public Canela(Cafe cafe){
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 1.0;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + "com canela";
    }
    
}
