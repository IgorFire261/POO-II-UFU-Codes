package poo2.lab5atividade3;

public class ProxyThread implements Thread{
   private  ThreadReal threadReal;
    int cont=0;
    @Override
    public void adicionarThread() {
        if(verificarthread(cont)){
            threadReal = new ThreadReal();
            threadReal.adicionarThread();
            cont++;
        }else{
            System.out.println("Thread bloqueada, pois já se tem uma no processo");
        }
    }
    private boolean verificarthread(int cont){
        if(cont != 0){
            return false;
        }else{
            return true;
        }
    }
    
}
