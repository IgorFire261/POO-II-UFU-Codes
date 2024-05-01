import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> items = new ArrayList<>();

    public void adicionaItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }

    public int calculaTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPreco();
        }
        return sum;
    }

    public int calculaFrete(String tipoFrete){
        int frete = 0;
        if(tipoFrete.equals("Sedex")){
            frete = 50;
        }else{
            frete = 25;
        }
        for(Item item : items){
            frete += item.getPreco();
        }
        return frete;
    }

    public void realizarPagamento(PagamentoStrategy strategy, String tipoFrete){
        int totalFrete = this.calculaFrete(tipoFrete) ;

        strategy.pagar(totalFrete);
    }
}
