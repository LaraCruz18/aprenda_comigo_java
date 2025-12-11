package Curso_NelioAlves;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        double x,y,z; //declarando três variáveis do mesmo tipo de uma só vez

        //raiz quadrada
        x = Math.sqrt(a);
        y = Math.sqrt(b);
        z = Math.sqrt(c);

        System.out.printf("A raiz quadrada de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);

        // ---------------------------------
        //potenciação
        x = Math.pow(a,c);
        y = Math.pow(b,b);
        z = Math.pow(c,a);

        System.out.printf("A potência de A e C -> %.1f, B e B -> %.1f, C e A -> %.1f %n", x,y,z);

        // ---------------------------------

        //valor absoluto (valor sem negativo)
        x = Math.abs(-2);
        y = Math.abs(-5);
        z = Math.abs(-9);

        System.out.printf("O valor absoluto de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);

        // ---------------------------------

        //maior valor entre dois numeros
        x = Math.max(a,c);
        y = Math.max(b,a);
        z = Math.max(c,b);

        System.out.printf("O maior valor entre A e C -> %.1f, B e A -> %.1f, C e B -> %.1f %n", x,y,z);

        // ---------------------------------

        //menor valor entre dois numeros
        x = Math.min(a,c);
        y = Math.min(b,a);
        z = Math.min(c,b);

        System.out.printf("O menor valor entre A e C -> %.1f, B e A -> %.1f, C e B -> %.1f %n", x,y,z);

        // ---------------------------------

        //arredondamento para o INTEIRO mais próximo (retorna long ou int)
        x = Math.round(6.3);
        y = Math.round(7.8);
        z = Math.round(9.9);

        System.out.printf("O arredondamento para o valor mais próximo de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);
        //dica do gemini: Use este se você quer o arredondamento tradicional, onde X.5 sempre arredonda para cima (ou para longe do zero).

        // ---------------------------------

        //arredondamento para o INTEIRO MAIOR ou igual (teto)
        x = Math.ceil(6.3);
        y = Math.ceil(7.8);
        z = Math.ceil(9.9);

        System.out.printf("O arredondamento para maior de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);

        // ---------------------------------

        //arredondamento para o INTEIRO MENOR ou igual (chão)
        x = Math.floor(6.3);
        y = Math.floor(7.8);
        z = Math.floor(9.9);

        System.out.printf("O arredondamento para menor de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);

        // ---------------------------------

        //arredondamento para o INTEIRO mais próximo, mas segue a regra "PAR" em casos de empate. Se o número quebrado está exatamente no meio (X.5), ele arredonda para o inteiro par mais próximo.
        //pouco usado
        x = Math.floor(6.5);
        y = Math.floor(7.5);
        z = Math.floor(-9.5);

        System.out.printf("O arredondamento para o próximo inteiro par de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);

        //dica do gemini:Use este se você precisa de arredondamento científico ou estatístico, que é menos tendencioso e prefere números pares no caso de empate.

        // ---------------------------------

        //PI
        double pi = Math.PI; //a váriavel vai assumir o valor de PI

        // ---------------------------------

        //retorna o SENO do angulo (em RADIANOS)
        x = Math.sin(a);
        y = Math.sin(b);
        z = Math.sin(a);

        System.out.printf("O seno de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);

        // ---------------------------------

        //retorna o COSSENO do angulo (em RADIANOS)
        x = Math.cos(a);
        y = Math.cos(b);
        z = Math.cos(a);

        System.out.printf("O cosseno de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);

        // ---------------------------------

        //retorna a TANGENTE do angulo (em RADIANOS)
        x = Math.tan(a);
        y = Math.tan(b);
        z = Math.tan(a);

        System.out.printf("A tangente de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);

        // ---------------------------------

        //converte um angulo de GRAUS para RADIANOS
        x = Math.toRadians(a);
        y = Math.toRadians(b);
        z = Math.toRadians(a);

        System.out.printf("Conversão para radianos de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);

        // ---------------------------------

        //converte um angulo de RADIANOS para GRAUS
        x = Math.toDegrees(a);
        y = Math.toDegrees(b);
        z = Math.toDegrees(a);

        System.out.printf("Conversão para graus de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);

        // ---------------------------------

        //retorna um número aleatório double entre 0.0 e 1.1
        double num = Math.random();

        System.out.printf("O número aleatório entre 0.0 e 1.1 da vez é: %.4f %n", num);

        //para retornar um número aleatório de 1 a 10
        num = (int)(Math.random() * 10) + 1;

        System.out.printf("O número aleatório entre 1 a 10 da vez é: %.1f %n", num);
        // ---------------------------------

        //retorna a raiz cúbica de um número
        x = Math.cbrt(a);
        y = Math.cbrt(b);
        z = Math.cbrt(a);

        System.out.printf("A raiz cúbica de de A -> %.1f, B -> %.1f, C -> %.1f %n", x,y,z);

    }
}