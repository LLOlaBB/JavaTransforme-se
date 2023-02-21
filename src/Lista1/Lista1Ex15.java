package Lista1;

import java.util.Scanner;

public class Lista1Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de dias trabalhados: ");
        int diasTrabalhados = scan.nextInt();
    
        int horasTrabalhadas = diasTrabalhados * 8;
        double salario = horasTrabalhadas * 25;
    
        System.out.println("O salário do funcionário é R$"+salario);
        scan.close();
      }
}