package poo2.lab6atividade1;

public class Prefeitura implements Observer{

    @Override
    public void update(double temp, double umidade, double vento) {
        if(umidade < 20){
            System.out.println("Defesa civil alerta: umidade baixa!");
        }
        
    }
    
}
