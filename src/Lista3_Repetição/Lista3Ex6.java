package Lista3_Repetição;

import java.util.Scanner;

public class Lista3Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a idade da pessoa " + i + ": ");
            int idade = scan.nextInt();
            soma += idade;
        }
        
        System.out.println("A soma das idades é: " + soma);
        scan.close();
    }
}