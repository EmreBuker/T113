package ders08_TernaryOperator;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        // Soru; Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin"
        // degilse "Sınıfta kaldin" yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        double not= scan.nextDouble();

        System.out.println(not>=50 ? "Sinifi Gectin" : "Sinifta Kaldin" );






    }
}
