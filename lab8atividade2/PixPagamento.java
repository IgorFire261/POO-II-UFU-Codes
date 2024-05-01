public class PixPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total) {
        System.out.println("Pagando com Pix o valor de R$" + total);
    }
    
}
