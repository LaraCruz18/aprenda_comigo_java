package Curso_NelioAlves;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        //para fazer entrada de dados, nós vamos criar um objeto do tipo "Scanner"

        Scanner sc = new Scanner(System.in); //váriavel "sc" do tipo "Scanner"

        String nome = sc.next(); //recebe string

        int num = sc.nextInt(); //recebe números inteiros
        sc.close(); //boa prática para colocar após o sc.nextInt()

        double numDouble = sc.nextDouble(); //recebe numero com casa decimais
        //obs: double recebe de entrada números separados por vírgula. para configurar a entrada com ponto, é preciso usar:
        //Locale.setDefault(Locale.US); (ANTES do SCANNER)
        sc.close(); //boa prática para colocar após o sc.nextDouble()

        char letra = sc.next().charAt(0); //pega o primeiro carctere da string
        sc.close(); //boa prática para colocar após o sc.next().charAt(0)

        //usando todos os recursos e utilizando a formatação para printar:
        System.out.printf("Olá, meu nome é %s e eu tenho %d anos, peso %.2f e o meu sexo é %s", nome, num,numDouble,letra);
    }
}
