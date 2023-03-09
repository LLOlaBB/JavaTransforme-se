package Lista_OO.Ex1_4;

import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String msg;

    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException(msg);
        }
    }

    public Data() {
        LocalDate hoje = LocalDate.now();
        this.dia = hoje.getDayOfMonth();
        this.mes = hoje.getMonthValue();
        this.ano = hoje.getYear();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dataValida(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido!");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (dataValida(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido!");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (dataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido!");
        }
    }

    
    @Override
    public String toString() {
        return String.format(this.dia+"/"+this.mes+"/"+this.ano);
    }

    
    public void avancarParaODiaSeguinte() {
        int ultimoDiaDoMes = LocalDate.of(this.ano, this.mes, 1).lengthOfMonth();
        if (this.dia == ultimoDiaDoMes) {
            if (this.mes == 12) {
                this.dia = 1;
                this.mes = 1;
                this.ano++;
            } else {
                this.dia = 1;
                this.mes++;
            }
        } else {
            this.dia++;
        }
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (mes == 2 && dia > 29) {
            msg = "O mes de fevereiro não pode ter mais que 29 dias";
            return false;
        }

        if (mes < 1 || mes > 12) {
            msg = "Mes invalido";
            return false;
        }
        
        if (dia < 1 || dia > 31) {
            msg = "Dia invalido";
            return false;
        }
        return true;
    }
}