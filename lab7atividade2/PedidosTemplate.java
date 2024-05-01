package poo2.lab7atividade2;
public abstract class PedidosTemplate {
    abstract void processarPagamento(int qtde_item, double valor, String formap);

    void entrega(){
        System.out.println("Decidindo se há entrega");
    }

    public void processarPedido(int qtde_item,double valor, String formap){
        processarPagamento(qtde_item, valor, formap);
        entrega();
    }
}
