package estudo_300825;

public class ListaEstatica {
    int tamanhoVetor; //capacidade do vetor.
    int num_elementos; //quantos elementos já tem na lista.
    int[] elementos; //array que armazena os números.

    public ListaEstatica(int tamanhoVetor){
        this.tamanhoVetor = tamanhoVetor;
        this.elementos = new int[tamanhoVetor]; //int[tamanhoVetor] significa que você está criando um array de inteiros com tamanho tamanhoVetor.
        this.num_elementos = 0;
    }

    public void adicionarElemento(int elemento) {
        if(num_elementos < tamanhoVetor){
            if (num_elementos == 0) {
                elementos[0] = elemento;
            } else {
                elementos[num_elementos] = elemento;
            }
            num_elementos++;
        } else {
            System.out.println("Sem espaço!");
        }
    }

    public void excluirUltimo(){
        if(num_elementos == 0){
            System.out.println("A lista já está vazia!");
        }else{
            num_elementos--;
        }
    }

    public void incluirElemento(int elemento, int posicao){
        if(num_elementos == tamanhoVetor){
            System.out.println("A lista já atingiu seu limite!");
        }else{
            for (int i = num_elementos - 1; i >= posicao; i--) {
                elementos[i + 1] = elementos[i];
            }
                elementos[posicao] = elemento;
                num_elementos++;
        }
    }

    public void imprimirLista(){
        for (int atual = 0; atual < num_elementos; atual++) {
            System.out.println(elementos[atual]);

        }
    }
}
