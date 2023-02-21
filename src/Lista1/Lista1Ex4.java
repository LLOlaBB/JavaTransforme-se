package Lista1;

import java.util.Scanner;

public class Lista1Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        int valor1 = scan.nextInt();
        
        System.out.println("Digite outro valor: ");
        int valor2 = scan.nextInt();
        
        int soma = valor1 + valor2;
        
        System.out.println("A soma entre "+valor1+" e "+valor2+" é igual a "+soma+".");
        scan.close();
      }
}