package Curso_NelioAlves;
//estou usando os exemplos do curso do professor Nélio Alves.

public class Casting {
    public static void main(String[] args) {
        //Exemplo 1:
        int x,y; //declarando duas variáveis de uma vez

        x = 5; //atribuindo valor

        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        //Exemplo 2:
        int w;
        double z;

        w = 5;

        z = 2 * w;

        System.out.println(w);
        System.out.println(z);// percebe-se que a impressão vai sair com ponto flutuante, pois a variável "z" é double

        //Exemplo 3
        double b, B, h, area; //declarei 4 variáveis do mesmo tipo de um vez!

        b = 6.0;
        B = 8.0;
        h = 5.0;
        //boa prática: o número com casas decimais, mesmo que seja ex:6,7,8, é bom que seja colocado ".0" no final ex: 6.0,7.0,8.0)
        //caso fosse do tipo float, seria representado assim:
        //b = 6f;
        //B = 8f;
        //h = 5f;

        area = (b + B) / 2.0 * h;

        System.out.println(area);

        //Exemplo 4:
        int a,c;
        double resultado;

        a = 5;
        c = 2;

        resultado = a / c;

        System.out.println(resultado); //nota-se que ao invés de 2,5, vai sair: 2,0. Pois como os dois são inteiro, o resultado (mesmo que fosse declarado como double) saiu apenas a parte inteira da divisão

        //para resolver isso:
        resultado = (double) a / c;
        System.out.println(resultado); //agora sim, o resultado vai sair 2,5, pois o "(double)" está "forçando" que aquela variável seja daquele tipo

        //CONCEITO DE CASTING:
        //O Casting em Java é a conversão explícita de um tipo de dado para outro tipo de dado compatível.


    }
}
