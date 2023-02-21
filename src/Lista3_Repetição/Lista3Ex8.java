package Lista3_Repetição;

import java.util.Scanner;

public class Lista3Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade, maiores = 0;
    
        for (int i = 1; i <= 20; i++) {
          System.out.println("Digite a idade da pessoa " + i + ": ");
          idade = scan.nextInt();
    
          if (idade >= 18) {
            maiores++;
          }
        }
    
        System.out.println("Total de pessoas maiores de idade: " + maiores);
        scan.close();
      }
}