import java.util.Scanner;

/*
    LISTAS DE EXERCICIOS 1
 Crie um programa utilizando a línguagem Java que leia um
 número ínteiro e imprima o seu ANTECESSOR e o seu SUSSESOR.
 obs. utilize o tipo de data inteiro.

 Data: 22/03/2025
 Progamador: Lucas
 Professora: Luciana Fugita

 Ex - Antecessor e Sucessor
 1 - ler a variavel numero;
 2 - Subitrair 1 da varíavel numero e atribuir na variável antecessor;
 3 - Adicionar 1 na variavel numero e atribuir na variavel Successo;
 4 - exibir oresultado antecessor;
 5 - Exibir o resultado da variavel) sucessor.
 */
    public class L1Ex3 {

            public static void main(String[] args ){
             Scanner ler = new Scanner(System.in);

             //Declarando entrada de dados
                int antecessor, numero;


                System.out.printf("Digite o numero inteiro");
                //ler a variavel numero
                numero = ler.nextInt();
                antecessor = numero - 1;
                System.out.println("O antecessor de " + numero + " é " + antecessor);


            }
        }


