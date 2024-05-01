package poo2.lab6atividade1;

public interface Sujeito {
    public void addObservers(Observer obs);

    public void removeObservers(Observer obs);

    public void notifyObservers();
}
