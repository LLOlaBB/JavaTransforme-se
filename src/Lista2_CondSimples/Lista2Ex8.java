package Lista2_CondSimples;

import java.util.Scanner;

public class Lista2Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distância em km: ");
        double distancia = scan.nextDouble();

        double preco;
        if (distancia <= 200) {
            preco = distancia * 0.5;
        } else {
            preco = distancia * 0.45;
        }

        System.out.println("Preço da passagem: R$ "+preco);

        scan.close();
    }
}