public class CartaoPagamento implements PagamentoStrategy{

    @Override
    public void pagar(int total) {
        System.out.println("Pagando copm cartão o valor de R$" + total);
    }
    
    
}
