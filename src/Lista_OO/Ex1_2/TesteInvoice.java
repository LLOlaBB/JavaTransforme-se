package Lista_OO.Ex1_2;

import java.text.DecimalFormat;

public class TesteInvoice {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Invoice invoice = new Invoice(1, "Moto One", 3, 1500.00);
        df.applyPattern("R$ #,##0.00");
        System.out.println("Descricao do Produto: " + invoice.getDescricaoItem());
        System.out.println("Quantidade Comprada: " + invoice.getQuantidadeComprada());
        System.out.println("Preço Unitário" + df.format(invoice.getPrecoUnitario()));
        System.out.println("Valor da Nota: " + df.format(invoice.getValorTotal()));
    }
}