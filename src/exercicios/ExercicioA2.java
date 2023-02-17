package exercicios;

import javax.swing.JOptionPane;

public class ExercicioA2 {
    public static void main(String[] args) {
        String loginOriginal = "java8";
        String senhaOriginal = "java8";
        
        int tentativasRestantes = 3;
        while (tentativasRestantes > 0) {
            String login = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");
            
            if (login.equals(loginOriginal) && senha.equals(senhaOriginal)) {
                JOptionPane.showMessageDialog(null, "Acesso permitido!");
                break;
            } else {
                tentativasRestantes--;
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tentativas restantes: " + tentativasRestantes);
            }
        }
        
        if (tentativasRestantes == 0) {
            JOptionPane.showMessageDialog(null, "Número máximo de tentativas excedido. Acesso negado.");
        }
    }
}