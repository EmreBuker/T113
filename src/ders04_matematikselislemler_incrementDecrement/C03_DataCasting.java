package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {// soru 2 : kullanicidan iki int deger alip
        //bunlari birbirine bolun ve sonucu double olarak yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("İki tam sayi girin");

        int say1= scan.nextInt();
        int say2= scan.nextInt();

        double BolunenSayi=(double)say1/say2;

        System.out.println(BolunenSayi);



    }
}
