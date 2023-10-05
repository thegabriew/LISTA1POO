public class Main {
    public static void main(String[] args) {
   
        for (int i = 1; i <=5; i++) {
            
            for (int j = 1; j <= i; j++) {
                // A multiplicação acontece de cima pra baixo na ordem em que os números são gerados no loop, sendo o primeiro loop feito para controlar as colunas
                System.out.print(i * j + " ");
            }
           
            System.out.println();
        }
    }
}
