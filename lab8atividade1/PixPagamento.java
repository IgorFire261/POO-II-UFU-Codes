public class PixPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total) {
        System.out.println("Lógica para pagar com pix");
    }
    
}
