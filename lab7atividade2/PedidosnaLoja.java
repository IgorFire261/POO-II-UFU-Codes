package poo2.lab7atividade2;

public class PedidosnaLoja extends PedidosTemplate{

    @Override
    void entrega() {
        System.out.println("Não existe entrega para pedidos na loja");
    }

    @Override
    void processarPagamento(int qtde_item, double valor, String formap) {
        System.out.println("Processando pagamento para pedidos online");
        System.out.println("Quantidade de itens: " + qtde_item);
        System.out.println("Valor por item: R$" + valor);
        System.out.println("Forma de pagamento: " + formap);
        
    }
    
}
