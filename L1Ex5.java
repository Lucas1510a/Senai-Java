import java.util.Scanner;

/*LISTAS DE EXERCICIOS 1
Crie  um programa utilizando a linguagem Java que leia um número inteiro e
imprima o triplo do seu valor.

Data: 22/03/2025
Progamador: Lucas
Professora: Luciana Fugita

Ex - Multiplicador
 1 - ler a variavel numero;
 2 - multiplicar o numero por 3
 3 - imprimir o resultado

 */
    public class L1Ex5 {
        public static void main(String[] args ){

            /* Cria um objeto da classe Scanner para ler entradas do usuário a partir do teclado (entrada padrão)*/
            Scanner ler = new Scanner(System.in);

            //Declarando as variaveis
            int numero, multiplicacao;

            //lendo a variavel
            System.out.printf("Digite o numero ");
            numero = ler.nextInt();
            multiplicacao = numero * 3;

            System.out.println("O numero " + numero + " multiplicado por 3 é "+ multiplicacao);



        }
}
