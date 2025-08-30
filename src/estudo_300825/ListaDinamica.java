package estudo_300825;

public class ListaDinamica{
    int num_elementos;
    private Nodo inicio;
    private Nodo fim;

    public ListaDinamica() {
        inicio = null;
        fim = null;
        num_elementos = 0;
    }

    public void adicionarFim(int elemento){
        if (num_elementos == 0){
            Nodo novoNodo = new Nodo(elemento);
            fim = novoNodo;
            inicio = fim;
        } else {
            Nodo novoNodo = new Nodo(elemento);
            fim.proximo = novoNodo;
            fim = novoNodo;
        }
        num_elementos++;
    }

    public void excluirUltimo(){
        if (num_elementos == 1){
            inicio = null;
            fim = inicio;
        } else if (num_elementos == 0) {
            System.out.println("Já não tem nada aqui!");
        } else{
            Nodo atual = inicio;
            for (int i = 0; i < num_elementos - 2; i++) { // Percorre até o penúltimo nó usando for.
                atual = atual.proximo;
            }
            // Atualiza ponteiros para remover o último
            atual.proximo = null;
            fim = atual;
            num_elementos--;
        }
    }

    public void imprimirLista(){
        Nodo atual = inicio;
        while (atual != null){
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }


}
