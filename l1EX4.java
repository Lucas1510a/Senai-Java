import java.util.Scanner;

public class l1EX4 {
        public static void main(String[] args){
            Scanner ler = new  Scanner(System.in);

            //Declarando entrada de dados
            int sucessor, numero;

            System.out.print("Digite o numero inteiro");

            // Ler a variavel numero
            numero = ler.nextInt();
            sucessor = numero + 1;
            System.out.println("O sucessor de " + numero + " e " + sucessor);
        }
}
