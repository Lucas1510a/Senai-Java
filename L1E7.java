/*
Faça um fluxograma e um programa utilizando a linguagem Java que leia os lados do retângulo
e exiba o seu perímetro e a área..

Data: 22/-3/2025
programador: Lucas
Professsora: Luciana fugita
 */

import java.util.Scanner;

public class L1E7 {
        public static void main(String[] args){
            Scanner ler = new Scanner(System.in);
            //Declarando entrada de dados
        System.out.printf("Digite os lado do retangulo ");
        int perimetro, area, ladomaior, ladomenor;

        // Entrada de dados
            System.out.println("Digite o lado menor ");
            ladomenor = ler.nextInt();
            System.out.println("Digite o lado maior ");
            ladomaior = ler.nextInt();

            //calculo
            area = ladomenor * ladomaior;
            perimetro = 2 * (ladomaior + ladomenor );

            System.out.println("O lado do retangulo e " + perimetro + " e " + area);



    }
}
