package Lista1;

import java.util.Scanner;

public class Lista1Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        
        System.out.println("O antecessor de "+numero+" é "+antecessor+".");
        System.out.println("O sucessor de "+numero+" é "+sucessor+".");
        scan.close();
      }
}