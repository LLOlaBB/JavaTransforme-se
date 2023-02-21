package Lista2_CondSimples;

import java.util.Scanner;

public class Lista2Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scan.nextInt();

        int anoAtual = 2023;
        int idade = anoAtual - anoNascimento;

        if (idade < 18) {
            int anosFaltantes = 18 - idade;
            System.out.println("Você tem "+idade+" anos. Faltam "+anosFaltantes+" anos para o alistamento militar.");
        } else if (idade == 18) {
            System.out.println("Você tem 18 anos. Deve se alistar este ano!");
        } else {
            int anosPassados = idade - 18;
            System.out.println("Você tem "+idade+" anos. Já passaram "+anosPassados+" anos do seu alistamento militar.");
        }

        scan.close();
    }
}