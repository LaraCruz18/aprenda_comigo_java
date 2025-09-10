package estudo_100925;

public class TesteDois {
    public static void inversao(int[] vetor, int n){
        if(n == 0){
            return;
        }
        System.out.println(vetor[n-1]);
        inversao(vetor, n - 1);
    }



    public static void main(String[] args) {
        int[] vetor = {3,4,5};
        inversao(vetor, vetor.length);
    }
}
