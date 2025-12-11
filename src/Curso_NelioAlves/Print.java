package Curso_NelioAlves;
//estou usando os exemplos do curso do professor Nélio Alves.

import java.util.Locale;

public class Print {
    public static void main(String[] args) {
        //formas de print
        System.out.println("Bom dia"); //com quebra de linha

        System.out.print("Lara"); //sem quebra de linha

        System.out.printf("%.2f", 35.88888); //para limitar a quantidade de casas decimais. "%.2(significa que quero duas casas depois da vírgula)f%n(significa a quebra de linha)"
        //obs: nota-se que vai constar "61,68" no console, pois arredonda.

        Locale.setDefault(Locale.US); //para printar o número decimal com "." ao invés de vírgula.
        System.out.printf("%.2f", 685.455);
        //obs://é preciso colocar antes da linha que eu quero mudar a vírgula por ponto.


        System.out.println("Olá, meu nome é Lara e tenho " + 22 + " anos"); //concatenação comum usando "+"

        System.out.printf("Olá, meu nome é Lara e eu tenho %.3f na minha conta, mas tenho apenas %d anos %n", 355.4685466,22); //usando %f e %d para representar os números.
        //obs: %d -> numeros inteiros (int, long e short)
        //%s -> para strings
        //%f -> ponto flutuante
        //%n -> quebra de linha

        //exemplo:
        String nome = "Maria";
        int idade = 34;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha $%.2f reais", nome,idade,renda);

        //EXERCÍCIO DE FIXAÇÃO
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $%.2f %n", product1, price1);
        System.out.printf("%s, which price is $%.2f %n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s %n", age,code,gender);
        System.out.printf("Measue with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (Three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US); //é preciso colocar antes da linha que eu quero mudar a vírgula por ponto.
        System.out.printf("US decimal point: %.3f %n", measure);
    }
}
