package Lista1;

import java.util.Scanner;

public class Lista1Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nome do Funcionário: ");
        String nome = scan.nextLine();
        
        System.out.println("Salário: ");
        double salario = scan.nextDouble();
        
        System.out.println("O funcionário "+ nome +" tem um salário de R$"+ salario +".");
        scan.close();
      }
}