package Lista2_CondSimples;

import java.util.Scanner;

public class Lista2Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        System.out.println("A média do aluno "+nome+" é "+media+".");

        if (media >= 7.0) {
            System.out.println("O aluno teve um bom aproveitamento!");
        } else {
            System.out.println("O aluno não teve um bom aproveitamento!");
        }

        scanner.close();
    }
}