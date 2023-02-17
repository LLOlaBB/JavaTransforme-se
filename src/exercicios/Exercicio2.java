/* 2 - Usando a classe Scanner para entrada de dados, faça uma classe que receba dois valores inteiros. O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro de futebol. O segundo valor corresponde à quantidade de pontos do time lanterna. Considerando que cada vitória vale 3 pontos, elabore uma classe que calcule o número de vitórias necessárias para que o time lanterna alcance (ou ultrapasse) o líder. Por exemplo, supondo que as quantidades de ponto fornecidas sejam
40 e 22,então o número de vitórias apresentada na saída deverá ser 6, pois (40-22) / 3 = 6. */
package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Quantidade de pontos do líder: ");
            int pontosLider = scan.nextInt();
            
            System.out.print("Quantidade de pontos do lanterna: ");
            int pontosLanterna = scan.nextInt();
            
            int diferencaPontos = pontosLider - pontosLanterna;
            int numVitorias = diferencaPontos / 3;
            
            System.out.println("Número de vitórias necessárias para o lanterna alcançar o líder: " + numVitorias);
        }
        

    }
}