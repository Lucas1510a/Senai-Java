import java.util.Scanner;

/*
Faça um fluxograma e um programa utilizando a linguagem Java que leia o lado do quadrado e
exiba o seu perímetro e a área.

Data: 22/-3/2025
programador: Lucas
Professsora: Luciana fugita

 */
    public class L1EX6 {
      public static void main(String[] args){
          Scanner ler = new Scanner(System.in);

          //Declarando entrada de dados
          System.out.printf("Digite o lado do quadrado ");

          int  perimetro, lado;

          //Ler a variavel area
          lado = ler.nextInt();
          double area= Math.pow(lado, 2);
          perimetro = lado *  4;
          System.out.println("O lado do quadrado e " + perimetro + " e " + area);
      }
}
