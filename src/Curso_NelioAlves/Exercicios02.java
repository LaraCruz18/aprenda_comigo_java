package Curso_NelioAlves;
//exercicios de estrutura condicional

import java.util.Scanner;

public class Exercicios02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Questão 1
        System.out.println("QUESTÃO 1 - Digite um número inteiro: ");

        int num = sc.nextInt();

        if(num > 0){
            System.out.println("NÃO NEGATIVO");
        }else {
            System.out.println("NEGATIVO");
        }

        //questão 2
        System.out.println("QUESTÃO 2 - Digite um número inteiro: ");

        int valor = sc.nextByte();

        if (valor % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }

        //questão 3
        System.out.println("QUESTÃO 3 - Digite dois valores inteiros: ");

        int a = sc.nextByte();

        int b = sc.nextByte();

        if(a % b == 0 || b % a == 0){
            System.out.println("SÃO MULTIPLOS");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }

        //questão 4
        System.out.println("QUESTÃO 4 - Digite dois valores inteiros: ");

        int horaInicial = sc.nextByte();

        int horaFinal = sc.nextByte();

        int duracao = 0;

        if(horaInicial < horaFinal){
            duracao =  horaFinal - horaInicial;

        } else  {
            duracao = 24 - (horaInicial - horaFinal);
        }
        System.out.printf("O jogo durou %d horas", duracao);

        //questão 5
        System.out.println("Digite dois números inteiros: ");

        int codigo = sc.nextByte();

        int quantidade = sc.nextByte();

        double valorAPagar = 0;

        if(codigo == 1){
            valorAPagar = 4.00 * quantidade;
        } else if (codigo == 2) {
            valorAPagar = 4.50 * quantidade;
        } else if (codigo == 3) {
            valorAPagar = 5.00 * quantidade;
        } else if (codigo == 4) {
            valorAPagar = 2.00 * quantidade;
        } else if (codigo == 5) {
            valorAPagar = 1.50 * quantidade;
        }

        System.out.printf("Valor a pagar: %.2f %n",valorAPagar);

        //questão 6
        System.out.println("Digite dois números double: ");

        double x = sc.nextDouble();

        double y = sc.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }else if (x < 0 && y > 0){
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }

        //questão 8
        System.out.println("Digite um número double: ");

        double salario = sc.nextDouble();
        double taxa = 0;

        if(salario >= 0.00 && salario <= 2000.00){
            System.out.println("Isento");
        } else if (salario >= 2000.01 == salario <= 3000) {
            taxa = (salario - 2000.0) * 0.08;
            System.out.printf("R$ %.2f%n", taxa);
        } else if (salario >= 3000.1 && salario <= 4500) {
            taxa =  (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", taxa);
        } else if (salario >= 4500) {
            taxa = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", taxa);
        }

        sc.close();
    }
}
