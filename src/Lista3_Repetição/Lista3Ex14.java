package Lista3_Repetição;

import java.util.Scanner;

public class Lista3Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, intervalo1 = 0, intervalo2 = 0, acima200 = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o " + i + "º número: ");
            num = scan.nextInt();
            
            if (num >= 0 && num <= 100) {
                intervalo1++;
            } else if (num > 100 && num <= 200) {
                intervalo2++;
            } else {
                acima200++;
            }
        }
        
        System.out.println("Quantidade de números entre 0 e 100: " + intervalo1);
        System.out.println("Quantidade de números entre 101 e 200: " + intervalo2);
        System.out.println("Quantidade de números acima de 200: " + acima200);
        
        scan.close();
    }
}