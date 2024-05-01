package poo2.lab2atividade1;

public class Main {
    public static void main (String [] args){
        FabricanteCelular fabricante = FabricaCelularSingleton.getInstance();
        Celular galaxy = fabricante.constroiCelular("Galaxy");
        galaxy.fazLigacao();
        galaxy.tiraFoto();
        Celular iphone = fabricante.constroiCelular("Iphone");
        iphone.fazLigacao();
        iphone.tiraFoto();
    }
}
