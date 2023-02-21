package Lista3_Repetição;

import java.util.Scanner;

public class Lista3Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int num = scan.nextInt();
            soma += num;
        }

        System.out.println("A soma dos 10 números é: " + soma);

        scan.close();
    }
}