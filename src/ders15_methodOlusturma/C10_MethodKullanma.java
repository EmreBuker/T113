package ders15_methodOlusturma;

import java.util.Scanner;

public class C10_MethodKullanma {
    public static void main(String[] args) {

        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin
        Scanner scan=new Scanner(System.in);
        System.out.println("10'dan kucuk 2 adet pozitif tamsayi girin");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        int sonuc= C08_Faktoryel.faktoryelHesapla(sayi1)+
               C08_Faktoryel.faktoryelHesapla(sayi2);

        System.out.println(sonuc);


    }
}
