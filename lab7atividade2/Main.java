package poo2.lab7atividade2;
public class Main {
    public static void main(String[] args) {
        PedidosOnline pedidosOnline = new PedidosOnline();
        PedidosCripto pedidosCripto = new PedidosCripto();
        PedidosnaLoja pedidosnaLoja = new PedidosnaLoja();
        
        pedidosOnline.processarPedido(5, 10, "Cartão");
        pedidosnaLoja.processarPedido(20, 1, "Dinheiro");
        pedidosCripto.processarPedido(2, 30, "Bitcoin");
    }
}
