package Lista3_Repetição;

import java.util.Scanner;

public class Lista3Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o "+i+"º número: ");
            int num = scan.nextInt();

            if (num > 8) {
                contador++;
            }
        }

        System.out.printf(contador+" números são maiores do que 8");

        scan.close();
    }
}