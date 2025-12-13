package Curso_NelioAlves;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        //condicional if simples
        int x = 5;

        System.out.println("Bom dia");
        if(x > 0){ //se for true, entra no bloco de commandos. se for false, pula o bloco.
            System.out.println("Boa tarde");
        }
        System.out.println("Boa noite");


        //condicional if composta
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();

        if(hora < 12){
            System.out.println("Bom dia");
        } else {
            System.out.println("Boa tarde");
        }

        //e se eu tive mais de duas possibilidades?
        if(hora <= 12){
            System.out.println("Bom dia");
        } else if (hora <= 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        sc.close();
    }
}
