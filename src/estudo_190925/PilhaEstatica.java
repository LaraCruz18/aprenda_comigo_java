package estudo_190925;

public class PilhaEstatica {
    int tamanhoPilha; //capacidade da pilha
    int numElementos; //quantidade atual de elementos
    //    int[] elementos;
    char[] elementos; //array que armazena os numeros

    //construtor:
    public PilhaEstatica(int tamanhoPilha) {
        this.tamanhoPilha = tamanhoPilha;
        this.numElementos = 0;
//        this.elementos = new int[tamanhoPilha];
        this.elementos = new char[tamanhoPilha];
    }

    //função para colocar número no topo da pilha:
    public void push(int elemento) {
        if (numElementos < tamanhoPilha) {
//            elementos[numElementos] = elemento;
            elementos[numElementos] = (char) elemento;
            numElementos++;
        } else {
            System.out.println("A pilha está cheia!");
        }
    }

    public boolean isEmpty() {
        return numElementos == 0; //retorna true se estiver vazia
    }

//    public void pop() { //remove o topo (normal)
//        if (numElementos == 0) {
//            System.out.println("A pilha já está vazia!");
//        } else {
//            numElementos--; // apenas move o topo para baixo
//        }
//    }

    public char pop() { //usado na implementação da expressão
        if (isEmpty()) {
            System.out.println("A pilha está vazia!");
            return '\0'; // ou lança uma exceção
        } else {
            numElementos--;
            return elementos[numElementos]; // retorna o topo
        }
    }

    public void peek() {
        if (numElementos == 0) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.println("O topo da pilha é: " + elementos[numElementos - 1]);
        }
    }


    public void imprimir() {
        if (numElementos == 0) {
            System.out.println("A pilha já está vazia!");
        } else {
            for (int i = numElementos - 1; i >= 0; i--) { //prestar atenção no decremento do i.
                System.out.println(elementos[i]);
            }
        }
    }

    /// Exercícios de implementação:
    public void inverter() { //deixa na ordem normal
        if (numElementos == 0) {
            System.out.println("A pilha já está vazia!");
        } else {
            for (int i = 0; i < numElementos; i++) {
                System.out.println(elementos[i]);
            }
        }
    }

    public int soma() {
        int aux = 0;
        System.out.println("A soma de pilha é:");
        for (int i = 0; i <= numElementos - 1; i++) {
            aux += elementos[i];
        }
        return aux;
    }

    public int maiorElem() {
        int maior = elementos[0];
        System.out.println("O maior número da pilha é: ");
        for (int i = 1; i < numElementos; i++) {
            if (elementos[i] > maior) {
                maior = elementos[i];
            }
        }
        return maior;
    }

    public int qntPares() {
        int numsPares = 0;
        for (int i = 0; i < numElementos; i++) {
            if (elementos[i] % 2 == 0) {
                numsPares++;
            }
        }
        return numsPares;
    }

    public boolean expCorreta(String expressao) {
        for (int i = 0; i < expressao.length(); i++) { // esse for, vai percorrer o tamanho da expressão
            char caractere = expressao.charAt(i); //charAt(i) serve para pegar o caractere que está na posição i.
                if (caractere == '(' || caractere == '[' || caractere == '{') { //verifica se tem o caractere de abertura
                    push(caractere); //se tiver, coloca na pilha
                    } else if (caractere == ')' || caractere == ']' || caractere == '}') { //verifica se tem o caractere de fechamento
                        if (isEmpty()) {
                            return false; //se a pilha estiver vazia, vai retornar falso, já que não faz sentido ter o caractere de fechamento e não ter o de aberturra
                        } else {
                            char topo = pop(); //o pop() vai retirar o ultimo caractere da pilha, ele vai ser armazenado na variável "topo" para comparar depois
                                if (caractere == ')' && topo != '(') { //Essa parte do código verifica se o símbolo de fechamento combina com a abertura correspondente
                                    return false;
                                } else if (caractere == ']' && topo != '[') {
                                    return false;
                                } else if (caractere == '}' && topo != '{') {
                                    return false;
                                }
                                //é importante perceber que os "caracteres de fechamento" não chegam a entrar na pilha, por isso que o "topo" é o "caractere de abertura"
                    }
            }
        }
            return isEmpty();
    }



}

