package poo2.lab6atividade2;

import java.util.ArrayList;

public class Acao {
    private String nome;
    private double preco;
    private ArrayList<Observer> observers = new ArrayList<>();
    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void addObserver(Observer obs){
        observers.add(obs);
    }
    public void removeObserver(Observer obs){
        observers.remove(obs);
    }
    private void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(this.preco != preco){
            this.preco = preco;
            notifyObservers();
        }
    }
    
}
