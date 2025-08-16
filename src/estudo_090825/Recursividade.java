package estudo_090825;

public class Recursividade {
        public static void num(int n) { //esse metodo é "void" pq é só pra impimir a sequência de números.
        if (n == 0) {
            System.out.println(n);//esse sout traz o 0 pra contagem.
            return;
        }
        System.out.println(n);//imprimindo de trás para frente.
        num(n - 1);
        System.out.println(n);//imprimindo de frente para trás.
        //A ORDEM IMPORTA, ANTES OU DEPOIS DO CASO RECURSIVO, VAI SER DIFERENTE.
    }


    public static int fator(int n) { //vou calcular o fatorial, vai ser do tipo Int.
        if (n == 0) { //quando o "n" for/chegar a zero, vai retornar 1 (caso base que evita o loop infinito).
            return 1;
        }
        return n * fator(n - 1); //enquanto o "n" seja maior que zero, ele vai ser multiplicado pelo fator dele menos um.
        // exemplo: n = 3 (cai no caso recursivo), então:
        // n * fator(n-1) === 3 * fator(2)
        // Depois disso, n = 2 e ainda cai no caso recursivo, então novamente: 3 * ( 2 * fator(1) )
        // Depois, n = 1 e ainda cai no caso recursivo: 3 * ( 2 * ( 1 * fator(0) ) )
        // No final, n = 0 (caso base) retorna 1:
        // 3 * ( 2 * ( 1 * 1 ) ) = 3 * ( 2 * 1 ) = 3 * 2 = 6.
    }

        public static int soma(int n) { //aqui vai retornar a soma dos números de 0 a n.
        if (n == 1) { //nesse caso, o caso base será com 1 por causa da soma. Colocar zero aqui, seria mais trabalho, já que a soma cabaria no 1.
            return 1;
        }
        return n + soma(n - 1); // sendo n = 4: 4 + (3 + (2 + 1)). Agora resolvendo de dentro para fora: 2 + 1 = 3 + 3 + 4 = 10.
    }
}
