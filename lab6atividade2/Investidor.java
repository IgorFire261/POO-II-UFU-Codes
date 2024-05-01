package poo2.lab6atividade2;

public class Investidor implements Observer{
    private String nome;
    private double precoMax;
    private double precoMin;
    public Investidor(String nome, double precoMax, double precoMin) {
        this.nome = nome;
        this.precoMax = precoMax;
        this.precoMin = precoMin;
    }
    @Override
    public void update(Acao acao) {
        double preco = acao.getPreco();
        if(preco >= precoMax){
            System.out.println("As ações do investidor " + nome +" foram vendidas pois atingiu o limite "+ acao.getPreco());
        }else if(preco <= precoMin){
            System.out.println("O Investidor "+ nome + "Comprou mais ações de "+ acao.getPreco());
        }else{
            System.out.println("Ações: "+ acao.getPreco());
        }
        
    }

    
}
