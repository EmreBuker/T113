package ders08_TernaryOperator;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        // Soru;Kullanicidan bir sayi isteyin
        // sayiyi kontrol edip 5 ile bolunebiliyorsa "Sayi 5'in tam kati" yazdirin
        //bolunemiyorsa "5'in tam kati degil" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int say= scan.nextInt();

        System.out.println(say%5==0 ? "Sayi 5'in tam kati " : "5'in kati degil");

    }
}
