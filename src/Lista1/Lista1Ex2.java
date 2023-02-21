package Lista1;

import java.util.Scanner;

public class Lista1Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome? ");
        String nome = scan.nextLine();
        
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
        scan.close();
      }
}