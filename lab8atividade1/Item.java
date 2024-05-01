public class Item {
    private int preco;
    private String nome;
    
    public Item(int preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
