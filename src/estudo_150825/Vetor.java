package estudo_150825;

public class Vetor {
    private String[] elements; //criei um atributo (elements) que é um array de strings.
    private int size; //esse atributo vai controlar o tamanho "real" do vetor (USADO APENAS NO MÉTODOS NEWADDELEMENT!!!").


    public Vetor(int capacity){ //criei a variável "capacidade" no construtor
        //os "elementos" vão ser de acordo com a capacidade que eu inserir.
        //ou seja, se capacity = 10, o "tamanho" de elements será 10.
        this.elements = new String[capacity];
        //resumindo, quando alguém criar o objeto Vetor (na main), ela precisa dizer quantos elementos cabem.
        //se Vetor meuVetor = new Vetor(5) => elements = [null, null, null, null, null].
        this.size = 0; //o tamanho do vetor começa 0 e após vai incrementando.
    }
//////////////////////////////////////////////MÉTODOS PARA ADICIONAR ELEMENTOS AO VETOR/////////////////////////////////////////////////////////////////////////////////////////////////
//    public void addElement(String element){ //OBS: element = variável para
//        for (int i = 0; i < elements.length; i++) { //esse "for" vai verificar se esse vetor tem posição nula (não tem elementos)>
//            if(this.elements[i] == null){ // traduzindo: se esse vetor, na posição "i" (tamanho do vetor),  for nulo, faça:.
//                this.elements[i] = element;//adicione nesta posição "i" o elemento
//                System.out.println(element); //só pra mostrar o elemento que eu adicionei.
//                break; //para quebrar o loop do for
//
//                //É importante observar que: se o vetor já tiver um elemento, esse "for" vai checar se o próximo "espaço" do vetor está nulo.
//            }
//        }
//    }

//    public void newAddElement(String element,int size){
//        this.elements[this.size] = element; //aqui diz basicamente: “Coloque o element na posição que está marcada como o próximo índice livre (this.size).”
//        //size != length. length é capacidade total, size é o tamanho do vetor até agora.
//        //Outra explicação: Se this.size = 0, o elemento vai para elements[0]. Se depois this.size = 1, o próximo vai para elements[1].
//        System.out.println(element);
//        this.size++; //iteração normal
//
//
//    }


}
