package Lista3_Repetição;

import java.util.Scanner;

public class Lista3Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a idade da pessoa "+ i);
            int idade = scan.nextInt();
            somaIdades += idade;
        }

        double mediaIdades = somaIdades / 20.0;
        System.out.println("A média das idades é: "+ mediaIdades);
        scan.close();
    }
}