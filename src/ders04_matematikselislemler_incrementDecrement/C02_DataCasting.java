package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {// SORU ; Kullanicidan iki double sayi alin
        //ilk sayiyi ikinci sayiya bolun,bolum isleminin sonucunun tam sayi kismini yazdirin

       Scanner scan=new Scanner(System.in);
        System.out.println("iki ondalikli sayi girin");

        double say1= scan.nextDouble();
        double say2= scan.nextDouble();

        int bolmeSonucuTamSayi=(int) (say1/say2);

        System.out.println(bolmeSonucuTamSayi);

    }
}
