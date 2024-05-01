package poo2.lab7atividade2;
import java.util.Scanner;
public class PedidosCripto extends PedidosTemplate{

    @Override
    void entrega() {
        Scanner sc = new Scanner(System.in);
        String endereco;
        System.out.println("Digite o endereço de entrega: ");
        endereco = sc.nextLine();
        System.out.println("Endereço de entrega:" + endereco);
        sc.close();
    }

    @Override
    void processarPagamento(int qtde_item, double valor, String formap) {
        System.out.println("Processando pagamento para pedidos online");
        System.out.println("Quantidade de itens: " + qtde_item);
        System.out.println("Valor por item: R$" + valor);
        System.out.println("Criptomoedas aceitas: \nBitcoin \nEthereum");
        if(formap.equals("Bitcoin")){
            System.out.println("Pagando com Bitcoin");
        }else if(formap.equals("Ethereum")){
            System.out.println("Pagando com ethereum");
        }else{
            System.out.println("Criptomoeda não aceita");
        }
        
    }
    
}
