package Lista1;

import java.util.Scanner;

public class Lista1Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite uma distância em metros: ");
        double metros = scan.nextDouble();
    
        double km = metros / 1000;
        double hm = metros / 100;
        double dam = metros / 10;
        double dm = metros * 10;
        double cm = metros * 100;
        double mm = metros * 1000;
    
        System.out.println("A distância de " + metros + "m corresponde a:");
        System.out.println(km + "Km");
        System.out.println(hm + "Hm");
        System.out.println(dam + "Dam");
        System.out.println(dm + "dm");
        System.out.println(cm + "cm");
        System.out.println(mm + "mm");
    
        scan.close();
      }
}