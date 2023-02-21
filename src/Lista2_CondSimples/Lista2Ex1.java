package Lista2_CondSimples;

import java.util.Scanner;

public class Lista2Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a velocidade do carro (em km/h): ");
        int velocidade = scan.nextInt();
        
        if (velocidade > 80) {
            int multa = (velocidade - 80) * 5;
            System.out.println("Você foi multado por excesso de velocidade! O valor da multa é R$" + multa + ".");
        } else {
            System.out.println("Velocidade dentro do limite permitido.");
        }
        
        scan.close();
    }
}