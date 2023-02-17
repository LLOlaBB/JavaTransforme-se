package exercicios;

import javax.swing.JOptionPane;

public class ExercicioA3 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Digite um número para ver sua tabuada:");
        int numero = Integer.parseInt(input);
        
        String mensagem = "";
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            mensagem += numero + " x " + i + " = " + resultado + "\n";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}