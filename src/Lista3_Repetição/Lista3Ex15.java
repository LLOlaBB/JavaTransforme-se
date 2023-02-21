package Lista3_Repetição;

import java.util.Scanner;

public class Lista3Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        while (numero >= 0) {
            soma += numero;
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
        }

        System.out.println("A soma dos números positivos digitados é: " + soma);
        scan.close();
    }
    
}