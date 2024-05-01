package poo2.lab6atividade1;

import java.util.ArrayList;

public class CET implements Sujeito{
    private ArrayList<Observer> observers;

    private double temperatura;
    private double umidade;
    private double vento;

    public CET(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObservers(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temperatura, umidade, vento);
        }
        
    }

    @Override
    public void removeObservers(Observer obs) {
        observers.remove(obs);
        
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;

        notifyObservers();
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;

        notifyObservers();
    }

    

    
}
