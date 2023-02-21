package Lista1;

import java.util.Scanner;

public class Lista1Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nota 1: ");
        double nota1 = scan.nextDouble();
        
        System.out.println("Nota 2: ");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        System.out.println("A média entre "+nota1+" e "+nota2+" é igual a "+media+".");
        scan.close();
      }
}