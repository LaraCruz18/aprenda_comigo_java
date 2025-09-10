package estudo_100925;

import java.util.Scanner;

public class Teste {
    static class Pessoa{
        String nome;
        int tempoEspera;

        public Pessoa(String nome, int tempoEspera) {
            this.nome = nome;
            this.tempoEspera = tempoEspera;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdPessoas = sc.nextInt();
        sc.nextLine();

        Pessoa[] fila = new Pessoa[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Pessoa: " + (i+1));
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Tempo de espera: ");
            int tempoEspera = sc.nextInt();
            sc.nextLine();

            fila[i] = new Pessoa(nome, tempoEspera);
        }


        for (int i = 0; i < qtdPessoas - 1; i++) {
            for (int j = i + 1; j < qtdPessoas; j++) {
                if(fila[j].tempoEspera > fila[i].tempoEspera){
                    Pessoa aux = fila[i];
                    fila[i] = fila[j];
                    fila[j] = aux;
                }
            }
        }

        for (int i = 0; i < fila.length; i++) {
            System.out.println(fila[i].nome + " " + fila[i].tempoEspera);
        }

    }
}
