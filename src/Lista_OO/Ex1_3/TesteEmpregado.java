package Lista_OO.Ex1_3;

import java.text.DecimalFormat;

public class TesteEmpregado {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");

        Empregado empregado1 = new Empregado("Maria", "Santos", 3500.00);
        System.out.println("Empregado: " + empregado1.getPrimeiroNome() + " " + empregado1.getSobrenome()
                + " Salário mensal: " + df.format(empregado1.getSalarioMensal()) + "Salário anual: "
                + df.format(empregado1.getSalarioAnual()));
        Empregado empregado2 = new Empregado("Laura", "Barros", 8000.00);
        System.out.println("Empregado: " + empregado2.getPrimeiroNome() + " " + empregado2.getSobrenome()
                + " Salário mensal: " + df.format(empregado2.getSalarioMensal()) + "Salário anual: "
                + df.format(empregado2.getSalarioAnual()));

        empregado1.aumentarSalario(10);
        System.out.println("Empregado: " + empregado1.getPrimeiroNome());
        System.out.println("Novo salário mensal: " + df.format(empregado1.getSalarioMensal()));
        System.out.println("Novo salário anual: " + df.format(empregado1.getSalarioAnual()));

        empregado2.aumentarSalario(10);
        System.out.println("Empregado: " + empregado2.getPrimeiroNome());
        System.out.println("Novo salário mensal: " + df.format(empregado2.getSalarioMensal()));
        System.out.println("Novo salário anual: " + df.format(empregado2.getSalarioAnual()));
    }
}