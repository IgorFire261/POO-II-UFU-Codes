package poo2.lab3atividade2;

public class CafeDecorator implements Cafe{
    Cafe cafe;

    public CafeDecorator(Cafe cafe){
        this.cafe = cafe;
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto();
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }
    
    
}
