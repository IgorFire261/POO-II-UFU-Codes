package poo2.lab3atividade2;

public class Cafeteria {
    public static void main(String[] args) {
        Cafe expresso = new Espresso();
        Cafe ex = new Leite(expresso);
        Cafe descafe = new Decaf();
        Cafe dCafe = new Canela(descafe);
        Cafe expresso2 = new Espresso();
        Cafe ex2 = new Chocolate(expresso2);

        System.out.println(ex.getDescricao());
        System.out.println("Preço: "+ ex.calculaCusto());
        System.out.println(dCafe.getDescricao());
        System.out.println("Preço: "+ dCafe.calculaCusto());
        System.out.println(ex2.getDescricao());
        System.out.println("Preço: "+ ex2.calculaCusto());
    }
}
