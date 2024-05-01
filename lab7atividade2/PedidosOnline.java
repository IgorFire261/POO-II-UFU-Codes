package poo2.lab7atividade2;

import java.util.Scanner;

public class PedidosOnline extends PedidosTemplate {

    @Override
    void processarPagamento(int qtde_item, double valor, String formap) {
        System.out.println("Processando pagamento para pedidos online");
        System.out.println("Quantidade de itens: " + qtde_item);
        System.out.println("Valor por item: R$" + valor);
        System.out.println("Forma de pagamento: " + formap);
        
    }
    
    @Override
    void entrega() {
        Scanner sc = new Scanner(System.in);
        String endereco;
        System.out.println("Digite o endereço de entrega: ");
        endereco = sc.nextLine();
        System.out.println("Endereço de entrega:" + endereco);
        //sc.close();
    }
}
