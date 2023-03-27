package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
        // Soru 2 : Kullanicidan bir double bir de int sayi alip
        //bunlarin toplamini ve carpimini yazdirin

       Scanner scan=new Scanner(System.in);
        System.out.println("Ondalikli sayi girin");
        double dbl=scan.nextDouble();
        System.out.println("Tam sayi girin");
        int myInt= scan.nextInt();

        System.out.println("İki sayinin toplami : " + dbl+myInt);
        System.out.println("iki sayinin carpimi : " + dbl*myInt);


    }
}
