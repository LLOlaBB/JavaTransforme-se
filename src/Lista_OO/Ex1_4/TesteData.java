package Lista_OO.Ex1_4;

public class TesteData {
    public static void main(String[] args) {
        Data dataAtual = new Data();
        System.out.println("Data no sistema: " + dataAtual.toString());

        Data data = new Data(10,5,1986);
        System.out.println("Nova data: " + data.toString());

        data.avancarParaODiaSeguinte();
        System.out.println("Proximo dia: "+data.getDia()+"/"+data.getMes()+"/"+data.getAno());
    } 
}