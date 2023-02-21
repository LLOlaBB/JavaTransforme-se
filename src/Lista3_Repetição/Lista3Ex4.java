package Lista3_Repetição;

import java.util.Scanner;

public class Lista3Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite um número: ");
        int n = scan.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(nome);
        }
        
        scan.close();
    }
}