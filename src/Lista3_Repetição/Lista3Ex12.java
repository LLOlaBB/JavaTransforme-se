package Lista3_Repetição;

import java.util.Scanner;

public class Lista3Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countPares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i+1) + "º número: ");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                countPares++;
            }
        }

        System.out.println("Foram digitados " + countPares + " números pares.");
        scan.close();
    }
}