package estudo_100925;

import java.util.Scanner;

////Está é minha revisão para prova, usando listas e recursividade.
public class Main {

    public static void inversao(int[] vetor, int i){
        if(i == 0){
            return;
        }
        System.out.println(vetor[i - 1]);
        inversao(vetor, i -1);
    }


    static class Pessoa{
        String nome;
        int tempoEspera;

        public Pessoa(String nome, int tempoEspera){
            this.nome = nome;
            this.tempoEspera = tempoEspera;
        }
    }





    public static void main(String[] args) {
        int[] vetor = {3,4,5};
        inversao(vetor, vetor.length);
//////////////////////////////////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        int qntPessoas = sc.nextInt(); // quantidade de pessoas na fila
        sc.nextLine(); // limpa a quebra de linha do teclado

        Pessoa[] fila = new Pessoa[qntPessoas]; //criei um vetor do tipo Pessoa, que se chama fila. Esse vetor vai receber "qtdPessoas", que vai virar o tamanho do vetor.


        for (int i = 0; i < qntPessoas; i++) { // atenção no "i < qntPessoas"
            System.out.println("Pessoa " + (i+1));
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Tempo de espera: ");
            int tempoEspera = sc.nextInt();
            sc.nextLine();

            fila[i] = new Pessoa(nome,tempoEspera);
        }

        for (int i = 0;i < qntPessoas - 1 ; i++) {  // atenção no "i < qntPessoas - 1"
            for (int j= i+1; j < qntPessoas; j++) {
                if (fila[j].tempoEspera > fila[i].tempoEspera){
                    Pessoa aux = fila[i]; // guarda o elemento i
                    fila[i] = fila[j]; // coloca o elemento j na posição i
                    fila[j] = aux;  // coloca o elemento i guardado em j
                }
            }
        }

        for (int i = 0; i < fila.length; i++) {
            System.out.println(fila[i].nome + " " + fila[i].tempoEspera);
        }
    }


}
