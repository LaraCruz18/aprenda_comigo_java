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

        //Questão 3 – Lista Dinâmica
        //
        //Enunciado:
        //Na classe ListaDinamica, implemente um métodos adicionarInicio(int elemento) que insira um novo nó no início da lista.
        //
        //Pistas:
        //Crie um novo Nodo.
        //Aponte novoNodo.proximo para o atual inicio.
        //Atualize inicio para o novoNodo.
        //Lembre-se de atualizar fim se a lista estava vazia.


        public void adicionarInicio(int elemento){
            Nodo novoNodo = new Nodo(elemento);
            if(num_elementos == 0){
                inicio = novoNodo;
                fim = novoNodo;
            } else {
                novoNodo.proximo = inicio; //aponta pro antigo início.
                inicio = novoNodo; //agora o novo nó é o início

            }
            num_elementos++;
        }
    }
