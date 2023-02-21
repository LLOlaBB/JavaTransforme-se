package Lista1;

import java.util.Scanner;

public class Lista1Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de Km percorridos: ");
        double kmPercorridos = scan.nextDouble();
        
        System.out.println("Digite a quantidade de dias de aluguel: ");
        int diasAluguel = scan.nextInt();
        
        double precoTotal = (diasAluguel * 90) + (kmPercorridos * 0.20);
        
        System.out.println("O preço total a pagar é: R$" + precoTotal);
        
        scan.close();
    }
}