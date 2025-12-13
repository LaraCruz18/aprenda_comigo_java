package Curso_NelioAlves;

import java.util.Locale;
import java.util.Scanner;

//questões de estrutura sequencial

public class Exercicios01 {
    public static void main(String[] args) {
        //questão 1
        Scanner sc = new Scanner(System.in);
        System.out.println("QUESTÃO 1 - Digite dois números inteiros: ");
        int a = sc.nextInt();

        int b = sc.nextInt();

        int resultado = a + b;

        System.out.printf("O resultado da soma é: %d %n", resultado);

        //questão 2
        System.out.println("QUESTÃO 2 - Digite um número: ");
        Locale.setDefault(Locale.US); //pra resposta sair com ponto, não com vírgula

        double raio = sc.nextDouble();

        double result= (3.14159 * Math.pow(raio,2));

        System.out.printf("O resultado da saída é: %.4f %n", result);

        //questão 3
        System.out.println("QUESTÃO 3 - Digite 4 números inteiros:");
        a = sc.nextInt();

        b = sc.nextInt();

        int c = sc.nextInt();

        int d = sc.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.printf("O resultado da diferença é: %d %n", diferenca);

        //questão 4
        System.out.println("QUESTÃO 4 - Digite 2 números inteiros e um double:");
        a = sc.nextInt();

        b = sc.nextInt();

        Locale.setDefault(Locale.US);
        double num = sc.nextDouble();

        double salario = (double) b * num;

        System.out.printf("Número: %d, salário: U$ %.2f %n", a,salario);

        //questão 5
        System.out.println("QUESTÃO 5 - Digite 2 números inteiros e um double:");
        int codigo1 = sc.nextInt(); //cód

        int qtdPecas1 = sc.nextInt(); //num de peças

        double valorPeca1 = sc.nextDouble(); //valor unitário

        int codigo2 = sc.nextInt(); //cód

        int qtdPecas2 = sc.nextInt(); //num de peças

        double valorPeca2 = sc.nextDouble(); //valor unitário

        double valorAPagar = (qtdPecas1 * valorPeca1) + (qtdPecas2 * valorPeca2);

        System.out.printf("O valor a pagar é: %.2f %n", valorAPagar);

        //questão 6
        System.out.println("QUESTÃO 6 - Digite 3 números double:");
        double A = sc.nextDouble();

        double B = sc.nextDouble();

        double C = sc.nextDouble();

        double areaTriangulo = (A * C) / 2;

        double areaCirculo = 3.14159 * Math.pow(C,2);

        double areaTrapezio = (A + B) * C / 2;

        double areaQuadrado = Math.pow(B,2);

        double areaRetangulo = A * B;

        System.out.printf("Triangulo: %.3f, circulo: %.3f, trapézio: %.3f,  quadrado: %.3f, retângulo: %.3f", areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo);
        sc.close();
    }
}
