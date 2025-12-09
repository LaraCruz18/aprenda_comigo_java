package estudo_171025;
//a estrutura pilha é LIFO, o último que for inserido, é o primeiro a sair.
public class Pilha {
    int topo;
    int n_elementos;
    int[] vetor;

    public Pilha(int tamanhoPilha){
        this.n_elementos = 0;
        this.topo = 0;
        this.vetor = new int[tamanhoPilha];
    }

    public boolean isEmpty(){
        if(n_elementos == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(n_elementos == vetor.length){
            return true;
        }
        return false;
    }

    public void push(int elemento){
        if(!isFull()){
            vetor[topo] = elemento;
            topo++;
            n_elementos++;
        }else{
            System.out.println("Está cheia");
        }
    }

    public void pop(){
        if(!isEmpty()){
            topo--;
            n_elementos--;
        } else{
            System.out.println("Já está vazia");
        }
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println(vetor[topo - 1]); //já que "topo" aponta para a última posição, daria 0. Por isso coloquei "-1", para trazer a posição preenchida.
        }
    }


    public void imprimir(){
        for (int i = 0; i < topo; i++) {
            System.out.println(vetor[i]);
        }
    }

}
