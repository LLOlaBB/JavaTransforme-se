package Lista1;

import java.util.Scanner;

public class Lista1Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite a quantidade de dinheiro em reais: ");
        double reais = scan.nextDouble();
    
        double dolar = reais / 3.45;
    
        System.out.println("Com R$" + reais + " é possível comprar US$" + dolar);
    
        scan.close();
      }
}