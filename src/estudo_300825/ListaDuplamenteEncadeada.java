package estudo_300825;

public class ListaDuplamenteEncadeada {
    int n_elementos;
    Nodo primeiro;
    Nodo ultimo;

    public ListaDuplamenteEncadeada (){
        int n_elementos = 0;
        Nodo primeiro = null;
        Nodo ultimo = null;
    }

    public void addUltimo(int elemento){
        Nodo novoNodo = new Nodo(elemento);
        if(n_elementos == 0){
            primeiro = novoNodo;
            ultimo = novoNodo;
        }else{
            ultimo.proximo = novoNodo; //o endereço do ultimo vai apontar pro "novoNodo".
            novoNodo.anterior = ultimo;//e o "novoNodo" vai apontar pro ultimo, já que é duplamente encadeado.
            ultimo = novoNodo;
        }
        n_elementos++;
    }

    public void imprimirLista(){
        Nodo atual = primeiro;
        while (atual != null){
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }

    //Questão 5 – Lista Duplamente Encadeada
    //
    //Enunciado:
    //Implemente o métodos addPrimeiro(int elemento) que insere um nó no início da lista duplamente encadeada.
    //
    //Pistas:
    //Crie novoNodo.
    //novoNodo.proximo = primeiro.
    //primeiro.anterior = novoNodo (se primeiro não for null).
    //Atualize primeiro e ultimo se necessário.

    public void addPrimeiro(int elemento){
        Nodo novoNodo = new Nodo(elemento);
        if(n_elementos == 0){
            primeiro = novoNodo;
            ultimo = novoNodo;
        } else{
            novoNodo.proximo = primeiro; //o proximo nodo vai ser o que era o "primeiro" antigamente.
            primeiro = novoNodo;
        }
    }


    //Questão 6 – Lista Duplamente Encadeada
    //
    //Enunciado:
    //Implemente um métodos removerUltimo() que remova o último elemento da lista duplamente encadeada.
    //
    //Dicas:
    //Se a lista estiver vazia, nada é feito.
    //Se houver um único elemento, primeiro e ultimo viram null.
    //Caso contrário, use ultimo.anterior para atualizar ultimo e desconectar o último nó.

    public void removerUltimo(){
        if(n_elementos == 0){
            return;
        } else if (n_elementos == 1) {
            primeiro = null;
            ultimo = null;
        } else {
            ultimo = ultimo.anterior;
            ultimo.proximo = null;
        }
        n_elementos--;
    }
}
