package Lista2_CondSimples;

import java.util.Scanner;

public class Lista2Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scan.nextInt();
        
        int idade = 2023 - anoNascimento;
        
        if (idade >= 16) {
            System.out.println("Você tem " + idade + " anos e pode votar.");
        } else {
            System.out.println("Você tem " + idade + " anos e não pode votar.");
        }
        
        scan.close();
    }
}