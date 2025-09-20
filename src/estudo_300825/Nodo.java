package estudo_300825;

public class Nodo {
    public int dado;
    Nodo anterior; //ou seja, meu nó vai armazenar um número inteiro (dado) e um nó de endereço.
    public Nodo proximo; //ou seja, meu nó vai armazenar um número inteiro (dado) e um nó de endereço.

    public Nodo(int elemento){ //cria a variável "elemento", que recebe dado.
        dado = elemento;
        anterior = null;
        proximo = null;
    }
}

