public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionaItem(new Item(50, "Diário de um Banana"));
        carrinho.adicionaItem(new Item(800,"Nike revolution 7"));

        PagamentoStrategy strategy = new PixPagamento();

        carrinho.realizarPagamento(strategy,"Normal");
    }
}
