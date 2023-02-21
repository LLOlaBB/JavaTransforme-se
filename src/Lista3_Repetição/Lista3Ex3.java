package Lista3_Repetição;

import java.util.Scanner;

public class Lista3Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
        scan.close();
    }
}