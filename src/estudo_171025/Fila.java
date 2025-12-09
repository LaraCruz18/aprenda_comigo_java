package estudo_171025;
//a fila tem a estrutura FIFO (first in first out), ou seja, se um elemento for adicionado na lista primeiro, ele também vai sair primeiro.
public class Fila {
    int inicio; //para administrar o inicio, que são os elementos que vão sair.
    int fim; //onde vai ficar os elementos que vão ficar vão sendo adicionados.
    int[] vetor; //onde vai ficar os elementos.
    int n_elementos;

    //construtor:
    public Fila(int tamanhoFila){
        this.inicio = 0; //enquanto a fila estiver vazia, o "inicio" e "fim" apontam para zero.
        this.fim = 0;
        this.n_elementos = 0;
        this.vetor = new int[tamanhoFila]; //o tamanho do vetor vai ser determinado pelo tamanho que eu colocar no contrutor;
    }

    public void push(int elemento){
        if(n_elementos != vetor.length){ //checa se ainda tem espaço na fila.
            vetor[fim] = elemento ; //vou colocar o elemento na próxima posição livre, que está em fim.
            fim++;// e agora o fim vai aprontar para a próxima "casa" vazia.
            n_elementos++;
        }
    }

    public void pop(){
        if(!isEmpty()){ //se isEmpty é "true", !isEmpty é false.
            inicio++; //a posição do >inicio< vai avançar para a próxima posição. Isso significa que o primeiro da fila já foi atendido.
            n_elementos--; //o número de elementos diminui, já que uma posição já está livre
        } else{
            System.out.println("Já está vazia!");
        }
    }
    public boolean isEmpty(){
        if(n_elementos == 0){
            return true;
        }
        return false;
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println(vetor[inicio]);
        }
    }

    public void imprimir(){
        for (int i = inicio; i < inicio + n_elementos; i++) {//o i = início, já que é o primeiro elemento da fila.
            System.out.println(vetor[i]);
        }
    }


}
