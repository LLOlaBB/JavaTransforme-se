package tiposprimitivos;
import java.util.Scanner;



public class LeituraDeDados {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite sua idade: ");
            int dados = scan.nextInt();
            System.out.println("Você digitou : " + dados);

            
        }
    }
}