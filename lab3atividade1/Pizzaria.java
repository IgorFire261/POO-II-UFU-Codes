package poo2.lab3atividade1;

public class Pizzaria {
    public static void main(String[] args) {
        Pizza massaFina = new MassaFinaPizza();
        Pizza mar = new Ovo(massaFina);

        System.out.println(mar.custo());
        System.out.println(mar.getDescricao());
    }
}
