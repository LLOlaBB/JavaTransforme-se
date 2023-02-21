package Lista2_CondSimples;

import java.util.Scanner;

public class Lista2Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é um número par.");
        } else {
            System.out.println(num + " é um número ímpar.");
        }

        scan.close();
    }
}