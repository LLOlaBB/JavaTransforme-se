package Lista3_Repetição;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lista3Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int soma = 0;
        try {
            for (i = 1; i <= 10; i++) {
                System.out.println("Digite o " + i + "º número: ");
                int num = scan.nextInt();
                soma += num;
            }

            System.out.println("A soma dos " + i + " números é: " + soma);
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
        scan.close();
    }
}